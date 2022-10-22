package typingsJapgolly.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGCheckbox extends StObject {
  
  /**
    * @description Presence of attribute determines if the checkbox is checked
    */
  var checked: js.UndefOr[Boolean] = js.undefined
}
object ZGCheckbox {
  
  inline def apply(): ZGCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGCheckbox]
  }
  
  extension [Self <: ZGCheckbox](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
