package typingsJapgolly.reactBootstrapTable.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageList extends StObject {
  
  /**
    * The default list of page change buttons.
    */
  var pageList: HTMLUListElement
  
  /**
    * Default sizePerPageDropdown component.
    */
  var sizePerPageDropDown: SizePerPageDropDown
  
  /**
    * Text/element to display when displaying the total number of rows.
    */
  var totalText: String | Element
}
object PageList {
  
  inline def apply(pageList: HTMLUListElement, sizePerPageDropDown: SizePerPageDropDown, totalText: String | Element): PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList.asInstanceOf[js.Any], sizePerPageDropDown = sizePerPageDropDown.asInstanceOf[js.Any], totalText = totalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageList]
  }
  
  extension [Self <: PageList](x: Self) {
    
    inline def setPageList(value: HTMLUListElement): Self = StObject.set(x, "pageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageDropDown(value: SizePerPageDropDown): Self = StObject.set(x, "sizePerPageDropDown", value.asInstanceOf[js.Any])
    
    inline def setTotalText(value: String | Element): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
    
    inline def setTotalTextVdomElement(value: VdomElement): Self = StObject.set(x, "totalText", value.rawElement.asInstanceOf[js.Any])
  }
}
