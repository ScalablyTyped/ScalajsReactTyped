package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: Boolean
  var onChange: js.Function0[Null]
  var onPanelChange: js.Function0[Null]
  var onSelect: js.Function0[Null]
}

object Anon_Fullscreen {
  @scala.inline
  def apply(
    fullscreen: Boolean,
    onChange: CallbackTo[Null],
    onPanelChange: CallbackTo[Null],
    onSelect: CallbackTo[Null]
  ): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onPanelChange")(onPanelChange.toJsFn)
    __obj.updateDynamic("onSelect")(onSelect.toJsFn)
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

