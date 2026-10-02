package BASICS;

public class methods
{
    //if main function is static then the other functions should also be static
    static void solve()
    {
        for(int i=0;i<=10;i++)
        {
            int ans = 2*i;
            System.out.println(ans);
        }
    }
    static void main()
    {
        System.out.println("hi");
        solve();
        System.out.println("bye");
    }
}
