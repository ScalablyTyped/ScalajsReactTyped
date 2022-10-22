package typingsJapgolly.reactSelect.components

import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Src {
  
  @JSImport("react-select/dist/declarations/src", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Src.type): SharedBuilder_StateManagerPropsRefAttributes_349678716[default[Any, `false`, GroupBase[Any]]] = new SharedBuilder_StateManagerPropsRefAttributes_349678716[default[Any, `false`, GroupBase[Any]]](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* props */ (StateManagerProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[default[Any, `false`, GroupBase[Any]]])
  ): SharedBuilder_StateManagerPropsRefAttributes_349678716[default[Any, `false`, GroupBase[Any]]] = new SharedBuilder_StateManagerPropsRefAttributes_349678716[default[Any, `false`, GroupBase[Any]]](js.Array(this.component, p.asInstanceOf[js.Any]))
}
