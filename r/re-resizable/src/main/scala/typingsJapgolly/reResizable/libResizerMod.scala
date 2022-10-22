package typingsJapgolly.reResizable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizerMod {
  
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  open class Resizer protected ()
    extends PureComponent[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def onMouseDown(e: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
    
    def onTouchStart(e: ReactTouchEventFrom[HTMLDivElement]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reResizable.reResizableStrings.top
    - typingsJapgolly.reResizable.reResizableStrings.right
    - typingsJapgolly.reResizable.reResizableStrings.bottom
    - typingsJapgolly.reResizable.reResizableStrings.left
    - typingsJapgolly.reResizable.reResizableStrings.topRight
    - typingsJapgolly.reResizable.reResizableStrings.bottomRight
    - typingsJapgolly.reResizable.reResizableStrings.bottomLeft
    - typingsJapgolly.reResizable.reResizableStrings.topLeft
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typingsJapgolly.reResizable.reResizableStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.bottom]
    
    inline def bottomLeft: typingsJapgolly.reResizable.reResizableStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.reResizable.reResizableStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.bottomRight]
    
    inline def left: typingsJapgolly.reResizable.reResizableStrings.left = "left".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.left]
    
    inline def right: typingsJapgolly.reResizable.reResizableStrings.right = "right".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.right]
    
    inline def top: typingsJapgolly.reResizable.reResizableStrings.top = "top".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.top]
    
    inline def topLeft: typingsJapgolly.reResizable.reResizableStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.topLeft]
    
    inline def topRight: typingsJapgolly.reResizable.reResizableStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.reResizable.reResizableStrings.topRight]
  }
  
  type OnStartCallback = js.Function2[
    /* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], 
    /* dir */ Direction, 
    Unit
  ]
  
  trait Props extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: Direction
    
    var onResizeStart: OnStartCallback
    
    var replaceStyles: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(
      direction: Direction,
      onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ Direction) => Callback
    ): Props = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], t1: /* dir */ Direction) => (onResizeStart(t0, t1)).runNow()), children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setOnResizeStart(
        value: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ Direction) => Callback
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], t1: /* dir */ Direction) => (value(t0, t1)).runNow()))
      
      inline def setReplaceStyles(value: CSSProperties): Self = StObject.set(x, "replaceStyles", value.asInstanceOf[js.Any])
      
      inline def setReplaceStylesUndefined: Self = StObject.set(x, "replaceStyles", js.undefined)
    }
  }
}
