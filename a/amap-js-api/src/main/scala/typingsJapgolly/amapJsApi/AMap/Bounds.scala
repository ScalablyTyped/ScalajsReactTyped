package typingsJapgolly.amapJsApi.AMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  /**
    * 指定点坐标是否在矩形范围内
    * @param point 制定坐标
    */
  def contains(point: LocationValue): Boolean
  
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat
  
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat
  
  /**
    * 获取西北角坐标
    */
  def getNorthWest(): LngLat
  
  /**
    * 获取东南角坐标
    */
  def getSouthEast(): LngLat
  
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat
}
object Bounds {
  
  inline def apply(
    contains: LocationValue => Boolean,
    getCenter: CallbackTo[LngLat],
    getNorthEast: CallbackTo[LngLat],
    getNorthWest: CallbackTo[LngLat],
    getSouthEast: CallbackTo[LngLat],
    getSouthWest: CallbackTo[LngLat]
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = getCenter.toJsFn, getNorthEast = getNorthEast.toJsFn, getNorthWest = getNorthWest.toJsFn, getSouthEast = getSouthEast.toJsFn, getSouthWest = getSouthWest.toJsFn)
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setContains(value: LocationValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: CallbackTo[LngLat]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetNorthEast(value: CallbackTo[LngLat]): Self = StObject.set(x, "getNorthEast", value.toJsFn)
    
    inline def setGetNorthWest(value: CallbackTo[LngLat]): Self = StObject.set(x, "getNorthWest", value.toJsFn)
    
    inline def setGetSouthEast(value: CallbackTo[LngLat]): Self = StObject.set(x, "getSouthEast", value.toJsFn)
    
    inline def setGetSouthWest(value: CallbackTo[LngLat]): Self = StObject.set(x, "getSouthWest", value.toJsFn)
  }
}
