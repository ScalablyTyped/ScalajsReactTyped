package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale
  extends StObject
     with EventBindable
     with MapControl {
  
  var offset: Pixel
  
  var position: String
}
object Scale {
  
  inline def apply(
    hide: Callback,
    off: (String, EventCallback) => Callback,
    offset: Pixel,
    on: (String, EventCallback) => Callback,
    position: String,
    show: Callback
  ): Scale = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), offset = offset.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), position = position.asInstanceOf[js.Any], show = show.toJsFn)
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
