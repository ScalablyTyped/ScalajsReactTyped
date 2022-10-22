package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewCheckboxes extends StObject {
  
  var checkChildren: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object TreeViewCheckboxes {
  
  inline def apply(): TreeViewCheckboxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewCheckboxes]
  }
  
  extension [Self <: TreeViewCheckboxes](x: Self) {
    
    inline def setCheckChildren(value: Boolean): Self = StObject.set(x, "checkChildren", value.asInstanceOf[js.Any])
    
    inline def setCheckChildrenUndefined: Self = StObject.set(x, "checkChildren", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
