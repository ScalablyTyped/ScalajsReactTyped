package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDynamicSlotIterator
  extends StObject
     with FunctionExpression {
  
  @JSName("returns")
  var returns_ListDynamicSlotIterator: DynamicSlotNode
}
object ListDynamicSlotIterator {
  
  inline def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean, returns: DynamicSlotNode): ListDynamicSlotIterator = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[ListDynamicSlotIterator]
  }
  
  extension [Self <: ListDynamicSlotIterator](x: Self) {
    
    inline def setReturns(value: DynamicSlotNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
