package typingsJapgolly.antDesignReactNative.pickerMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antDesignReactNative.AnonCascader
import typingsJapgolly.antDesignReactNative.pickerPropsTypeMod.PickerData
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picker
  extends Component[PickerProps, js.Any, js.Any] {
  var scrollValue: js.Any = js.native
  def fixOnOk(cascader: js.Any): Unit = js.native
  def getCascade(
    cascade: js.UndefOr[scala.Nothing],
    data: js.Array[js.Array[PickerData] | PickerData],
    cols: js.UndefOr[scala.Nothing],
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): AnonCascader = js.native
  def getCascade(
    cascade: js.UndefOr[scala.Nothing],
    data: js.Array[js.Array[PickerData] | PickerData],
    cols: Double,
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): AnonCascader = js.native
  def getCascade(
    cascade: Boolean,
    data: js.Array[js.Array[PickerData] | PickerData],
    cols: js.UndefOr[scala.Nothing],
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): AnonCascader = js.native
  def getCascade(
    cascade: Boolean,
    data: js.Array[js.Array[PickerData] | PickerData],
    cols: Double,
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): AnonCascader = js.native
  def getPickerCol(): js.Array[Element] = js.native
  def getSel(): js.UndefOr[String] = js.native
  def onOk(v: js.Any): Unit = js.native
  def onPickerChange(v: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def setCasecadeScrollValue(v: js.Any): Unit = js.native
  def setScrollValue(v: js.Any): Unit = js.native
}

