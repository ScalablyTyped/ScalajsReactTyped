package typingsJapgolly.reactDashBigDashCalendar

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var header: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(
    event: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    header: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Event]
  }
}

