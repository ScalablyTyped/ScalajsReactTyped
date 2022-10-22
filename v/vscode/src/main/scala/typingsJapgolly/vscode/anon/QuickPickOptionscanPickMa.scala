package typingsJapgolly.vscode.anon

import typingsJapgolly.vscode.mod.QuickPickItem
import typingsJapgolly.vscode.vscodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vscode.vscode.QuickPickOptions & {  canPickMany :true} */
trait QuickPickOptionscanPickMa extends StObject {
  
  /**
    * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
    */
  var canPickMany: js.UndefOr[Boolean] & `true`
  
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    * This setting is ignored on iPad and is always false.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional flag to include the description when filtering the picks.
    */
  var matchOnDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional flag to include the detail when filtering the picks.
    */
  var matchOnDetail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional function that is invoked whenever an item is selected.
    */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | String, Any]] = js.undefined
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.undefined
  
  /**
    * An optional string that represents the title of the quick pick.
    */
  var title: js.UndefOr[String] = js.undefined
}
object QuickPickOptionscanPickMa {
  
  inline def apply(canPickMany: js.UndefOr[Boolean] & `true`): QuickPickOptionscanPickMa = {
    val __obj = js.Dynamic.literal(canPickMany = canPickMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickOptionscanPickMa]
  }
  
  extension [Self <: QuickPickOptionscanPickMa](x: Self) {
    
    inline def setCanPickMany(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "canPickMany", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    inline def setMatchOnDescription(value: Boolean): Self = StObject.set(x, "matchOnDescription", value.asInstanceOf[js.Any])
    
    inline def setMatchOnDescriptionUndefined: Self = StObject.set(x, "matchOnDescription", js.undefined)
    
    inline def setMatchOnDetail(value: Boolean): Self = StObject.set(x, "matchOnDetail", value.asInstanceOf[js.Any])
    
    inline def setMatchOnDetailUndefined: Self = StObject.set(x, "matchOnDetail", js.undefined)
    
    inline def setOnDidSelectItem(value: /* item */ QuickPickItem | String => Any): Self = StObject.set(x, "onDidSelectItem", js.Any.fromFunction1(value))
    
    inline def setOnDidSelectItemUndefined: Self = StObject.set(x, "onDidSelectItem", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
