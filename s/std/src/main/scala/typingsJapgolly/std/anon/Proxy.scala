package typingsJapgolly.std.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proxy[T /* <: js.Object */] extends StObject {
  
  /* standard es2015.proxy */
  var proxy: T
  
  /* standard es2015.proxy */
  def revoke(): scala.Unit
}
object Proxy {
  
  inline def apply[T /* <: js.Object */](proxy: T, revoke: Callback): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = revoke.toJsFn)
    __obj.asInstanceOf[Proxy[T]]
  }
  
  extension [Self <: Proxy[?], T /* <: js.Object */](x: Self & Proxy[T]) {
    
    inline def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setRevoke(value: Callback): Self = StObject.set(x, "revoke", value.toJsFn)
  }
}
