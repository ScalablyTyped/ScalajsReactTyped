package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMenuUIParams extends StObject {
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object SelectMenuUIParams {
  
  inline def apply(): SelectMenuUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuUIParams]
  }
  
  extension [Self <: SelectMenuUIParams](x: Self) {
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
