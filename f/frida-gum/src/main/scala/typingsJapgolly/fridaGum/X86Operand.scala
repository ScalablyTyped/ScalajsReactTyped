package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.X86RegOperand
  - typingsJapgolly.fridaGum.X86ImmOperand
  - typingsJapgolly.fridaGum.X86MemOperand
*/
trait X86Operand extends StObject
object X86Operand {
  
  inline def X86ImmOperand(access: OperandAccess, size: Double, value: Double | Int64): typingsJapgolly.fridaGum.X86ImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.X86ImmOperand]
  }
  
  inline def X86MemOperand(access: OperandAccess, size: Double, value: Base): typingsJapgolly.fridaGum.X86MemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.X86MemOperand]
  }
  
  inline def X86RegOperand(access: OperandAccess, size: Double, value: X86Register): typingsJapgolly.fridaGum.X86RegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.X86RegOperand]
  }
}
