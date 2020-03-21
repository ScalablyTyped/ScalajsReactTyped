package typingsJapgolly.rcPicker

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcPicker.pickerMod.Picker
import typingsJapgolly.rcPicker.pickerPanelMod.PickerPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RangePicker[DateType] ()
    extends typingsJapgolly.rcPicker.rangePickerMod.RangePicker[DateType]
  
  @js.native
  class default[DateType] () extends Picker[DateType]
  
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): Element = js.native
}

