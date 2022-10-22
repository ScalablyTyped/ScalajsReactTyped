package typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option]
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option]
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option]
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option]
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option]
  - typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option]
*/
trait ActionMeta[Option] extends StObject
object ActionMeta {
  
  inline def ClearActionMeta[Option](removedValues: Options[Option]): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "clear", removedValues = removedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.ClearActionMeta[Option]]
  }
  
  inline def CreateOptionActionMeta[Option](option: Option): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "create-option", option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CreateOptionActionMeta[Option]]
  }
  
  inline def DeselectOptionActionMeta[Option](): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "deselect-option")
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.DeselectOptionActionMeta[Option]]
  }
  
  inline def PopValueActionMeta[Option](removedValue: Option): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "pop-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PopValueActionMeta[Option]]
  }
  
  inline def RemoveValueActionMeta[Option](removedValue: Option): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "remove-value", removedValue = removedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.RemoveValueActionMeta[Option]]
  }
  
  inline def SelectOptionActionMeta[Option](): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option] = {
    val __obj = js.Dynamic.literal(action = "select-option")
    __obj.asInstanceOf[typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.SelectOptionActionMeta[Option]]
  }
}
