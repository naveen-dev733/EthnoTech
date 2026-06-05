class Node 
{
    String url;
    Node next;
    Node(String url) 
    {
        this.url = url;
        this.next = null;
    }
}
class BrowserHistory 
{
    private Node head = null;
    private int pageCount = 0;
    public void visit(String url) 
    {
        Node newNode = new Node(url);
        newNode.next = head;
        head = newNode;
        pageCount++;
        System.out.println("Visited: " + url);
    }
    public void displayHistory() 
    {
        if (head == null) 
	{
            System.out.println("History is empty.");
            return;
        }
        Node current = head;
        System.out.print("History: ");
        while (current != null)
	{
            System.out.print(current.url + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public boolean searchPage(String url) 
    {
        Node current = head;
        while (current != null) 
	{
            if (current.url.equalsIgnoreCase(url)) 
	    {
                System.out.println("Found: " + url);
                return true;
            }
            current = current.next;
        }
        System.out.println("Page not found: " + url);
        return false;
    }
    public void deletePage(String url) 
    {
        if (head == null) return;
        if (head.url.equalsIgnoreCase(url)) 
	{
            head = head.next;
            pageCount--;
            System.out.println("Deleted: " + url);
            return;
        }
        Node current = head;
        while (current.next != null) 
	{
            if (current.next.url.equalsIgnoreCase(url)) 
	    {
                current.next = current.next.next;
                pageCount--;
                System.out.println("Deleted: " + url);
                return;
            }
            current = current.next;
        }
    }
    public int getTotalPages() 
    {
        return pageCount;
    }
    public static void main(String[] args) 
    {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");
        browser.displayHistory();
        System.out.println("Total Pages: " + browser.getTotalPages());
        browser.searchPage("github.com");
        browser.deletePage("github.com");
        browser.displayHistory();
        System.out.println("Total Pages: " + browser.getTotalPages());
    }
}
