package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowMapCache extends StObject {
  
  def add(light: Any, shadowMap: Any): Unit
  
  def clear(): Unit
  
  def destroy(): Unit
  
  def get(device: Any, light: Any): Any
  
  def getKey(light: Any): String
  
  var shadowMapCache: Map[Any, Any]
}
object ShadowMapCache {
  
  inline def apply(
    add: (Any, Any) => Callback,
    clear: Callback,
    destroy: Callback,
    get: (Any, Any) => Any,
    getKey: Any => String,
    shadowMapCache: Map[Any, Any]
  ): ShadowMapCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: Any, t1: Any) => (add(t0, t1)).runNow()), clear = clear.toJsFn, destroy = destroy.toJsFn, get = js.Any.fromFunction2(get), getKey = js.Any.fromFunction1(getKey), shadowMapCache = shadowMapCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowMapCache]
  }
  
  extension [Self <: ShadowMapCache](x: Self) {
    
    inline def setAdd(value: (Any, Any) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGet(value: (Any, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetKey(value: Any => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setShadowMapCache(value: Map[Any, Any]): Self = StObject.set(x, "shadowMapCache", value.asInstanceOf[js.Any])
  }
}
