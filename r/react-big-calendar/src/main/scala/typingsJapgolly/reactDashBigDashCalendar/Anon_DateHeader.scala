package typingsJapgolly.reactDashBigDashCalendar

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateHeader extends js.Object {
  var dateHeader: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var header: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
}

object Anon_DateHeader {
  @scala.inline
  def apply(
    dateHeader: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    event: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    header: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null
  ): Anon_DateHeader = {
    val __obj = js.Dynamic.literal()
    if (dateHeader != null) __obj.updateDynamic("dateHeader")(dateHeader.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateHeader]
  }
}

