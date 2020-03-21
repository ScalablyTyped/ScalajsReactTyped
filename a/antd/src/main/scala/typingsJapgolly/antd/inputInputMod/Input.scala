package typingsJapgolly.antd.inputInputMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.antd.sizeContextMod.SizeType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, InputState, js.Any] {
  var clearableInput: typingsJapgolly.antd.clearableLabeledInputMod.default = js.native
  var direction: js.Any = js.native
  var input: HTMLInputElement = js.native
  var onBlur: FocusEventHandler[HTMLInputElement] = js.native
  var onFocus: FocusEventHandler[HTMLInputElement] = js.native
  var removePasswordTimeout: Double = js.native
  def blur(): Unit = js.native
  def clearPasswordValueAttribute(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MInput(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInput(): Unit = js.native
  def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLInputElement]): Unit = js.native
  def handleReset(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def renderInput(prefixCls: String, size: SizeType): Element = js.native
  def saveClearableInput(input: typingsJapgolly.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveInput(input: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

