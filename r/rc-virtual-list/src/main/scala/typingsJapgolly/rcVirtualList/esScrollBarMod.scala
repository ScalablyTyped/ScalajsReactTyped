package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.rcVirtualList.anon.TypeofsetTimeout
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esScrollBarMod {
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  open class default () extends ScrollBar
  
  @js.native
  trait ScrollBar extends Component[ScrollBarProps, ScrollBarState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MScrollBar(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MScrollBar(prevProps: ScrollBarProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScrollBar(): Unit = js.native
    
    def delayHidden(): Unit = js.native
    
    def getEnableHeightRange(): Double = js.native
    
    def getEnableScrollRange(): Double = js.native
    
    def getSpinHeight(): Double = js.native
    
    def getTop(): Double = js.native
    
    var moveRaf: Double = js.native
    
    var onContainerMouseDown: MouseEventHandler[Element] = js.native
    
    def onMouseDown(e: ReactMouseEventFrom[Element]): Unit = js.native
    def onMouseDown(e: TouchEvent): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    def onMouseMove(e: TouchEvent): Unit = js.native
    
    def onMouseUp(): Unit = js.native
    
    def onScrollbarTouchStart(e: TouchEvent): Unit = js.native
    
    def patchEvents(): Unit = js.native
    
    def removeEvents(): Unit = js.native
    
    var scrollbarRef: RefHandle[HTMLDivElement] = js.native
    
    def showScroll(): Boolean = js.native
    
    var thumbRef: RefHandle[HTMLDivElement] = js.native
    
    var visibleTimeout: ReturnType[TypeofsetTimeout] = js.native
  }
  
  trait ScrollBarProps extends StObject {
    
    var count: Double
    
    var height: Double
    
    def onScroll(scrollTop: Double): Unit
    
    def onStartMove(): Unit
    
    def onStopMove(): Unit
    
    var prefixCls: String
    
    var scrollHeight: Double
    
    var scrollTop: Double
  }
  object ScrollBarProps {
    
    inline def apply(
      count: Double,
      height: Double,
      onScroll: Double => Callback,
      onStartMove: Callback,
      onStopMove: Callback,
      prefixCls: String,
      scrollHeight: Double,
      scrollTop: Double
    ): ScrollBarProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1((t0: Double) => onScroll(t0).runNow()), onStartMove = onStartMove.toJsFn, onStopMove = onStopMove.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBarProps]
    }
    
    extension [Self <: ScrollBarProps](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: Double => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnStartMove(value: Callback): Self = StObject.set(x, "onStartMove", value.toJsFn)
      
      inline def setOnStopMove(value: Callback): Self = StObject.set(x, "onStopMove", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollBarState extends StObject {
    
    var dragging: Boolean
    
    var pageY: Double
    
    var startTop: Double
    
    var visible: Boolean
  }
  object ScrollBarState {
    
    inline def apply(dragging: Boolean, pageY: Double, startTop: Double, visible: Boolean): ScrollBarState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], startTop = startTop.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBarState]
    }
    
    extension [Self <: ScrollBarState](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setStartTop(value: Double): Self = StObject.set(x, "startTop", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
