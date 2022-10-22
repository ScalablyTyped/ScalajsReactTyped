package typingsJapgolly.reactDraggableList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDraggableList.distSrcMod.Props
import typingsJapgolly.reactDraggableList.distSrcMod.TemplateProps
import typingsJapgolly.reactDraggableList.distSrcMod.default
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Src {
  
  inline def apply[I, C, T /* <: Component[(Partial[TemplateProps[I, C]]) & js.Object, js.Object] */](
    itemKey: String | (js.Function1[I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
  ): Builder[I, C, T] = {
    val __props = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    new Builder[I, C, T](js.Array(this.component, __props.asInstanceOf[Props[I, C, T]]))
  }
  
  @JSImport("react-draggable-list/dist/src", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[I, C, T /* <: Component[(Partial[TemplateProps[I, C]]) & js.Object, js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[I, C, T]] {
    
    inline def autoScrollMaxSpeed(value: Double): this.type = set("autoScrollMaxSpeed", value.asInstanceOf[js.Any])
    
    inline def autoScrollRegionSize(value: Double): this.type = set("autoScrollRegionSize", value.asInstanceOf[js.Any])
    
    inline def commonProps(value: C): this.type = set("commonProps", value.asInstanceOf[js.Any])
    
    inline def constrainDrag(value: Boolean): this.type = set("constrainDrag", value.asInstanceOf[js.Any])
    
    inline def container(value: CallbackTo[js.UndefOr[HTMLElement | Null]]): this.type = set("container", value.toJsFn)
    
    inline def onDragEnd(value: Callback): this.type = set("onDragEnd", value.toJsFn)
    
    inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
    
    inline def onMoveEnd(value: (/* newList */ js.Array[I], I, /* oldIndex */ Double, /* newIndex */ Double) => Callback): this.type = set("onMoveEnd", js.Any.fromFunction4((t0: /* newList */ js.Array[I], t1: I, t2: /* oldIndex */ Double, t3: /* newIndex */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def springConfig(value: js.Object): this.type = set("springConfig", value.asInstanceOf[js.Any])
    
    inline def unsetZIndex(value: Boolean): this.type = set("unsetZIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps[I, C, T /* <: Component[(Partial[TemplateProps[I, C]]) & js.Object, js.Object] */](p: Props[I, C, T]): Builder[I, C, T] = new Builder[I, C, T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
