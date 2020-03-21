package typingsJapgolly.rcTimePicker.mod

import typingsJapgolly.rcTimePicker.PartialTimePickerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[PartialTimePickerProps, js.Object, js.Any] {
  def close(): Unit = js.native
  def isAM(): Boolean = js.native
}

