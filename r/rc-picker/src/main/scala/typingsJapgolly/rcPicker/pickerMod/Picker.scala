package typingsJapgolly.rcPicker.pickerMod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picker[DateType]
  extends Component[PickerProps[DateType], js.Object, js.Any] {
  var pickerRef: RefHandle[PickerRefConfig] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

