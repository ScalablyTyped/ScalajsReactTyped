package typingsJapgolly.antd.libInputInputMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  var clearableInput: typingsJapgolly.antd.libInputClearableLabeledInputMod.default = js.native
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLInputElement]): Unit = js.native
  def handleReset(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def saveClearableInput(input: typingsJapgolly.antd.libInputClearableLabeledInputMod.default): Unit = js.native
  def saveInput(input: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

