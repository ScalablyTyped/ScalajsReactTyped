package typingsJapgolly.blueprintjsDatetime

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDayPicker.propsMod.NavbarElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", JSImport.Namespace)
@js.native
object datePickerNavbarMod extends js.Object {
  @js.native
  class DatePickerNavbar ()
    extends Component[IDatePickerNavbarProps, js.Object, js.Any] {
    var handleNextClick: js.Any = js.native
    var handlePreviousClick: js.Any = js.native
  }
  
  @js.native
  trait IDatePickerNavbarProps extends NavbarElementProps {
    var hideLeftNavButton: js.UndefOr[Boolean] = js.native
    var hideRightNavButton: js.UndefOr[Boolean] = js.native
    var maxDate: js.Date = js.native
    var minDate: js.Date = js.native
  }
  
}

