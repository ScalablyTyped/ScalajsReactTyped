package typingsJapgolly.harmonyProxy

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Proxy[T] extends StObject {
    
    var proxy: T
    
    def revoke(): Unit
  }
  object Proxy {
    
    inline def apply[T](proxy: T, revoke: Callback): Proxy[T] = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = revoke.toJsFn)
      __obj.asInstanceOf[Proxy[T]]
    }
    
    extension [Self <: Proxy[?], T](x: Self & Proxy[T]) {
      
      inline def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setRevoke(value: Callback): Self = StObject.set(x, "revoke", value.toJsFn)
    }
  }
}
