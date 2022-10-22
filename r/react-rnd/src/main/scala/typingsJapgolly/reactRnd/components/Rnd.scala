package typingsJapgolly.reactRnd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reResizable.mod.ResizeDirection
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDraggable.mod.DraggableData
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactRnd.anon.X
import typingsJapgolly.reactRnd.anon.xnumberynumberSize
import typingsJapgolly.reactRnd.mod.Grid
import typingsJapgolly.reactRnd.mod.HandleClasses
import typingsJapgolly.reactRnd.mod.HandleComponent
import typingsJapgolly.reactRnd.mod.HandleStyles
import typingsJapgolly.reactRnd.mod.Position
import typingsJapgolly.reactRnd.mod.Props
import typingsJapgolly.reactRnd.mod.ResizableDelta
import typingsJapgolly.reactRnd.mod.ResizeEnable
import typingsJapgolly.reactRnd.mod.Size
import typingsJapgolly.reactRnd.reactRndStrings.both
import typingsJapgolly.reactRnd.reactRndStrings.none
import typingsJapgolly.reactRnd.reactRndStrings.x
import typingsJapgolly.reactRnd.reactRndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rnd {
  
  @JSImport("react-rnd", "Rnd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRnd.mod.Rnd] {
    
    inline def default(value: xnumberynumberSize): this.type = set("default", value.asInstanceOf[js.Any])
    
    inline def allowAnyClick(value: Boolean): this.type = set("allowAnyClick", value.asInstanceOf[js.Any])
    
    inline def bounds(value: String): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableDragging(value: Boolean): this.type = set("disableDragging", value.asInstanceOf[js.Any])
    
    inline def dragAxis(value: x | y | both | none): this.type = set("dragAxis", value.asInstanceOf[js.Any])
    
    inline def dragGrid(value: Grid): this.type = set("dragGrid", value.asInstanceOf[js.Any])
    
    inline def dragHandleClassName(value: String): this.type = set("dragHandleClassName", value.asInstanceOf[js.Any])
    
    inline def enableResizing(value: ResizeEnable): this.type = set("enableResizing", value.asInstanceOf[js.Any])
    
    inline def enableUserSelectHack(value: Boolean): this.type = set("enableUserSelectHack", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatio(value: Boolean | Double): this.type = set("lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatioExtraHeight(value: Double): this.type = set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    
    inline def lockAspectRatioExtraWidth(value: Double): this.type = set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDrag", js.Any.fromFunction2(value))
    
    inline def onDragStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDragStart", js.Any.fromFunction2(value))
    
    inline def onDragStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDragStop", js.Any.fromFunction2(value))
    
    inline def onMouseDown(value: /* e */ MouseEvent => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* e */ MouseEvent) => value(t0).runNow()))
    
    inline def onMouseUp(value: /* e */ MouseEvent => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: /* e */ MouseEvent) => value(t0).runNow()))
    
    inline def onResize(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Callback
    ): this.type = set("onResize", js.Any.fromFunction5((t0: /* e */ MouseEvent | TouchEvent, t1: /* dir */ ResizeDirection, t2: /* elementRef */ HTMLElement, t3: /* delta */ ResizableDelta, t4: /* position */ Position) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def onResizeStart(
      value: (/* e */ ReactMouseEventFrom[HTMLElement] | ReactTouchEventFrom[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
    ): this.type = set("onResizeStart", js.Any.fromFunction3(value))
    
    inline def onResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Callback
    ): this.type = set("onResizeStop", js.Any.fromFunction5((t0: /* e */ MouseEvent | TouchEvent, t1: /* dir */ ResizeDirection, t2: /* elementRef */ HTMLElement, t3: /* delta */ ResizableDelta, t4: /* position */ Position) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def position(value: X): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def resizeGrid(value: Grid): this.type = set("resizeGrid", value.asInstanceOf[js.Any])
    
    inline def resizeHandleClasses(value: HandleClasses): this.type = set("resizeHandleClasses", value.asInstanceOf[js.Any])
    
    inline def resizeHandleComponent(value: HandleComponent): this.type = set("resizeHandleComponent", value.asInstanceOf[js.Any])
    
    inline def resizeHandleStyles(value: HandleStyles): this.type = set("resizeHandleStyles", value.asInstanceOf[js.Any])
    
    inline def resizeHandleWrapperClass(value: String): this.type = set("resizeHandleWrapperClass", value.asInstanceOf[js.Any])
    
    inline def resizeHandleWrapperStyle(value: CSSProperties): this.type = set("resizeHandleWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Rnd.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
