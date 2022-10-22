package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var block: Block
  
  var prelude: SelectorList | Raw
  
  @JSName("type")
  var type_Rule: typingsJapgolly.cssTree.cssTreeStrings.Rule
}
object Rule {
  
  inline def apply(block: Block, prelude: SelectorList | Raw): Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setPrelude(value: SelectorList | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
