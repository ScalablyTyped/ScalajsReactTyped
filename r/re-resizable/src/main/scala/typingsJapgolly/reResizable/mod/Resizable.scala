package typingsJapgolly.reResizable.mod

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reResizable.AnonEnable
import typingsJapgolly.reResizable.AnonHeight
import typingsJapgolly.reResizable.AnonHeightWidth
import typingsJapgolly.reResizable.AnonMaxHeight
import typingsJapgolly.reResizable.AnonNewHeight
import typingsJapgolly.reResizable.AnonWidth
import typingsJapgolly.reResizable.reResizableStrings.column
import typingsJapgolly.reResizable.reResizableStrings.height
import typingsJapgolly.reResizable.reResizableStrings.row
import typingsJapgolly.reResizable.reResizableStrings.width
import typingsJapgolly.reResizable.resizerMod.Direction
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.NativeMouseEvent
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-resizable", "Resizable")
@js.native
class Resizable protected ()
  extends Component[ResizableProps, State, js.Any] {
  def this(props: ResizableProps) = this()
  var flexDir: js.UndefOr[row | column] = js.native
  var parentLeft: Double = js.native
  var parentTop: Double = js.native
  var ratio: Double = js.native
  var resizable: HTMLDivElement | Null = js.native
  var resizableLeft: Double = js.native
  var resizableTop: Double = js.native
  var targetLeft: Double = js.native
  var targetTop: Double = js.native
  def base(): js.UndefOr[HTMLElement] = js.native
  def bindEvents(): Unit = js.native
  def calculateNewMaxFromBoundary(): AnonMaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double): AnonMaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): AnonMaxHeight = js.native
  def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: AnonHeightWidth, min: AnonHeightWidth): AnonNewHeight = js.native
  def calculateNewSizeFromDirection(clientX: Double, clientY: Double): AnonNewHeight = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizable(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizable(): Unit = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: String, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: Double, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: String, kind: width): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: Double, kind: width): Double | String = js.native
  def getParentSize(): AnonWidth = js.native
  def onMouseMove(event: MouseEvent): Unit = js.native
  def onMouseMove(event: TouchEvent): Unit = js.native
  def onMouseUp(event: MouseEvent): Unit = js.native
  def onMouseUp(event: TouchEvent): Unit = js.native
  def onResizeStart(
    event: typingsJapgolly.react.mod.MouseEvent[typingsJapgolly.std.HTMLDivElement, NativeMouseEvent],
    direction: Direction
  ): Unit = js.native
  def onResizeStart(
    event: typingsJapgolly.react.mod.TouchEvent[typingsJapgolly.std.HTMLDivElement],
    direction: Direction
  ): Unit = js.native
  def parentNode(): HTMLElement | Null = js.native
  def propsSize(): Size = js.native
  def ref(): Unit = js.native
  def ref(c: HTMLDivElement): Unit = js.native
  def renderResizer(): Element | Null = js.native
  def setBoundingClientRect(): Unit = js.native
  def size(): NumberSize = js.native
  def sizeStyle(): AnonHeight = js.native
  def unbindEvents(): Unit = js.native
  def updateSize(size: Size): Unit = js.native
}

/* static members */
@JSImport("re-resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  var defaultProps: AnonEnable = js.native
}

