package typingsJapgolly.reactRange

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRange.anon.DraggedThumbIndex
import typingsJapgolly.reactRange.anon.X
import typingsJapgolly.reactRange.libTypesMod.Direction
import typingsJapgolly.reactRange.libTypesMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRangeMod {
  
  @JSImport("react-range/lib/Range", JSImport.Default)
  @js.native
  open class default protected () extends Range {
    def this(props: IProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-range/lib/Range", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-range/lib/Range", "default.defaultProps.allowOverlap")
      @js.native
      def allowOverlap: Boolean = js.native
      inline def allowOverlap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.direction")
      @js.native
      def direction: Direction = js.native
      inline def direction_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.draggableTrack")
      @js.native
      def draggableTrack: Boolean = js.native
      inline def draggableTrack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggableTrack")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.max")
      @js.native
      def max: Double = js.native
      inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.min")
      @js.native
      def min: Double = js.native
      inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.rtl")
      @js.native
      def rtl: Boolean = js.native
      inline def rtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.step")
      @js.native
      def step: Double = js.native
      inline def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Range
    extends Component[IProps, js.Object, Any] {
    
    def addMouseEvents(e: MouseEvent): Unit = js.native
    
    def addTouchEvents(e: TouchEvent): Unit = js.native
    
    def calculateMarkOffsets(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRange(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRange(prevProps: IProps, prevState: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRange(): Unit = js.native
    
    def fireOnFinalChange(): Unit = js.native
    
    def getOffsets(): js.Array[X] = js.native
    
    def getTargetIndex(e: Event): Double = js.native
    
    def getThumbs(): js.Array[Element] = js.native
    
    var markRefs: js.UndefOr[js.Array[RefHandle[HTMLElement]]] = js.native
    
    def normalizeValue(value: Double, index: Double): Double = js.native
    
    var numOfMarks: js.UndefOr[Double] = js.native
    
    def onEnd(e: Event): js.UndefOr[Null] = js.native
    
    def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    
    def onKeyUp(e: ReactKeyboardEventFrom[Element]): Unit = js.native
    
    def onMouseDownTrack(e: ReactMouseEventFrom[Element]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onMouseOrTouchStart(e: MouseEvent & TouchEvent): Unit = js.native
    
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    
    def onResize(): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onTouchStartTrack(e: ReactTouchEventFrom[Element]): Unit = js.native
    
    var resizeObserver: Any = js.native
    
    def schdOnEnd(e: Event): Unit = js.native
    
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    
    @JSName("state")
    var state_Range: DraggedThumbIndex = js.native
    
    var thumbRefs: js.Array[RefHandle[HTMLElement]] = js.native
    
    var trackRef: RefHandle[HTMLElement] = js.native
    
    def updateMarkRefs(props: IProps): Unit = js.native
  }
}
