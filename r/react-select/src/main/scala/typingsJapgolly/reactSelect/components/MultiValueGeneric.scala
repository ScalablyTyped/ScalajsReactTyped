package typingsJapgolly.reactSelect.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSelect.anon.ClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueGenericProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.Props
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiValueGeneric {
  
  inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](data: Any, innerProps: ClassName, selectProps: Props[Option, IsMulti, Group]): Builder[Option, IsMulti, Group] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new Builder[Option, IsMulti, Group](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[Option, IsMulti, Group]]))
  }
  
  @JSImport("react-select/dist/declarations/src/components/MultiValue", "MultiValueGeneric")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](p: MultiValueGenericProps[Option, IsMulti, Group]): Builder[Option, IsMulti, Group] = new Builder[Option, IsMulti, Group](js.Array(this.component, p.asInstanceOf[js.Any]))
}
