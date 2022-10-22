package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events related to the beginning of a callback processing round trip.
  */
trait ASPxClientBeginCallbackEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  var command: String
}
object ASPxClientBeginCallbackEventArgs {
  
  inline def apply(command: String): ASPxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientBeginCallbackEventArgs]
  }
  
  extension [Self <: ASPxClientBeginCallbackEventArgs](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
