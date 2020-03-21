package typingsJapgolly.vue2Datepicker.mod.Datepicker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shortcuts extends js.Object {
  var text: String
  def onClick(): js.Any
}

object Shortcuts {
  @scala.inline
  def apply(onClick: CallbackTo[js.Any], text: String): Shortcuts = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[Shortcuts]
  }
}

