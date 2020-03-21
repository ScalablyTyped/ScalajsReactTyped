package typingsJapgolly.formik

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var value: js.Any
  def onBlur(e: js.Any): Unit
  def onChange(e: ReactEventFrom[Element]): Unit
}

object AnonName {
  @scala.inline
  def apply(
    name: String,
    onBlur: js.Any => Callback,
    onChange: ReactEventFrom[Element] => Callback,
    value: js.Any
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: js.Any) => onBlur(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    __obj.asInstanceOf[AnonName]
  }
}

