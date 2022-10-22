package typingsJapgolly.reactDraggableList.components

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDraggableList.distSrcTemplateContainerMod.Props
import typingsJapgolly.reactDraggableList.distSrcTemplateContainerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateContainer {
  
  inline def apply[I, C, T /* <: Component[Any & js.Object, js.Object] */](
    anySelected: Double,
    commonProps: C,
    dragHandleProps: js.Object,
    item: I,
    itemSelected: Double,
    template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
  ): Builder[I, C, T] = {
    val __props = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    new Builder[I, C, T](js.Array(this.component, __props.asInstanceOf[Props[I, C, T]]))
  }
  
  @JSImport("react-draggable-list/dist/src/TemplateContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[I, C, T /* <: Component[Any & js.Object, js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[I, C, T]]
  
  def withProps[I, C, T /* <: Component[Any & js.Object, js.Object] */](p: Props[I, C, T]): Builder[I, C, T] = new Builder[I, C, T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
