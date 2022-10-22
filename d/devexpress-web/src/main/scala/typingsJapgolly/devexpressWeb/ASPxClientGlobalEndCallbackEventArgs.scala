package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
trait ASPxClientGlobalEndCallbackEventArgs
  extends StObject
     with ASPxClientEndCallbackEventArgs {
  
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl
}
object ASPxClientGlobalEndCallbackEventArgs {
  
  inline def apply(command: String, control: ASPxClientControl): ASPxClientGlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEndCallbackEventArgs]
  }
  
  extension [Self <: ASPxClientGlobalEndCallbackEventArgs](x: Self) {
    
    inline def setControl(value: ASPxClientControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
