package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckSessionOptions
  extends StObject
     with AuthorizeOptions {
  
  /**
    * optional parameter for auth0 to use postMessage to communicate between the silent callback and the SPA.
    */
  var usePostMessage: js.UndefOr[Boolean] = js.undefined
}
object CheckSessionOptions {
  
  inline def apply(): CheckSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSessionOptions]
  }
  
  extension [Self <: CheckSessionOptions](x: Self) {
    
    inline def setUsePostMessage(value: Boolean): Self = StObject.set(x, "usePostMessage", value.asInstanceOf[js.Any])
    
    inline def setUsePostMessageUndefined: Self = StObject.set(x, "usePostMessage", js.undefined)
  }
}
