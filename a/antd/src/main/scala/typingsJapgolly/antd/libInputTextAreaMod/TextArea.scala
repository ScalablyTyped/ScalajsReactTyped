package typingsJapgolly.antd.libInputTextAreaMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.Anon_Resizing
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  @JSName("state")
  var state_TextArea: Anon_Resizing = js.native
  var textAreaRef: js.Any = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextArea(): Unit = js.native
  def focus(): Unit = js.native
  def handleKeyDown(e: ReactKeyboardEventFrom[HTMLTextAreaElement]): Unit = js.native
  def handleTextareaChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
  def renderTextArea(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextAreaRef(textArea: HTMLTextAreaElement): Unit = js.native
}

