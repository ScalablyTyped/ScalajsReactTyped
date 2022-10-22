package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListFilterable extends StObject {
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[TreeListFilterableMessages] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var operators: js.UndefOr[TreeListFilterableOperators] = js.undefined
}
object TreeListFilterable {
  
  inline def apply(): TreeListFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterable]
  }
  
  extension [Self <: TreeListFilterable](x: Self) {
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMessages(value: TreeListFilterableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOperators(value: TreeListFilterableOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
  }
}
