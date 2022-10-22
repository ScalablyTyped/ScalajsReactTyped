package typingsJapgolly.reactResizable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactResizable.anon.Height
import typingsJapgolly.reactResizable.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resizable", "Resizable")
  @js.native
  open class Resizable protected () extends Component[ResizableProps, ResizableState, Any] {
    def this(props: ResizableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableProps, context: Any) = this()
  }
  
  @JSImport("react-resizable", "ResizableBox")
  @js.native
  open class ResizableBox protected () extends Component[ResizableBoxProps, ResizableBoxState, Any] {
    def this(props: ResizableBoxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ResizableBoxProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactResizable.reactResizableStrings.both
    - typingsJapgolly.reactResizable.reactResizableStrings.x
    - typingsJapgolly.reactResizable.reactResizableStrings.y
    - typingsJapgolly.reactResizable.reactResizableStrings.none
  */
  trait Axis extends StObject
  object Axis {
    
    inline def both: typingsJapgolly.reactResizable.reactResizableStrings.both = "both".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.both]
    
    inline def none: typingsJapgolly.reactResizable.reactResizableStrings.none = "none".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.none]
    
    inline def x: typingsJapgolly.reactResizable.reactResizableStrings.x = "x".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.x]
    
    inline def y: typingsJapgolly.reactResizable.reactResizableStrings.y = "y".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.y]
  }
  
  trait DragCallbackData extends StObject {
    
    var deltaX: Double
    
    var deltaY: Double
    
    var lastX: Double
    
    var lastY: Double
    
    var node: HTMLElement
    
    var x: Double
    
    var y: Double
  }
  object DragCallbackData {
    
    inline def apply(
      deltaX: Double,
      deltaY: Double,
      lastX: Double,
      lastY: Double,
      node: HTMLElement,
      x: Double,
      y: Double
    ): DragCallbackData = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragCallbackData]
    }
    
    extension [Self <: DragCallbackData](x: Self) {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizableBoxProps = ResizableProps & Style
  
  trait ResizableBoxState extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ResizableBoxState {
    
    inline def apply(height: Double, width: Double): ResizableBoxState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableBoxState]
    }
    
    extension [Self <: ResizableBoxState](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactResizable.anon.widthnumberheightnumberun
    - typingsJapgolly.reactResizable.anon.widthnumberundefinedheigh
    - typingsJapgolly.reactResizable.anon.widthnumberheightnumberax
  */
  trait ResizableProps extends StObject
  object ResizableProps {
    
    inline def widthnumberheightnumberax(height: Double, width: Double): typingsJapgolly.reactResizable.anon.widthnumberheightnumberax = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberheightnumberax]
    }
    
    inline def widthnumberheightnumberun(width: Double): typingsJapgolly.reactResizable.anon.widthnumberheightnumberun = {
      val __obj = js.Dynamic.literal(axis = "x", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberheightnumberun]
    }
    
    inline def widthnumberundefinedheigh(height: Double): typingsJapgolly.reactResizable.anon.widthnumberundefinedheigh = {
      val __obj = js.Dynamic.literal(axis = "y", height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberundefinedheigh]
    }
  }
  
  trait ResizableState extends StObject {
    
    var height: Double
    
    var resizing: Boolean
    
    var slackH: Double
    
    var slackW: Double
    
    var width: Double
  }
  object ResizableState {
    
    inline def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableState]
    }
    
    extension [Self <: ResizableState](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
      
      inline def setSlackH(value: Double): Self = StObject.set(x, "slackH", value.asInstanceOf[js.Any])
      
      inline def setSlackW(value: Double): Self = StObject.set(x, "slackW", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeCallbackData extends StObject {
    
    var handle: ResizeHandle
    
    var node: HTMLElement
    
    var size: Height
  }
  object ResizeCallbackData {
    
    inline def apply(handle: ResizeHandle, node: HTMLElement, size: Height): ResizeCallbackData = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeCallbackData]
    }
    
    extension [Self <: ResizeCallbackData](x: Self) {
      
      inline def setHandle(value: ResizeHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactResizable.reactResizableStrings.s
    - typingsJapgolly.reactResizable.reactResizableStrings.w
    - typingsJapgolly.reactResizable.reactResizableStrings.e
    - typingsJapgolly.reactResizable.reactResizableStrings.n
    - typingsJapgolly.reactResizable.reactResizableStrings.sw
    - typingsJapgolly.reactResizable.reactResizableStrings.nw
    - typingsJapgolly.reactResizable.reactResizableStrings.se
    - typingsJapgolly.reactResizable.reactResizableStrings.ne
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    inline def e: typingsJapgolly.reactResizable.reactResizableStrings.e = "e".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.e]
    
    inline def n: typingsJapgolly.reactResizable.reactResizableStrings.n = "n".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.n]
    
    inline def ne: typingsJapgolly.reactResizable.reactResizableStrings.ne = "ne".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.ne]
    
    inline def nw: typingsJapgolly.reactResizable.reactResizableStrings.nw = "nw".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.nw]
    
    inline def s: typingsJapgolly.reactResizable.reactResizableStrings.s = "s".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.s]
    
    inline def se: typingsJapgolly.reactResizable.reactResizableStrings.se = "se".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.se]
    
    inline def sw: typingsJapgolly.reactResizable.reactResizableStrings.sw = "sw".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.sw]
    
    inline def w: typingsJapgolly.reactResizable.reactResizableStrings.w = "w".asInstanceOf[typingsJapgolly.reactResizable.reactResizableStrings.w]
  }
}
