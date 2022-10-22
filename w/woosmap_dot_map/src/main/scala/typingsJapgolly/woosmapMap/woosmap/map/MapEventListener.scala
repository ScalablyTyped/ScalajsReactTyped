package typingsJapgolly.woosmapMap.woosmap.map

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event listener, created by woosmap.map.event.addListener() and friends.
  */
trait MapEventListener extends StObject {
  
  /**
    * Calling `listener.remove()` is equivalent to `woosmap.map.event.removeListener(listener)`.
    */
  def remove(): Unit
}
object MapEventListener {
  
  inline def apply(remove: Callback): MapEventListener = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[MapEventListener]
  }
  
  extension [Self <: MapEventListener](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
