package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoClassSelectorPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] | Null
  
  var name: String
  
  @JSName("type")
  var type_PseudoClassSelectorPlain: typingsJapgolly.cssTree.cssTreeStrings.PseudoClassSelector
}
object PseudoClassSelectorPlain {
  
  inline def apply(name: String): PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[PseudoClassSelectorPlain]
  }
  
  extension [Self <: PseudoClassSelectorPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.PseudoClassSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
