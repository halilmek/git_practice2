package us100;

/*
## Recap Project

1. create a java project called `git_practice2`
2. create a `.gitignore` file with below content
   ```
   .idea
   out
   *.iml
   ```
3. create a package under `src` folder called `us100` and create a class called
`TestCase001`
4. Enable version control to **create git repository** for this project
5. Make a initial commit
6. create a main method and add some print
7. Make another commit with proper commit message
8. Share project on Github (ONE TIME!!!!)
9. Create a new class called `TestCase002` and make a commit
with proper commit message
10. Add 3 more changes and make 3 more individual commits
11. and push your changes to remote repository



`git rm --cached git_practice2.iml`


## How to Remove version control from The project you did not
intented to keep track of.

1. Create a new project called `DoNotTrack`
2. Create `.gitignore` file at root directory
3. Create a java class under `src` called `WoodenSpoon`
4. Enable version control to create new repo
5. Make 4 commits
6. Oops did not actually want to track this project
7. All you have to do is
   1. remove `.git` folder to remove the local repo
   2. let intelliJ know this is not a git repo anymore

 */

public class TestCase001 {

    public static void main(String[] args) {

        Sphere sep1 = new Sphere(13.0);
        System.out.println(sep1.volume());
    }
}
