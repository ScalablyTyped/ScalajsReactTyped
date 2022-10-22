package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomCallback event.
  */
trait ASPxClientCustomDataCallbackEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing, related to the CustomCallback event.
    */
  var result: String
}
object ASPxClientCustomDataCallbackEventArgs {
  
  inline def apply(result: String): ASPxClientCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomDataCallbackEventArgs]
  }
  
  extension [Self <: ASPxClientCustomDataCallbackEventArgs](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
