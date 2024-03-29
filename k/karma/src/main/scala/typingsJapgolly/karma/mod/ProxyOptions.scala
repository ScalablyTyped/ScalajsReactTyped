package typingsJapgolly.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
  /**
    * Whether or not the proxy should override the Host header using the host from the target
    * @defult false
    */
  var changeOrigin: js.UndefOr[Boolean] = js.undefined
  
  /** The target url or path (mandatory) */
  var target: String
}
object ProxyOptions {
  
  inline def apply(target: String): ProxyOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  extension [Self <: ProxyOptions](x: Self) {
    
    inline def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
    
    inline def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
