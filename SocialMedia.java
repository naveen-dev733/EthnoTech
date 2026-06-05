class Post
{
    String content;
    Post prev, next;
    public Post(String content)
    {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
class SocialMedia
{
    Post current;
    public void nextPost()
    {
        if(current != null && current.next != null)
        {
            current = current.next;
            System.out.println("View: " + current.content);
        }
        else
        {
            System.out.println("End of the feed");
        }
    }
    public void prevPost()
    {
        if(current != null && current.prev != null)
        {
            current = current.prev;
            System.out.println("View: " + current.content);
        }
        else
        {
            System.out.println("Start of the feed");
        }
    }
    public void deletePost()
    {
        if(current == null)
        {
            return;
        }
        System.out.println("Deleted: " + current.content);

        if(current.prev != null)
        {
            current.prev.next = current.next;
        }

        if(current.next != null)
        {
            current.next.prev = current.prev;
        }
        current = (current.next != null) ? current.next : current.prev;
    }
    public void insertisSponsored(String content)
    {
        if(current == null)
        {
            return;
        }
        Post ad = new Post("AD: " + content);
        Post oldNext = current.next;
        current.next = ad;
        ad.prev = current;
        ad.next = oldNext;
        if(oldNext != null)
        {
            oldNext.prev = ad;
        }
        System.out.println("Sponsored ad posted next");
    }
    public static void main(String arg[])
    {
        SocialMedia feed = new SocialMedia();
        Post p1 = new Post("meme");
        Post p2 = new Post("photo");
        p1.next = p2;
        p2.prev = p1;
        feed.current = p1;
        System.out.println("Start: " + feed.current.content);
        feed.insertisSponsored("Buy shoes!");
        feed.nextPost();
        feed.deletePost();
    }
}