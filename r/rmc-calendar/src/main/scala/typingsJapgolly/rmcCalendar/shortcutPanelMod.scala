package typingsJapgolly.rmcCalendar

import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Namespace)
@js.native
object shortcutPanelMod extends js.Object {
  @js.native
  trait PropsType extends js.Object {
    var locale: Locale = js.native
    def onSelect(): Unit = js.native
    def onSelect(startDate: js.Date): Unit = js.native
    def onSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
  }
  
  @js.native
  trait ShortcutPanel
    extends Component[PropsType, js.Object, js.Any] {
    def onClick(`type`: String): Unit = js.native
  }
  
  @js.native
  class default () extends ShortcutPanel
  
}

