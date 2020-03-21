package typingsJapgolly.grommet.radioButtonGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.grommet.AnonDisabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var name: String
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
  var options: js.Array[String | AnonDisabled]
  var value: js.UndefOr[String] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: String,
    options: js.Array[String | AnonDisabled],
    onChange: /* event */ ReactEventFrom[HTMLInputElement] => Callback = null,
    value: String = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}

