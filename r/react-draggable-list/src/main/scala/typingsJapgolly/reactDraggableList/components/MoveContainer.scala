package typingsJapgolly.reactDraggableList.components

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.ZIndex
import typingsJapgolly.reactDraggableList.distSrcMoveContainerMod.HeightData
import typingsJapgolly.reactDraggableList.distSrcMoveContainerMod.Props
import typingsJapgolly.reactDraggableList.distSrcMoveContainerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MoveContainer {
  
  inline def apply[I, C, T /* <: Component[Any & js.Object, js.Object] */](
    anySelected: Double,
    commonProps: C,
    height: HeightData,
    item: I,
    itemSelected: Double,
    makeDragHandleProps: js.Function0[js.UndefOr[Double]] => js.Object,
    padding: Double,
    template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
  ): Builder[I, C, T] = {
    val __props = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], makeDragHandleProps = js.Any.fromFunction1(makeDragHandleProps), padding = padding.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    new Builder[I, C, T](js.Array(this.component, __props.asInstanceOf[Props[I, C, T]]))
  }
  
  @JSImport("react-draggable-list/dist/src/MoveContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[I, C, T /* <: Component[Any & js.Object, js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[I, C, T]] {
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: ZIndex): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps[I, C, T /* <: Component[Any & js.Object, js.Object] */](p: Props[I, C, T]): Builder[I, C, T] = new Builder[I, C, T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
