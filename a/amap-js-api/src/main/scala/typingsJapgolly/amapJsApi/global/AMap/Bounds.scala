package typingsJapgolly.amapJsApi.global.AMap

import typingsJapgolly.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Bounds")
@js.native
/**
  * 地物对象的经纬度矩形范围。
  * @param coords 由西南角，东北角经纬度组成的数组，分别是[西南角经度， 西南角纬度，东北角经度，东北角纬度]
  */
open class Bounds ()
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.Bounds {
  def this(coords: js.Tuple4[Double, Double, Double, Double]) = this()
  /**
    * 地物对象的经纬度矩形范围。
    * @param southWest 西南角经纬度
    * @param northEast 东北角经纬度
    */
  def this(southWest: LocationValue, northEast: LocationValue) = this()
  /**
    * 地物对象的经纬度矩形范围。
    * @param southWestLng 西南角经度
    * @param southWestLat 西南角纬度
    * @param northEastLng 东北角经度
    * @param northEastLat 东北角纬度
    */
  def this(southWestLng: Double, southWestLat: Double, northEastLng: Double, northEastLat: Double) = this()
  
  /**
    * 指定点坐标是否在矩形范围内
    * @param point 制定坐标
    */
  /* CompleteClass */
  override def contains(point: LocationValue): Boolean = js.native
  
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  /* CompleteClass */
  override def getCenter(): typingsJapgolly.amapJsApi.AMap.LngLat = js.native
  
  /**
    * 获取东北角坐标
    */
  /* CompleteClass */
  override def getNorthEast(): typingsJapgolly.amapJsApi.AMap.LngLat = js.native
  
  /**
    * 获取西北角坐标
    */
  /* CompleteClass */
  override def getNorthWest(): typingsJapgolly.amapJsApi.AMap.LngLat = js.native
  
  /**
    * 获取东南角坐标
    */
  /* CompleteClass */
  override def getSouthEast(): typingsJapgolly.amapJsApi.AMap.LngLat = js.native
  
  /**
    * 获取西南角坐标
    */
  /* CompleteClass */
  override def getSouthWest(): typingsJapgolly.amapJsApi.AMap.LngLat = js.native
}
