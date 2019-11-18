package typingsJapgolly.antd.esDateDashPickerInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[Moment] = js.undefined
  var defaultValue: js.UndefOr[Moment] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* date */ Moment | Null, /* dateString */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ DatePickerMode, Node]] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object SinglePickerProps {
  @scala.inline
  def apply(
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    onChange: (/* date */ Moment | Null, /* dateString */ String) => Callback = null,
    placeholder: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => CallbackTo[Node] = null,
    value: Moment = null
  ): SinglePickerProps = {
    val __obj = js.Dynamic.literal()
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* date */ typingsJapgolly.moment.momentMod.Moment | scala.Null, t1: /* dateString */ java.lang.String) => onChange(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1((t0: /* mode */ typingsJapgolly.antd.esDateDashPickerInterfaceMod.DatePickerMode) => renderExtraFooter(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinglePickerProps]
  }
}

