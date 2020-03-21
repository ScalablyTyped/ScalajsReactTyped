package typingsJapgolly.reactDayPicker

import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPicker", JSImport.Namespace)
@js.native
object dayPickerMod extends js.Object {
  @js.native
  trait DayPicker
    extends Component[DayPickerProps, js.Any, js.Any] {
    val dayPicker: HTMLDivElement = js.native
    def focus(): Unit = js.native
    def showMonth(month: js.Date): Unit = js.native
    def showNextMonth(): Unit = js.native
    def showNextYear(): Unit = js.native
    def showPreviousMonth(): Unit = js.native
    def showPreviousYear(): Unit = js.native
  }
  
  @js.native
  class default () extends DayPicker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: AnonAddDayToRange = js.native
    var DayModifiers: typingsJapgolly.reactDayPicker.commonMod.DayModifiers = js.native
    var LocaleUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
    var Modifiers: typingsJapgolly.reactDayPicker.commonMod.Modifiers = js.native
    var ModifiersUtils: AnonDayMatchesModifier = js.native
    var VERSION: String = js.native
  }
  
}

