package typingsJapgolly.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccuracy extends js.Object {
  /**
    * 位置的精确度
    */
  var accuracy: Double
  /**
    * 高度，单位 m
    */
  var altitude: Double
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: Double
  /**
    * 纬度，范围为 -90~90，负数表示南纬
    */
  var latitude: Double
  /**
    * 经度，范围为 -180~180，负数表示西经
    */
  var longitude: Double
  /**
    * 速度，单位 m/s
    */
  var speed: Double
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: Double
}

object AnonAccuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    horizontalAccuracy: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    verticalAccuracy: Double
  ): AnonAccuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], verticalAccuracy = verticalAccuracy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccuracy]
  }
}

