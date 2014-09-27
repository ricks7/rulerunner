Rule Runner Demo:

You are being asked to code a simple rule engine demo that performs the following tasks:
*  Accept a series of integers as command-line arguments
*  Run a set of rules against the integers
*  For each rule, output to standard out a passed or failed message
*  If all rules pass, output to standard out a message saying all rules passed
 
Eventually, the system is planned to evolve to more complex rules, but the initial set of rules are very simple:
*  Rule A : If any two sequential integers in the sequence add up to 1000 or greater, the rule is "passed". If not, the rule is "failed".
*  Rule B : If any integer in the sequence is at least 500 greater than the one previous to it in the sequence, the rule is "passed", else it is "failed".
*  Rule C : If the average of all the integers in the sequence is 500 or greater the rule is "passed", else it is "failed".
 
Notes:
You will implement these three rules as part of this demo, but keep in mind that additional rules will be added later. You may accept it as given that rules do not reference each other, each rule stands on its own. The order that the rules run in is unimportant as long as all of them run.

You may use any IDE, editor, compiler or combination you like, but all code must be in an object oriented programming language, such as Java, C#, C++, etc...  Feel free to use any web resources, books or other tools or information sources that will help you complete the task more quickly.

For the purposes of this demo, you don't need to provide any namespace for your classes, they may all go in the default package.
 
Example use of RuleRunner:
  root$ RuleRunner 100 50 30 50 60 20 5000
  
  Rule RuleC passed.
  
  Rule RuleB passed.
  
  Rule RuleA passed.
  
  ALL rules passed.
  
  root$:

Hints:
If you need more than a total of 500 lines of code to implement this, you are thinking too hard or going overboard in some fashion. Likewise, if you need fewer than 100 lines you may not be using best practices. Don't, for example, go nuts and implement a Domain Specific Language for the rules. Keep it simple and direct, while following best practices as you see them.
Good Luck!


PS. Feel free to email either ricksoza@gmail.com if you have any questions about this spec or the system you are implementing.
