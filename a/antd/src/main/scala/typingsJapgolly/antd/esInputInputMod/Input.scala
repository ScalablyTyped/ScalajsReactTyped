package typingsJapgolly.antd.esInputInputMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.ChangeEvent
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  def focus(): Unit = js.native
  def getInputClassName(prefixCls: String): String = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): Null = js.native
  def handleChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLInputElement]): Unit = js.native
  def handleReset(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderClearIcon(prefixCls: String): Element | Null = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderInput(prefixCls: String): Element = js.native
  def renderLabeledIcon(prefixCls: String, children: japgolly.scalajs.react.raw.React.Element): Element = js.native
  def renderLabeledInput(prefixCls: String, children: japgolly.scalajs.react.raw.React.Element): Element = js.native
  def renderSuffix(prefixCls: String): Element | Null = js.native
  def saveInput(node: HTMLInputElement): Unit = js.native
  def select(): Unit = js.native
  def setValue(value: String, e: ChangeEvent[typingsJapgolly.std.HTMLInputElement]): Unit = js.native
  def setValue(value: String, e: ChangeEvent[typingsJapgolly.std.HTMLInputElement], callback: js.Function0[Unit]): Unit = js.native
  def setValue(
    value: String,
    e: typingsJapgolly.react.reactMod.MouseEvent[typingsJapgolly.std.HTMLElement, MouseEvent]
  ): Unit = js.native
  def setValue(
    value: String,
    e: typingsJapgolly.react.reactMod.MouseEvent[typingsJapgolly.std.HTMLElement, MouseEvent],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

