package typingsJapgolly.rcPicker.rangePickerMod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.rcPicker.pickerMod.PickerRefConfig
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangePicker[DateType]
  extends Component[RangePickerProps[DateType], js.Object, js.Any] {
  var pickerRef: RefHandle[PickerRefConfig] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

