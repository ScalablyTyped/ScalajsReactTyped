package typingsJapgolly.antdMobileRn.abstractPickerMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPicker
  extends Component[AbstractPickerProps, js.Any, js.Any] {
  var scrollValue: js.Any = js.native
  def fixOnOk(cascader: js.Any): Unit = js.native
  def getPickerCol(): js.Array[Element] = js.native
  def getSel(): js.UndefOr[String] = js.native
  def onOk(v: js.Any): Unit = js.native
  def onPickerChange(v: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def setCasecadeScrollValue(v: js.Any): Unit = js.native
  def setScrollValue(v: js.Any): Unit = js.native
}

