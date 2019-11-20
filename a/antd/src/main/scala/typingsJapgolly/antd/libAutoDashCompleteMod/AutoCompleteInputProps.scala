package typingsJapgolly.antd.libAutoDashCompleteMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteInputProps extends js.Object {
  var onChange: js.UndefOr[FormEventHandler[_]] = js.undefined
  var value: js.Any
}

object AutoCompleteInputProps {
  @scala.inline
  def apply(value: js.Any, onChange: ReactEventFrom[js.Any with Element] => Callback = null): AutoCompleteInputProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    __obj.asInstanceOf[AutoCompleteInputProps]
  }
}

