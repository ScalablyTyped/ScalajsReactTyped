package typingsJapgolly.reactResizable.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactResizable.mod.ResizeCallbackData
import typingsJapgolly.reactResizable.mod.ResizeHandle
import typingsJapgolly.reactResizable.reactResizableStrings.both
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resizable {
  
  object widthnumberheightnumberax {
    
    inline def apply(height: Double, width: Double): Builder = {
      val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberheightnumberax]))
    }
    
    @JSImport("react-resizable", "Resizable")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactResizable.mod.Resizable] {
      
      inline def axis(value: both): this.type = set("axis", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def draggableOpts(value: Any): this.type = set("draggableOpts", value.asInstanceOf[js.Any])
      
      inline def handle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): this.type = set("handle", value.asInstanceOf[js.Any])
      
      inline def handleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): this.type = set("handle", js.Any.fromFunction2(value))
      
      inline def handleNull: this.type = set("handle", null)
      
      inline def handleSize(value: js.Tuple2[Double, Double]): this.type = set("handleSize", value.asInstanceOf[js.Any])
      
      inline def handleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("handle", js.Array(value*))
      
      inline def handleVdomElement(value: VdomElement): this.type = set("handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def lockAspectRatio(value: Boolean): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def maxConstraints(value: js.Tuple2[Double, Double]): this.type = set("maxConstraints", value.asInstanceOf[js.Any])
      
      inline def minConstraints(value: js.Tuple2[Double, Double]): this.type = set("minConstraints", value.asInstanceOf[js.Any])
      
      inline def onResize(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResize", js.Any.fromFunction2(value))
      
      inline def onResizeStart(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStart", js.Any.fromFunction2(value))
      
      inline def onResizeStop(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStop", js.Any.fromFunction2(value))
      
      inline def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
      
      inline def resizeHandlesVarargs(value: ResizeHandle*): this.type = set("resizeHandles", js.Array(value*))
      
      inline def transformScale(value: Double): this.type = set("transformScale", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactResizable.anon.widthnumberheightnumberax): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object widthnumberheightnumberun {
    
    inline def apply(width: Double): Builder = {
      val __props = js.Dynamic.literal(axis = "x", width = width.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberheightnumberun]))
    }
    
    @JSImport("react-resizable", "Resizable")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactResizable.mod.Resizable] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def draggableOpts(value: Any): this.type = set("draggableOpts", value.asInstanceOf[js.Any])
      
      inline def handle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): this.type = set("handle", value.asInstanceOf[js.Any])
      
      inline def handleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): this.type = set("handle", js.Any.fromFunction2(value))
      
      inline def handleNull: this.type = set("handle", null)
      
      inline def handleSize(value: js.Tuple2[Double, Double]): this.type = set("handleSize", value.asInstanceOf[js.Any])
      
      inline def handleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("handle", js.Array(value*))
      
      inline def handleVdomElement(value: VdomElement): this.type = set("handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def lockAspectRatio(value: Boolean): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def maxConstraints(value: js.Tuple2[Double, Double]): this.type = set("maxConstraints", value.asInstanceOf[js.Any])
      
      inline def minConstraints(value: js.Tuple2[Double, Double]): this.type = set("minConstraints", value.asInstanceOf[js.Any])
      
      inline def onResize(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResize", js.Any.fromFunction2(value))
      
      inline def onResizeStart(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStart", js.Any.fromFunction2(value))
      
      inline def onResizeStop(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStop", js.Any.fromFunction2(value))
      
      inline def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
      
      inline def resizeHandlesVarargs(value: ResizeHandle*): this.type = set("resizeHandles", js.Array(value*))
      
      inline def transformScale(value: Double): this.type = set("transformScale", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactResizable.anon.widthnumberheightnumberun): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object widthnumberundefinedheigh {
    
    inline def apply(height: Double): Builder = {
      val __props = js.Dynamic.literal(axis = "y", height = height.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactResizable.anon.widthnumberundefinedheigh]))
    }
    
    @JSImport("react-resizable", "Resizable")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactResizable.mod.Resizable] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def draggableOpts(value: Any): this.type = set("draggableOpts", value.asInstanceOf[js.Any])
      
      inline def handle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): this.type = set("handle", value.asInstanceOf[js.Any])
      
      inline def handleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): this.type = set("handle", js.Any.fromFunction2(value))
      
      inline def handleNull: this.type = set("handle", null)
      
      inline def handleSize(value: js.Tuple2[Double, Double]): this.type = set("handleSize", value.asInstanceOf[js.Any])
      
      inline def handleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("handle", js.Array(value*))
      
      inline def handleVdomElement(value: VdomElement): this.type = set("handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def lockAspectRatio(value: Boolean): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def maxConstraints(value: js.Tuple2[Double, Double]): this.type = set("maxConstraints", value.asInstanceOf[js.Any])
      
      inline def minConstraints(value: js.Tuple2[Double, Double]): this.type = set("minConstraints", value.asInstanceOf[js.Any])
      
      inline def onResize(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResize", js.Any.fromFunction2(value))
      
      inline def onResizeStart(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStart", js.Any.fromFunction2(value))
      
      inline def onResizeStop(value: (/* e */ ReactEventFrom[org.scalajs.dom.Element], /* data */ ResizeCallbackData) => Any): this.type = set("onResizeStop", js.Any.fromFunction2(value))
      
      inline def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
      
      inline def resizeHandlesVarargs(value: ResizeHandle*): this.type = set("resizeHandles", js.Array(value*))
      
      inline def transformScale(value: Double): this.type = set("transformScale", value.asInstanceOf[js.Any])
      
      inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactResizable.anon.widthnumberundefinedheigh): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
