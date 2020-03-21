package typingsJapgolly.reactRnd.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reResizable.mod.Resizable
import typingsJapgolly.reResizable.mod.ResizeDirection
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.NativeMouseEvent
import typingsJapgolly.reactRnd.AnonHeight
import typingsJapgolly.reactRnd.AnonHeightWidth
import typingsJapgolly.reactRnd.AnonLeft
import typingsJapgolly.reactRnd.AnonTop
import typingsJapgolly.reactRnd.AnonWidth
import typingsJapgolly.reactRnd.AnonX
import typingsJapgolly.reactRnd.reactRndBooleans.`false`
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-rnd", "Rnd")
@js.native
class Rnd protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var draggable: TODO = js.native
  var offsetFromParent: AnonLeft = js.native
  var resizable: Resizable = js.native
  var resizing: Boolean = js.native
  var resizingPosition: AnonX = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  def getDraggablePosition(): AnonX = js.native
  def getMaxSizesFromProps(): MaxSize = js.native
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  def getParent(): js.Any = js.native
  def getParentSize(): AnonHeight = js.native
  def getSelfElement(): HTMLDivElement | Null = js.native
  def onDrag(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResizeStart(
    e: typingsJapgolly.react.mod.MouseEvent[typingsJapgolly.std.HTMLDivElement, NativeMouseEvent],
    dir: ResizeDirection,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStart(
    e: typingsJapgolly.react.mod.TouchEvent[typingsJapgolly.std.HTMLDivElement],
    dir: ResizeDirection,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def refDraggable(c: js.Any): Unit = js.native
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  def updateOffsetFromParent(): js.UndefOr[AnonTop] = js.native
  def updatePosition(position: Position): Unit = js.native
  def updateSize(size: AnonHeightWidth): Unit = js.native
}

/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  var defaultProps: DefaultProps = js.native
}

