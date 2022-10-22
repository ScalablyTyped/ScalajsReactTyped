package typingsJapgolly.amapJsApi.AMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBounds extends StObject {
  
  var bounds: js.Array[LngLat]
  
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean
  
  def getCenter(): LngLat
  
  // internal
  def toBounds(): Bounds
}
object ArrayBounds {
  
  inline def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: CallbackTo[LngLat],
    toBounds: CallbackTo[Bounds]
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = getCenter.toJsFn, toBounds = toBounds.toJsFn)
    __obj.asInstanceOf[ArrayBounds]
  }
  
  extension [Self <: ArrayBounds](x: Self) {
    
    inline def setBounds(value: js.Array[LngLat]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LngLat*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setContains(value: LocationValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: CallbackTo[LngLat]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setToBounds(value: CallbackTo[Bounds]): Self = StObject.set(x, "toBounds", value.toJsFn)
  }
}
