package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderAction extends StObject {
  
  var component: js.UndefOr[Element] = js.undefined
  
  var dropdownItems: js.UndefOr[js.Array[Element]] = js.undefined
}
object PageHeaderAction {
  
  inline def apply(): PageHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderAction]
  }
  
  extension [Self <: PageHeaderAction](x: Self) {
    
    inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDropdownItems(value: js.Array[Element]): Self = StObject.set(x, "dropdownItems", value.asInstanceOf[js.Any])
    
    inline def setDropdownItemsUndefined: Self = StObject.set(x, "dropdownItems", js.undefined)
    
    inline def setDropdownItemsVarargs(value: Element*): Self = StObject.set(x, "dropdownItems", js.Array(value*))
  }
}
