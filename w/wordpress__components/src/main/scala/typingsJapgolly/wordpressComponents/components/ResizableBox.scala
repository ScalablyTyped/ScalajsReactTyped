package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reResizable.anon.X
import typingsJapgolly.reResizable.libResizerMod.Direction
import typingsJapgolly.reResizable.mod.Enable
import typingsJapgolly.reResizable.mod.HandleClassName
import typingsJapgolly.reResizable.mod.HandleComponent
import typingsJapgolly.reResizable.mod.HandleStyles
import typingsJapgolly.reResizable.mod.NumberSize
import typingsJapgolly.reResizable.mod.Size
import typingsJapgolly.reResizable.reResizableStrings.parent
import typingsJapgolly.reResizable.reResizableStrings.window
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.resizableBoxMod.ResizableBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizableBox {
  
  @JSImport("@wordpress/components", "ResizableBox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: String | ComponentType[Any]): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def bounds(value: parent | window | HTMLElement): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def boundsByDirection(value: Boolean): this.type = set("boundsByDirection", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSize(value: Size): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    inline def enable(value: Enable): this.type = set("enable", value.asInstanceOf[js.Any])
    
    inline def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def handleClasses(value: HandleClassName): this.type = set("handleClasses", value.asInstanceOf[js.Any])
    
    inline def handleComponent(value: HandleComponent): this.type = set("handleComponent", value.asInstanceOf[js.Any])
    
    inline def handleStyles(value: HandleStyles): this.type = set("handleStyles", value.asInstanceOf[js.Any])
    
    inline def handleWrapperClass(value: String): this.type = set("handleWrapperClass", value.asInstanceOf[js.Any])
    
    inline def handleWrapperStyle(value: CSSProperties): this.type = set("handleWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatio(value: Boolean | Double): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatioExtraHeight(value: Double): this.type = set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatioExtraWidth(value: Double): this.type = set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String | Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: String | Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: String | Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def onResize(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Callback
    ): this.type = set("onResize", js.Any.fromFunction4((t0: /* event */ MouseEvent | TouchEvent, t1: /* direction */ Direction, t2: /* elementRef */ HTMLElement, t3: /* delta */ NumberSize) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onResizeStart(
      value: (/* e */ ReactMouseEventFrom[HTMLElement] | ReactTouchEventFrom[HTMLElement], /* dir */ Direction, /* elementRef */ HTMLElement) => Unit | Boolean
    ): this.type = set("onResizeStart", js.Any.fromFunction3(value))
    
    inline def onResizeStop(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Callback
    ): this.type = set("onResizeStop", js.Any.fromFunction4((t0: /* event */ MouseEvent | TouchEvent, t1: /* direction */ Direction, t2: /* elementRef */ HTMLElement, t3: /* delta */ NumberSize) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def resizeRatio(value: Double): this.type = set("resizeRatio", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def showHandle(value: Boolean): this.type = set("showHandle", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def snap(value: X): this.type = set("snap", value.asInstanceOf[js.Any])
    
    inline def snapGap(value: Double): this.type = set("snapGap", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ResizableBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
