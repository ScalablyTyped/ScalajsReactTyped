package typingsJapgolly.antd.anon

import typingsJapgolly.antd.antdStrings._empty
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownClassName extends StObject {
  
  var dropdownClassName: js.UndefOr[String] = js.undefined
  
  var popupClassName: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[_empty | warning | error] = js.undefined
}
object DropdownClassName {
  
  inline def apply(): DropdownClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownClassName]
  }
  
  extension [Self <: DropdownClassName](x: Self) {
    
    inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    inline def setStatus(value: _empty | warning | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
