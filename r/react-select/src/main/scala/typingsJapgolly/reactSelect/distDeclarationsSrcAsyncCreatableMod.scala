package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcUseAsyncMod.AsyncAdditionalProps
import typingsJapgolly.reactSelect.distDeclarationsSrcUseCreatableMod.CreatableAdditionalProps
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAsyncCreatableMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/AsyncCreatable", JSImport.Default)
  @js.native
  val default: AsyncCreatableSelect = js.native
  
  type AsyncCreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (StateManagerProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group]) & (AsyncAdditionalProps[Option, Group])
  
  type AsyncCreatableSelect = js.Function1[
    /* props */ (AsyncCreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    Element
  ]
  
  type _To = AsyncCreatableSelect
  
  /* This means you don't have to write `default`, but can instead just say `distDeclarationsSrcAsyncCreatableMod.foo` */
  override def _to: AsyncCreatableSelect = default
}
