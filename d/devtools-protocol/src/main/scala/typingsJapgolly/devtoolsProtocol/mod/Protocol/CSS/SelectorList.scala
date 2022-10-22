package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorList extends StObject {
  
  /**
    * Selectors in the list.
    */
  var selectors: js.Array[Value]
  
  /**
    * Rule selector text.
    */
  var text: String
}
object SelectorList {
  
  inline def apply(selectors: js.Array[Value], text: String): SelectorList = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorList]
  }
  
  extension [Self <: SelectorList](x: Self) {
    
    inline def setSelectors(value: js.Array[Value]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: Value*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
