package typingsJapgolly.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeader extends js.Object {
  var binaryValue: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object HttpHeader {
  @scala.inline
  def apply(name: String, binaryValue: scala.scalajs.js.typedarray.ArrayBuffer = null, value: String = null): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (binaryValue != null) __obj.updateDynamic("binaryValue")(binaryValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeader]
  }
}

