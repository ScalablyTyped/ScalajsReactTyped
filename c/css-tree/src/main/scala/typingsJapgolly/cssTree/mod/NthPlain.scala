package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var nth: AnPlusB | Identifier
  
  var selector: SelectorListPlain | Null
  
  @JSName("type")
  var type_NthPlain: typingsJapgolly.cssTree.cssTreeStrings.Nth
}
object NthPlain {
  
  inline def apply(nth: AnPlusB | Identifier): NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
    __obj.asInstanceOf[NthPlain]
  }
  
  extension [Self <: NthPlain](x: Self) {
    
    inline def setNth(value: AnPlusB | Identifier): Self = StObject.set(x, "nth", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: SelectorListPlain): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Nth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
