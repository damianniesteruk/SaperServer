package saperserver.Controller.Network.Interpreters;

import saperserver.Controller.Network.Client;
import saperserver.Controller.Network.Interpreter.Interpreter;

import saperserver.Controller.Network.Interpreters.Events.LoginEvent;

/**
 * @author Damian
 */
public class LoginInterpreter extends Interpreter {
    
    public LoginInterpreter( Client client ) {
        
        super();
        
        event = new LoginEvent( client );
    }
}
