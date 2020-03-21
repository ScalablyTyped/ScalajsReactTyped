package typingsJapgolly.isTrademarked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrademarkedData extends js.Object {
  var description: String
  var reg: js.Date
  var serviceCode: String
  var sn: String
  var wordmark: String
}

object TrademarkedData {
  @scala.inline
  def apply(description: String, reg: js.Date, serviceCode: String, sn: String, wordmark: String): TrademarkedData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], wordmark = wordmark.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrademarkedData]
  }
}

