package typingsJapgolly.antd.esMod

import typingsJapgolly.antd.Anon_ArgsClassName
import typingsJapgolly.antd.Anon_Fullscreen
import typingsJapgolly.antd.esCalendarMod.CalendarProps
import typingsJapgolly.antd.esCalendarMod.CalendarState
import typingsJapgolly.antd.esCalendarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Calendar")
@js.native
class Calendar protected () extends default {
  def this(props: CalendarProps) = this()
}

/* static members */
@JSImport("antd/es", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaultProps: Anon_Fullscreen = js.native
  var propTypes: Anon_ArgsClassName = js.native
  def getDerivedStateFromProps(nextProps: CalendarProps): CalendarState | Null = js.native
}

