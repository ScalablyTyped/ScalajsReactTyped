package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.anon.Disp
import typingsJapgolly.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmMemOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: mem
  
  var value: Disp
}
object ArmMemOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Disp): ArmMemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[ArmMemOperand]
  }
  
  extension [Self <: ArmMemOperand](x: Self) {
    
    inline def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Disp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
