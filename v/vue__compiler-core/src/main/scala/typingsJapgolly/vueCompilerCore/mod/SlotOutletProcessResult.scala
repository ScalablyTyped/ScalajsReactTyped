package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotOutletProcessResult extends StObject {
  
  var slotName: String | ExpressionNode
  
  var slotProps: js.UndefOr[PropsExpression] = js.undefined
}
object SlotOutletProcessResult {
  
  inline def apply(slotName: String | ExpressionNode): SlotOutletProcessResult = {
    val __obj = js.Dynamic.literal(slotName = slotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotOutletProcessResult]
  }
  
  extension [Self <: SlotOutletProcessResult](x: Self) {
    
    inline def setSlotName(value: String | ExpressionNode): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotProps(value: PropsExpression): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
  }
}
