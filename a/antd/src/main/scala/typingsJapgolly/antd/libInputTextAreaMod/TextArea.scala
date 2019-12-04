package typingsJapgolly.antd.libInputTextAreaMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var clearableInput: typingsJapgolly.antd.libInputClearableLabeledInputMod.default = js.native
  var resizableTextArea: typingsJapgolly.antd.libInputResizableTextAreaMod.default = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLTextAreaElement]): Unit = js.native
  def handleReset(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderComponent(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderTextArea(prefixCls: String): Element = js.native
  def saveClearableInput(clearableInput: typingsJapgolly.antd.libInputClearableLabeledInputMod.default): Unit = js.native
  def saveTextArea(resizableTextArea: typingsJapgolly.antd.libInputResizableTextAreaMod.default): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

