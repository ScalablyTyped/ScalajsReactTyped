package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.fridaGumStrings.sysreg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmSysregOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: sysreg
  
  var value: ArmRegister
}
object ArmSysregOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: ArmRegister): ArmSysregOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sysreg")
    __obj.asInstanceOf[ArmSysregOperand]
  }
  
  extension [Self <: ArmSysregOperand](x: Self) {
    
    inline def setType(value: sysreg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArmRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
