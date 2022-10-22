package typingsJapgolly.reactScrollbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactScrollbar.anon.ContainerHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollAreaProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentClassName: js.UndefOr[String] = js.undefined
  
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var contentWindow: js.UndefOr[Any] = js.undefined
  
  var focusableTabIndex: js.UndefOr[Double] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var horizontalContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var horizontalScrollbarStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var minScrollSize: js.UndefOr[Double] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* value */ ContainerHeight, Unit]] = js.undefined
  
  var ownerDocument: js.UndefOr[Any] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[ScrollArea]] = js.undefined
  
  var smoothScrolling: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var stopScrollPropagation: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var swapWheelAxes: js.UndefOr[Boolean] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  var verticalContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var verticalScrollbarStyle: js.UndefOr[CSSProperties] = js.undefined
}
object ScrollAreaProps {
  
  inline def apply(): ScrollAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollAreaProps]
  }
  
  extension [Self <: ScrollAreaProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
    
    inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    
    inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContentWindow(value: Any): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
    
    inline def setContentWindowUndefined: Self = StObject.set(x, "contentWindow", js.undefined)
    
    inline def setFocusableTabIndex(value: Double): Self = StObject.set(x, "focusableTabIndex", value.asInstanceOf[js.Any])
    
    inline def setFocusableTabIndexUndefined: Self = StObject.set(x, "focusableTabIndex", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalContainerStyle(value: CSSProperties): Self = StObject.set(x, "horizontalContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setHorizontalContainerStyleUndefined: Self = StObject.set(x, "horizontalContainerStyle", js.undefined)
    
    inline def setHorizontalScrollbarStyle(value: CSSProperties): Self = StObject.set(x, "horizontalScrollbarStyle", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollbarStyleUndefined: Self = StObject.set(x, "horizontalScrollbarStyle", js.undefined)
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setMinScrollSize(value: Double): Self = StObject.set(x, "minScrollSize", value.asInstanceOf[js.Any])
    
    inline def setMinScrollSizeUndefined: Self = StObject.set(x, "minScrollSize", js.undefined)
    
    inline def setOnScroll(value: /* value */ ContainerHeight => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* value */ ContainerHeight) => value(t0).runNow()))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOwnerDocument(value: Any): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
    
    inline def setRef(value: LegacyRef[ScrollArea]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: ScrollArea | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ScrollArea | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSmoothScrolling(value: Boolean): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrollingUndefined: Self = StObject.set(x, "smoothScrolling", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setStopScrollPropagation(value: Boolean): Self = StObject.set(x, "stopScrollPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopScrollPropagationUndefined: Self = StObject.set(x, "stopScrollPropagation", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwapWheelAxes(value: Boolean): Self = StObject.set(x, "swapWheelAxes", value.asInstanceOf[js.Any])
    
    inline def setSwapWheelAxesUndefined: Self = StObject.set(x, "swapWheelAxes", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalContainerStyle(value: CSSProperties): Self = StObject.set(x, "verticalContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setVerticalContainerStyleUndefined: Self = StObject.set(x, "verticalContainerStyle", js.undefined)
    
    inline def setVerticalScrollbarStyle(value: CSSProperties): Self = StObject.set(x, "verticalScrollbarStyle", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollbarStyleUndefined: Self = StObject.set(x, "verticalScrollbarStyle", js.undefined)
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
