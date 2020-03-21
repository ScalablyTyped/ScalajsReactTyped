package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSettings extends ISettings {
  var DefaultSelect: js.Array[String]
  var Select: js.Array[String]
}

object SelectSettings {
  @scala.inline
  def apply(
    DefaultSelect: js.Array[String],
    Select: js.Array[String],
    isSet: CallbackTo[Boolean],
    reset: Callback
  ): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[SelectSettings]
  }
}

