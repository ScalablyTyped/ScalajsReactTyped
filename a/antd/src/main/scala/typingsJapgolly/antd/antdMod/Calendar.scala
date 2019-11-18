package typingsJapgolly.antd.antdMod

import typingsJapgolly.antd.Anon_ArgsClassName
import typingsJapgolly.antd.Anon_Fullscreen
import typingsJapgolly.antd.libCalendarMod.CalendarProps
import typingsJapgolly.antd.libCalendarMod.CalendarState
import typingsJapgolly.antd.libCalendarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Calendar")
@js.native
class Calendar protected () extends default {
  def this(props: CalendarProps) = this()
}

/* static members */
@JSImport("antd", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaultProps: Anon_Fullscreen = js.native
  var propTypes: Anon_ArgsClassName = js.native
  def getDerivedStateFromProps(nextProps: CalendarProps): CalendarState | Null = js.native
}

