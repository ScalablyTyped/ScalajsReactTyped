package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRequestHandler extends StObject {
  
  /** Allow the permission request. */
  def allow(): Unit
  
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): Unit
}
object PermissionRequestHandler {
  
  inline def apply(allow: Callback, deny: Callback): PermissionRequestHandler = {
    val __obj = js.Dynamic.literal(allow = allow.toJsFn, deny = deny.toJsFn)
    __obj.asInstanceOf[PermissionRequestHandler]
  }
  
  extension [Self <: PermissionRequestHandler](x: Self) {
    
    inline def setAllow(value: Callback): Self = StObject.set(x, "allow", value.toJsFn)
    
    inline def setDeny(value: Callback): Self = StObject.set(x, "deny", value.toJsFn)
  }
}
