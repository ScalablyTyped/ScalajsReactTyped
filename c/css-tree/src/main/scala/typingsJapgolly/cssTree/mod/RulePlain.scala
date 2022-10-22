package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain
  
  var prelude: SelectorListPlain | Raw
  
  @JSName("type")
  var type_RulePlain: typingsJapgolly.cssTree.cssTreeStrings.Rule
}
object RulePlain {
  
  inline def apply(block: BlockPlain, prelude: SelectorListPlain | Raw): RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[RulePlain]
  }
  
  extension [Self <: RulePlain](x: Self) {
    
    inline def setBlock(value: BlockPlain): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setPrelude(value: SelectorListPlain | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
