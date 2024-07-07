
public class DebugDetails {
	Eclipse Debugging | Mr Raghu (Naresh i Technologies)
	Debuggig java Programme


	>>if there is no braeak points then run a java programme and debug a java programme there is no differenece ,
	  they will beahve same 

	>> Executing the code step by step  (Block by Block or method by method)

	To run the programme use >> ctrl +F11 or use run from beside window help

	Run Programme as Debug it will run the programme normally unless u use  some breakpoints

	use some breakpoints befor run as debug for java proramme

	Run the programme >ctrl+F11
	Debugg the programme >F11

	Breakpoint :?  please wait here  till  my instruction ,or pause at given point
	               execution start(pause) point 

	              to create(remove) breakpoint at any line=ctrl+Shift+b
	              or right click on that line >select toggle breakpoint

	  Start Debug :  run as Debug  || F11  || Fn+F11;
	      
	       F5>(step into || go inside the method  then do F6 to execute the method line by line )

	       F7(step return || step return from function(method)|| come back to method call from body)

	       F6>(step over)  
	        (it will execute the  whole  programme line by line (the way pragramme executed) )
	        just keep one breakpoints from where programme start  after that it will go line by line (step by step)
	        >execute current line and go to next line
	        if a variable color change to yellow  ,means it will value got modified(from last step step to just now step )

	      F8(Resume || Stop || move to next  nearest breakpoints(according to java JVM  programme execution or java workflow for programme execution))
	      it will lead to  from current breakpoint  to next breakpoints ,if no breakpoint from current breakpoint , then it will 
	      execute the programme and stop !!


	      >>Suppose you have 8 breakpoints in java programme but after fourth breakpoint  execution  you got the problem
	       now you want to stop the programme means dont need to go next breakpoint then there is method called 
	       >>Skip All Breakpoint(ctrl+Alt+B)
	       it will execute programme normally without pause at other reamaining breakpoints
	       select this coomand and do F8 programme will executed normally 


	  >> To evaluate some expression whether it is true or false ,select the expression and do (Ctrl+shift+i)
	    select the expression  right click, then do inspecct

	  
	=============================
	Debug Spring Boot App
	add some breakpoints first 
	then do run jva application as debug
	now hit the endpoint for given API and trace accordingly




}
