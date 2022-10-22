package typingsJapgolly.auth0Lock

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAvatarOptions extends StObject {
  
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit
  
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit
}
object Auth0LockAvatarOptions {
  
  inline def apply(
    displayName: (String, Auth0LockAvatarDisplayNameCallback) => Callback,
    url: (String, Auth0LockAvatarUrlCallback) => Callback
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal(displayName = js.Any.fromFunction2((t0: String, t1: Auth0LockAvatarDisplayNameCallback) => (displayName(t0, t1)).runNow()), url = js.Any.fromFunction2((t0: String, t1: Auth0LockAvatarUrlCallback) => (url(t0, t1)).runNow()))
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
  
  extension [Self <: Auth0LockAvatarOptions](x: Self) {
    
    inline def setDisplayName(value: (String, Auth0LockAvatarDisplayNameCallback) => Callback): Self = StObject.set(x, "displayName", js.Any.fromFunction2((t0: String, t1: Auth0LockAvatarDisplayNameCallback) => (value(t0, t1)).runNow()))
    
    inline def setUrl(value: (String, Auth0LockAvatarUrlCallback) => Callback): Self = StObject.set(x, "url", js.Any.fromFunction2((t0: String, t1: Auth0LockAvatarUrlCallback) => (value(t0, t1)).runNow()))
  }
}
