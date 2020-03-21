package typingsJapgolly.antd.textAreaMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typingsJapgolly.antd.clearableLabeledInputMod.default = js.native
  var resizableTextArea: typingsJapgolly.antd.resizableTextAreaMod.default = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderTextArea(prefixCls: String): Element = js.native
  def saveClearableInput(clearableInput: typingsJapgolly.antd.clearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(resizableTextArea: typingsJapgolly.antd.resizableTextAreaMod.default): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

