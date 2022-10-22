package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the corresponding event.
  */
trait ASPxClientGridViewFocusEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets whether the row focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean
}
object ASPxClientGridViewFocusEventArgs {
  
  inline def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientGridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewFocusEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewFocusEventArgs](x: Self) {
    
    inline def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
