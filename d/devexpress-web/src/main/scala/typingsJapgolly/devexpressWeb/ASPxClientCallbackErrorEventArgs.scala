package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to server-side errors that occured during callback processing.
  */
trait ASPxClientCallbackErrorEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    */
  var handled: Boolean
  
  /**
    * Gets the error message that describes the server error that occurred.
    */
  var message: String
}
object ASPxClientCallbackErrorEventArgs {
  
  inline def apply(handled: Boolean, message: String): ASPxClientCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCallbackErrorEventArgs]
  }
  
  extension [Self <: ASPxClientCallbackErrorEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
