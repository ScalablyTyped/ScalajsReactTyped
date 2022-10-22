package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcUseCreatableMod.BaseCreatableProps
import typingsJapgolly.reactSelect.distDeclarationsSrcUseCreatableMod.CreatableAdditionalProps
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCreatableMod {
  
  @JSImport("react-select/dist/declarations/src/Creatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/Creatable", JSImport.Default)
  @js.native
  val default: CreatableSelect = js.native
  
  inline def useCreatable[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps: BaseCreatableProps[Option, IsMulti, Group]
  ): PublicBaseSelectProps[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCreatable")(hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[PublicBaseSelectProps[Option, IsMulti, Group]]
  
  type CreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group])
  
  type CreatableSelect = js.Function1[
    /* props */ (CreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    Element
  ]
}
