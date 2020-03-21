package typingsJapgolly.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResult extends js.Object {
  /**
    * 地理编码结果
    */
  var geocodes: js.Array[Geocode]
  /**
    * 状态说明
    */
  var info: String
  /**
    * 地理编码结果数目
    */
  var resultNum: String
}

object GeocodeResult {
  @scala.inline
  def apply(geocodes: js.Array[Geocode], info: String, resultNum: String): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeocodeResult]
  }
}

