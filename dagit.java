
package question.pkg5;

import java.util.Scanner;
public class Question5 {

    public static void main(String[] args) {

        int f1=0,f2=1,n,next;
        
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number to be calculated");
        n=in.nextInt();
        if(n<0)
       System.out.println("The number must be possitive integer");
        else{
            System.out.print("the fibonacci numbers of the first "+n+" integer numbers are: ");
            for(int i=1;i<=n;i++){
              next=f1+f2;
            f1=f2;
            f2=next;
         System.out.print(f2+",");
        }
            System.out.println();
        }
    }
    
}


     //create a new repository on the command line
//echo "# practiceGit" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Mamii14w/practiceGit.git
//git push -u origin main


     //push an existing repository from the command line
//git remote add origin https://github.com/Mamii14w/practiceGit.git
//git branch -M main
//git push -u origin main