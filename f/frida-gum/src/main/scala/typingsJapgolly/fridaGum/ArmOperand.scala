package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.anon.Disp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.ArmRegOperand
  - typingsJapgolly.fridaGum.ArmImmOperand
  - typingsJapgolly.fridaGum.ArmMemOperand
  - typingsJapgolly.fridaGum.ArmFpOperand
  - typingsJapgolly.fridaGum.ArmCimmOperand
  - typingsJapgolly.fridaGum.ArmPimmOperand
  - typingsJapgolly.fridaGum.ArmSetendOperand
  - typingsJapgolly.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends StObject
object ArmOperand {
  
  inline def ArmCimmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typingsJapgolly.fridaGum.ArmCimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmCimmOperand]
  }
  
  inline def ArmFpOperand(access: OperandAccess, subtracted: Boolean, value: Double): typingsJapgolly.fridaGum.ArmFpOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmFpOperand]
  }
  
  inline def ArmImmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typingsJapgolly.fridaGum.ArmImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmImmOperand]
  }
  
  inline def ArmMemOperand(access: OperandAccess, subtracted: Boolean, value: Disp): typingsJapgolly.fridaGum.ArmMemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmMemOperand]
  }
  
  inline def ArmPimmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typingsJapgolly.fridaGum.ArmPimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pimm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmPimmOperand]
  }
  
  inline def ArmRegOperand(access: OperandAccess, subtracted: Boolean, value: ArmRegister): typingsJapgolly.fridaGum.ArmRegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmRegOperand]
  }
  
  inline def ArmSetendOperand(access: OperandAccess, subtracted: Boolean, value: Endian): typingsJapgolly.fridaGum.ArmSetendOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setend")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmSetendOperand]
  }
  
  inline def ArmSysregOperand(access: OperandAccess, subtracted: Boolean, value: ArmRegister): typingsJapgolly.fridaGum.ArmSysregOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sysreg")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ArmSysregOperand]
  }
}
