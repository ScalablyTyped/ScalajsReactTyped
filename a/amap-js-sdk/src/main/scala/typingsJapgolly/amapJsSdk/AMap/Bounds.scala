package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地物对象的经纬度矩形范围
  */
trait Bounds extends StObject {
  
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  def contains(point: LngLat): Boolean
  
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat
  
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat
  
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat
}
object Bounds {
  
  inline def apply(
    contains: LngLat => Boolean,
    getCenter: CallbackTo[LngLat],
    getNorthEast: CallbackTo[LngLat],
    getSouthWest: CallbackTo[LngLat]
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = getCenter.toJsFn, getNorthEast = getNorthEast.toJsFn, getSouthWest = getSouthWest.toJsFn)
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setContains(value: LngLat => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: CallbackTo[LngLat]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetNorthEast(value: CallbackTo[LngLat]): Self = StObject.set(x, "getNorthEast", value.toJsFn)
    
    inline def setGetSouthWest(value: CallbackTo[LngLat]): Self = StObject.set(x, "getSouthWest", value.toJsFn)
  }
}
