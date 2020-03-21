package typingsJapgolly.reactFileInput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInputProps extends js.Object {
  var accept: String
  var className: String
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: String
  var placeholder: String
  def onChange(event: ReactEventFrom[Element]): Unit
}

object FileInputProps {
  @scala.inline
  def apply(
    accept: String,
    className: String,
    name: String,
    onChange: ReactEventFrom[Element] => Callback,
    placeholder: String,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): FileInputProps = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInputProps]
  }
}

