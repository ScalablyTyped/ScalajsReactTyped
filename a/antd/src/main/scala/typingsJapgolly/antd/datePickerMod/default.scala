package typingsJapgolly.antd.datePickerMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.antd.PickPickPickerDatePropsMo
import typingsJapgolly.antd.PickPickPickerTimePropsMo
import typingsJapgolly.antd.generatePickerMod.PickerProps
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker", JSImport.Default)
@js.native
class default protected ()
  extends Component[PickerProps[Moment], js.Any, js.Any] {
  def this(props: PickerProps[Moment]) = this()
  def this(props: PickerProps[Moment], context: js.Any) = this()
}

@JSImport("antd/lib/date-picker", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* props */ PickerProps[Moment], Component[PickerProps[Moment], js.Any, js.Any]]
     with Instantiable2[
      /* props */ PickerProps[Moment], 
      /* context */ js.Any, 
      Component[PickerProps[Moment], js.Any, js.Any]
    ] {
  var MonthPicker: ComponentClassP[PickPickPickerDatePropsMo with js.Object] = js.native
  var RangePicker: ComponentClassP[typingsJapgolly.antd.generatePickerMod.RangePickerProps[Moment] with js.Object] = js.native
  var TimePicker: ComponentClassP[PickPickPickerTimePropsMo with js.Object] = js.native
  var WeekPicker: ComponentClassP[PickPickPickerDatePropsMo with js.Object] = js.native
  var YearPicker: ComponentClassP[PickPickPickerDatePropsMo with js.Object] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[PickerProps[Moment]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], _]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], _]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[PickerProps[Moment]]] = js.native
}

