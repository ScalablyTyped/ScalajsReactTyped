package typingsJapgolly.antd.resizableTextAreaMod

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.AnonHeight
import typingsJapgolly.antd.textAreaMod.TextAreaProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableTextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var nextFrameActionId: Double = js.native
  var resizeFrameId: Double = js.native
  var textArea: HTMLTextAreaElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizableTextArea(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizableTextArea(prevProps: TextAreaProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizableTextArea(): Unit = js.native
  def handleResize(size: AnonHeight): Unit = js.native
  def renderTextArea(): Element = js.native
  def resizeOnNextFrame(): Unit = js.native
  def resizeTextarea(): Unit = js.native
  def saveTextArea(textArea: HTMLTextAreaElement): Unit = js.native
}

