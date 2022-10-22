package typingsJapgolly.reactBootstrapTableNext.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterElement extends StObject {
  
  var filterElement: Element
  
  var sortElement: Element
}
object FilterElement {
  
  inline def apply(filterElement: VdomElement, sortElement: VdomElement): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.rawElement.asInstanceOf[js.Any], sortElement = sortElement.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
  
  extension [Self <: FilterElement](x: Self) {
    
    inline def setFilterElement(value: VdomElement): Self = StObject.set(x, "filterElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSortElement(value: VdomElement): Self = StObject.set(x, "sortElement", value.rawElement.asInstanceOf[js.Any])
  }
}
