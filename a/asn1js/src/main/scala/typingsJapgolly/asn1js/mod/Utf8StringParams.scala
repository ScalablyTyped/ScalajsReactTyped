package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utf8StringParams extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object Utf8StringParams {
  @scala.inline
  def apply(value: String = null): Utf8StringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utf8StringParams]
  }
}

