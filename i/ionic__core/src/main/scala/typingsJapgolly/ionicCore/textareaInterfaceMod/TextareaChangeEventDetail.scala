package typingsJapgolly.ionicCore.textareaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object TextareaChangeEventDetail {
  @scala.inline
  def apply(value: String = null): TextareaChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaChangeEventDetail]
  }
}

