package typingsJapgolly.reactGridLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactGridLayout.anon.H
import typingsJapgolly.reactGridLayout.anon.W
import typingsJapgolly.reactGridLayout.mod.DragOverEvent
import typingsJapgolly.reactGridLayout.mod.Layout
import typingsJapgolly.reactGridLayout.mod.Layouts
import typingsJapgolly.reactGridLayout.mod.ResizeHandle
import typingsJapgolly.reactGridLayout.mod.ResponsiveProps
import typingsJapgolly.reactGridLayout.reactGridLayoutBooleans.`false`
import typingsJapgolly.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsJapgolly.reactGridLayout.reactGridLayoutStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Responsive {
  
  @JSImport("react-grid-layout", "Responsive")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactGridLayout.mod.Responsive] {
    
    inline def allowOverlap(value: Boolean): this.type = set("allowOverlap", value.asInstanceOf[js.Any])
    
    inline def autoSize(value: Boolean): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    inline def breakpoint(value: String): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compactType(value: vertical | horizontal): this.type = set("compactType", value.asInstanceOf[js.Any])
    
    inline def compactTypeNull: this.type = set("compactType", null)
    
    inline def containerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    inline def draggableCancel(value: String): this.type = set("draggableCancel", value.asInstanceOf[js.Any])
    
    inline def draggableHandle(value: String): this.type = set("draggableHandle", value.asInstanceOf[js.Any])
    
    inline def droppingItem(value: H): this.type = set("droppingItem", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[HTMLDivElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def isBounded(value: Boolean): this.type = set("isBounded", value.asInstanceOf[js.Any])
    
    inline def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    inline def isDroppable(value: Boolean): this.type = set("isDroppable", value.asInstanceOf[js.Any])
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def layouts(value: Layouts): this.type = set("layouts", value.asInstanceOf[js.Any])
    
    inline def margin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxRows(value: Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
    
    inline def onBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Callback): this.type = set("onBreakpointChange", js.Any.fromFunction2((t0: /* newBreakpoint */ String, t1: /* newCols */ Double) => (value(t0, t1)).runNow()))
    
    inline def onDrag(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onDrag", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onDragStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onDragStart", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onDragStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onDragStop", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onDrop(value: (/* layout */ js.Array[Layout], /* item */ Layout, /* e */ Event) => Callback): this.type = set("onDrop", js.Any.fromFunction3((t0: /* layout */ js.Array[Layout], t1: /* item */ Layout, t2: /* e */ Event) => (value(t0, t1, t2)).runNow()))
    
    inline def onDropDragOver(value: /* e */ DragOverEvent => js.UndefOr[W | `false`]): this.type = set("onDropDragOver", js.Any.fromFunction1(value))
    
    inline def onLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Callback): this.type = set("onLayoutChange", js.Any.fromFunction2((t0: /* currentLayout */ js.Array[Layout], t1: /* allLayouts */ Layouts) => (value(t0, t1)).runNow()))
    
    inline def onResize(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onResize", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onResizeStart(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onResizeStart", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onResizeStop(
      value: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback
    ): this.type = set("onResizeStop", js.Any.fromFunction6((t0: /* layout */ js.Array[Layout], t1: /* oldItem */ Layout, t2: /* newItem */ Layout, t3: /* placeholder */ Layout, t4: /* event */ MouseEvent, t5: /* element */ HTMLElement) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def onWidthChange(
      value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Callback
    ): this.type = set("onWidthChange", js.Any.fromFunction4((t0: /* containerWidth */ Double, t1: /* margin */ js.Tuple2[Double, Double], t2: /* cols */ Double, t3: /* containerPadding */ js.Tuple2[Double, Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def preventCollision(value: Boolean): this.type = set("preventCollision", value.asInstanceOf[js.Any])
    
    inline def resizeHandle(value: Node | (js.Function1[/* resizeHandle */ ResizeHandle, Node])): this.type = set("resizeHandle", value.asInstanceOf[js.Any])
    
    inline def resizeHandleFunction1(value: /* resizeHandle */ ResizeHandle => Node): this.type = set("resizeHandle", js.Any.fromFunction1(value))
    
    inline def resizeHandleNull: this.type = set("resizeHandle", null)
    
    inline def resizeHandleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("resizeHandle", js.Array(value*))
    
    inline def resizeHandleVdomElement(value: VdomElement): this.type = set("resizeHandle", value.rawElement.asInstanceOf[js.Any])
    
    inline def resizeHandles(value: js.Array[ResizeHandle]): this.type = set("resizeHandles", value.asInstanceOf[js.Any])
    
    inline def resizeHandlesVarargs(value: ResizeHandle*): this.type = set("resizeHandles", js.Array(value*))
    
    inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transformScale(value: Double): this.type = set("transformScale", value.asInstanceOf[js.Any])
    
    inline def useCSSTransforms(value: Boolean): this.type = set("useCSSTransforms", value.asInstanceOf[js.Any])
    
    inline def verticalCompact(value: Boolean): this.type = set("verticalCompact", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Responsive.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResponsiveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
