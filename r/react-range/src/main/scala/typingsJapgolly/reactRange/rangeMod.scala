package typingsJapgolly.reactRange

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRange.typesMod.IProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range/lib/Range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  @js.native
  trait Range
    extends Component[IProps, js.Object, js.Any] {
    @JSName("state")
    var state_Range: AnonDraggedThumbIndex = js.native
    var thumbRefs: js.Array[RefHandle[HTMLElement]] = js.native
    var trackRef: RefHandle[HTMLElement] = js.native
    def addMouseEvents(e: MouseEvent): Unit = js.native
    def addTouchEvents(e: TouchEvent): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MRange(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRange(prevProps: IProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRange(): Unit = js.native
    def fireOnFinalChange(): Unit = js.native
    def getOffsets(): js.Array[AnonX] = js.native
    def getTargetIndex(e: Event_): Double = js.native
    def getThumbs(): js.Array[Element] = js.native
    def normalizeValue(value: Double, index: Double): Double = js.native
    def onEnd(e: Event_): Unit = js.native
    def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    def onKeyUp(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    def onMouseDownTrack(e: ReactMouseEventFrom[Element]): Unit = js.native
    def onMouseMove(e: MouseEvent): Unit = js.native
    def onMouseOrTouchStart(e: MouseEvent with TouchEvent): Unit = js.native
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    def onTouchMove(e: TouchEvent): Unit = js.native
    def onTouchStartTrack(e: ReactTouchEventFrom[Element]): Unit = js.native
    def onWindowResize(): Unit = js.native
    def schdOnEnd(e: Event_): Unit = js.native
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    def schdOnWindowResize(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Range {
    def this(props: IProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAllowOverlap = js.native
  }
  
}

