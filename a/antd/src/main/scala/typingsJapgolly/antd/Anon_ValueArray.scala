package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueArray extends js.Object {
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}

object Anon_ValueArray {
  @scala.inline
  def apply(value: String | Double | js.Array[String] = null): Anon_ValueArray = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ValueArray]
  }
}

