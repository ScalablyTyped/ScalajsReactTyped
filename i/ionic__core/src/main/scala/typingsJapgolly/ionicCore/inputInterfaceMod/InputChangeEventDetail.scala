package typingsJapgolly.ionicCore.inputInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object InputChangeEventDetail {
  @scala.inline
  def apply(value: String = null): InputChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputChangeEventDetail]
  }
}

