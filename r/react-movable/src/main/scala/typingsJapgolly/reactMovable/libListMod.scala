package typingsJapgolly.reactMovable

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMovable.anon.Call
import typingsJapgolly.reactMovable.anon.CallCancel
import typingsJapgolly.reactMovable.anon.Cancel
import typingsJapgolly.reactMovable.anon.Canceled
import typingsJapgolly.reactMovable.anon.InitialX
import typingsJapgolly.reactMovable.anon.ScrollingSpeed
import typingsJapgolly.reactMovable.libTypesMod.IProps
import typingsJapgolly.reactMovable.libTypesMod.TEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListMod {
  
  @JSImport("react-movable/lib/List", JSImport.Default)
  @js.native
  open class default[Value] protected ()
    extends typingsJapgolly.reactMovable.libListMod.List[Value] {
    def this(props: IProps[Value]) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-movable/lib/List", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-movable/lib/List", "default.defaultProps.lockVertically")
      @js.native
      def lockVertically: Boolean = js.native
      inline def lockVertically_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockVertically")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.removableByMove")
      @js.native
      def removableByMove: Boolean = js.native
      inline def removableByMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.transitionDuration")
      @js.native
      def transitionDuration: Double = js.native
      inline def transitionDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.voiceover")
      @js.native
      def voiceover: Canceled = js.native
      inline def voiceover_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait List[Value]
    extends Component[IProps[Value], js.Object, Any] {
    
    var afterIndex: Double = js.native
    
    def animateItems(needle: Double, movedItem: Double, offset: Double): Unit = js.native
    def animateItems(needle: Double, movedItem: Double, offset: Double, animateMovedItem: Boolean): Unit = js.native
    
    def autoScrolling(clientY: Double): Unit = js.native
    
    def calculateOffsets(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MList(_prevProps: Any, prevState: ScrollingSpeed): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MList(): Unit = js.native
    
    def doScrolling(): Unit = js.native
    
    var dropTimeout: js.UndefOr[Double] = js.native
    
    def finishDrop(): Unit = js.native
    
    def getChildren(): js.Array[Element] = js.native
    
    def getTargetIndex(e: TEvent): Double = js.native
    
    def getYOffset(): Double = js.native
    
    var ghostRef: RefHandle[HTMLElement] = js.native
    
    var initialYOffset: Double = js.native
    
    def isDraggedItemOutOfBounds(): Boolean = js.native
    
    var itemTranslateOffsets: js.Array[Double] = js.native
    
    var lastListYOffset: Double = js.native
    
    var lastScroll: Double = js.native
    
    var lastYOffset: Double = js.native
    
    var listRef: RefHandle[HTMLElement] = js.native
    
    def moveOtherItems(): Unit = js.native
    
    var needle: Double = js.native
    
    def onEnd(e: TouchEvent & MouseEvent): Unit = js.native
    
    def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onMouseOrTouchStart(e: MouseEvent & TouchEvent): Unit = js.native
    
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    
    def onStart(target: HTMLElement, clientX: Double, clientY: Double, index: Double): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onWheel(e: ReactWheelEventFrom[Element]): Unit = js.native
    
    var schdOnEnd: CallCancel = js.native
    
    var schdOnMouseMove: Call = js.native
    
    var schdOnTouchMove: Cancel = js.native
    
    @JSName("state")
    var state_List: InitialX = js.native
    
    var topOffsets: js.Array[Double] = js.native
  }
}
