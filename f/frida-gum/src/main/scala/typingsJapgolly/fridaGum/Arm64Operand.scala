package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.Arm64RegOperand
  - typingsJapgolly.fridaGum.Arm64ImmOperand
  - typingsJapgolly.fridaGum.Arm64MemOperand
  - typingsJapgolly.fridaGum.Arm64FpOperand
  - typingsJapgolly.fridaGum.Arm64CimmOperand
  - typingsJapgolly.fridaGum.Arm64RegMrsOperand
  - typingsJapgolly.fridaGum.Arm64RegMsrOperand
  - typingsJapgolly.fridaGum.Arm64PstateOperand
  - typingsJapgolly.fridaGum.Arm64SysOperand
  - typingsJapgolly.fridaGum.Arm64PrefetchOperand
  - typingsJapgolly.fridaGum.Arm64BarrierOperand
*/
trait Arm64Operand extends StObject
object Arm64Operand {
  
  inline def Arm64BarrierOperand(access: OperandAccess, value: Double): typingsJapgolly.fridaGum.Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("barrier")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64BarrierOperand]
  }
  
  inline def Arm64CimmOperand(access: OperandAccess, value: Int64): typingsJapgolly.fridaGum.Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64CimmOperand]
  }
  
  inline def Arm64FpOperand(access: OperandAccess, value: Double): typingsJapgolly.fridaGum.Arm64FpOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64FpOperand]
  }
  
  inline def Arm64ImmOperand(access: OperandAccess, value: Int64): typingsJapgolly.fridaGum.Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64ImmOperand]
  }
  
  inline def Arm64MemOperand(access: OperandAccess, value: Index): typingsJapgolly.fridaGum.Arm64MemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64MemOperand]
  }
  
  inline def Arm64PrefetchOperand(access: OperandAccess, value: Double): typingsJapgolly.fridaGum.Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prefetch")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64PrefetchOperand]
  }
  
  inline def Arm64PstateOperand(access: OperandAccess, value: Double): typingsJapgolly.fridaGum.Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pstate")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64PstateOperand]
  }
  
  inline def Arm64RegMrsOperand(access: OperandAccess, value: Arm64Register): typingsJapgolly.fridaGum.Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-mrs")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64RegMrsOperand]
  }
  
  inline def Arm64RegMsrOperand(access: OperandAccess, value: Arm64Register): typingsJapgolly.fridaGum.Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-msr")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64RegMsrOperand]
  }
  
  inline def Arm64RegOperand(access: OperandAccess, value: Arm64Register): typingsJapgolly.fridaGum.Arm64RegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64RegOperand]
  }
  
  inline def Arm64SysOperand(access: OperandAccess, value: Double): typingsJapgolly.fridaGum.Arm64SysOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sys")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.Arm64SysOperand]
  }
}
