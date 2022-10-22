package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcStateManagerMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/stateManager", JSImport.Default)
  @js.native
  val default: StateManagedSelect = js.native
  
  type StateManagedSelect = js.Function1[
    /* props */ (StateManagerProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[
      typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default[Any, `false`, GroupBase[Any]]
    ]), 
    Element
  ]
  
  type _To = StateManagedSelect
  
  /* This means you don't have to write `default`, but can instead just say `distDeclarationsSrcStateManagerMod.foo` */
  override def _to: StateManagedSelect = default
}
