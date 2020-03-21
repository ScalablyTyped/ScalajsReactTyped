package typingsJapgolly.reactBigCalendar

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var time: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(
    date: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    event: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    time: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null
  ): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

