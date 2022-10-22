package typingsJapgolly.awsLambda.triggerLexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ScalarSlotValue
  - typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ListSlotValue
*/
trait LexV2Slot extends StObject
object LexV2Slot {
  
  inline def LexV2ListSlotValue(value: LexV2SlotValue, values: js.Array[LexV2ScalarSlotValue]): typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ListSlotValue = {
    val __obj = js.Dynamic.literal(shape = "List", value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ListSlotValue]
  }
  
  inline def LexV2ScalarSlotValue(value: LexV2SlotValue): typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ScalarSlotValue = {
    val __obj = js.Dynamic.literal(shape = "Scalar", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ScalarSlotValue]
  }
}
