package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X86Instruction
  extends StObject
     with Instruction {
  
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[X86Operand]
  
  /**
    * Registers accessed by this instruction, either implicitly or explicitly.
    */
  var regsAccessed: RegsAccessed[X86Register]
  
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[X86Register]
  
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[X86Register]
}
object X86Instruction {
  
  inline def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[X86Operand],
    regsAccessed: RegsAccessed[X86Register],
    regsRead: js.Array[X86Register],
    regsWritten: js.Array[X86Register],
    size: Double
  ): X86Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsAccessed = regsAccessed.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Instruction]
  }
  
  extension [Self <: X86Instruction](x: Self) {
    
    inline def setOperands(value: js.Array[X86Operand]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    inline def setOperandsVarargs(value: X86Operand*): Self = StObject.set(x, "operands", js.Array(value*))
    
    inline def setRegsAccessed(value: RegsAccessed[X86Register]): Self = StObject.set(x, "regsAccessed", value.asInstanceOf[js.Any])
    
    inline def setRegsRead(value: js.Array[X86Register]): Self = StObject.set(x, "regsRead", value.asInstanceOf[js.Any])
    
    inline def setRegsReadVarargs(value: X86Register*): Self = StObject.set(x, "regsRead", js.Array(value*))
    
    inline def setRegsWritten(value: js.Array[X86Register]): Self = StObject.set(x, "regsWritten", value.asInstanceOf[js.Any])
    
    inline def setRegsWrittenVarargs(value: X86Register*): Self = StObject.set(x, "regsWritten", js.Array(value*))
  }
}
