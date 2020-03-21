package typingsJapgolly.reactMovable

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMovable.typesMod.IProps
import typingsJapgolly.reactMovable.typesMod.TEvent
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-movable/lib/List", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @js.native
  trait List[Value]
    extends Component[IProps[Value], js.Object, js.Any] {
    var afterIndex: Double = js.native
    var dropTimeout: js.UndefOr[Double] = js.native
    var ghostRef: RefHandle[HTMLElement] = js.native
    var initialYOffset: Double = js.native
    var itemTranslateOffsets: js.Array[Double] = js.native
    var lastListYOffset: Double = js.native
    var lastScroll: Double = js.native
    var lastYOffset: Double = js.native
    var listRef: RefHandle[HTMLElement] = js.native
    var needle: Double = js.native
    @JSName("state")
    var state_List: AnonInitialX = js.native
    var topOffsets: js.Array[Double] = js.native
    def animateItems(needle: Double, movedItem: Double, offset: Double): Unit = js.native
    def animateItems(needle: Double, movedItem: Double, offset: Double, animateMovedItem: Boolean): Unit = js.native
    def autoScrolling(clientY: Double): Unit = js.native
    def calculateOffsets(): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MList(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MList(_prevProps: js.Any, prevState: AnonScrollingSpeed): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MList(): Unit = js.native
    def doScrolling(): Unit = js.native
    def finishDrop(): Unit = js.native
    def getChildren(): js.Array[Element] = js.native
    def getTargetIndex(e: TEvent): Double = js.native
    def getYOffset(): Double = js.native
    def isDraggedItemOutOfBounds(): Boolean = js.native
    def moveOtherItems(): Unit = js.native
    def onEnd(e: TouchEvent with MouseEvent): Unit = js.native
    def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    def onMouseMove(e: MouseEvent): Unit = js.native
    def onMouseOrTouchStart(e: MouseEvent with TouchEvent): Unit = js.native
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    def onStart(target: HTMLElement, clientX: Double, clientY: Double, index: Double): Unit = js.native
    def onTouchMove(e: TouchEvent): Unit = js.native
    def onWheel(e: ReactWheelEventFrom[Element]): Unit = js.native
    def schdOnEnd(e: Event_): Unit = js.native
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
  }
  
  @js.native
  class default[Value] protected () extends List[Value] {
    def this(props: IProps[Value]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonLockVertically = js.native
  }
  
}

