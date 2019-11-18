package typingsJapgolly.antd.libCalendarHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderHeader extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  var `type`: String
  var value: Moment
  def onTypeChange(`type`: String): Unit
}

object RenderHeader {
  @scala.inline
  def apply(
    onTypeChange: String => Callback,
    `type`: String,
    value: Moment,
    onChange: /* value */ Moment => Callback = null
  ): RenderHeader = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1((t0: java.lang.String) => onTypeChange(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.moment.momentMod.Moment) => onChange(t0).runNow()))
    __obj.asInstanceOf[RenderHeader]
  }
}

