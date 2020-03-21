package typingsJapgolly.amapJsApiDriving.AMap.Driving

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait District extends js.Object {
  /**
    * 行政区编号
    */
  var adcode: String
  /**
    * 行政区名称
    */
  var name: String
}

object District {
  @scala.inline
  def apply(adcode: String, name: String): District = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[District]
  }
}

