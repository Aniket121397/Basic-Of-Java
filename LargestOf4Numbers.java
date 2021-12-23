class LargestOf4Numbers {
    public static void main(String[] args) {
        int a = 20 , b = 40 , c = 60 , d = 100;
        System.out.println(a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d)));

        
    }
    
}
