package typingsJapgolly.reactSelect.components

import typingsJapgolly.reactSelect.anon.ClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueGenericProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.Props
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiValueLabel {
  
  inline def apply[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](data: Any, innerProps: ClassName, selectProps: Props[Option_15, IsMulti_15, Group_15]): SharedBuilder_MultiValueGenericProps_686185612[Option_15, IsMulti_15, Group_15] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new SharedBuilder_MultiValueGenericProps_686185612[Option_15, IsMulti_15, Group_15](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[Option_15, IsMulti_15, Group_15]]))
  }
  
  @JSImport("react-select", "components.MultiValueLabel")
  @js.native
  val component: js.Object = js.native
  
  def withProps[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](p: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): SharedBuilder_MultiValueGenericProps_686185612[Option_15, IsMulti_15, Group_15] = new SharedBuilder_MultiValueGenericProps_686185612[Option_15, IsMulti_15, Group_15](js.Array(this.component, p.asInstanceOf[js.Any]))
}
