package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
trait ThumbRelocator extends StObject {
  
  /**
    * Copies out the next buffered instruction without advancing the
    * output cursor, allowing the same instruction to be written out
    * multiple times.
    */
  def copyOne(): Boolean
  
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit
  
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  var eob: Boolean
  
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  var eoi: Boolean
  
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  var input: Instruction | Null
  
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  def peekNextWriteInsn(): Instruction | Null
  
  /**
    * Peeks at the address of the next instruction to be written or skipped.
    */
  def peekNextWriteSource(): NativePointer
  
  /**
    * Reads the next instruction into the relocator's internal buffer
    * and returns the number of bytes read so far, including previous
    * calls.
    *
    * You may keep calling this method to keep buffering, or immediately
    * call either `writeOne()` or `skipOne()`. Or, you can buffer up
    * until the desired point and then call `writeAll()`.
    *
    * Returns zero when end-of-input is reached, which means the `eoi`
    * property is now `true`.
    */
  def readOne(): Double
  
  /**
    * Recycles instance.
    */
  def reset(inputCode: NativePointerValue, output: ThumbWriter): Unit
  
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit
  
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit
  
  /**
    * Writes the next buffered instruction.
    */
  def writeOne(): Boolean
}
object ThumbRelocator {
  
  inline def apply(
    copyOne: CallbackTo[Boolean],
    dispose: Callback,
    eob: Boolean,
    eoi: Boolean,
    peekNextWriteInsn: CallbackTo[Instruction | Null],
    peekNextWriteSource: CallbackTo[NativePointer],
    readOne: CallbackTo[Double],
    reset: (NativePointerValue, ThumbWriter) => Callback,
    skipOne: Callback,
    writeAll: Callback,
    writeOne: CallbackTo[Boolean]
  ): ThumbRelocator = {
    val __obj = js.Dynamic.literal(copyOne = copyOne.toJsFn, dispose = dispose.toJsFn, eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = peekNextWriteInsn.toJsFn, peekNextWriteSource = peekNextWriteSource.toJsFn, readOne = readOne.toJsFn, reset = js.Any.fromFunction2((t0: NativePointerValue, t1: ThumbWriter) => (reset(t0, t1)).runNow()), skipOne = skipOne.toJsFn, writeAll = writeAll.toJsFn, writeOne = writeOne.toJsFn, input = null)
    __obj.asInstanceOf[ThumbRelocator]
  }
  
  extension [Self <: ThumbRelocator](x: Self) {
    
    inline def setCopyOne(value: CallbackTo[Boolean]): Self = StObject.set(x, "copyOne", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setEob(value: Boolean): Self = StObject.set(x, "eob", value.asInstanceOf[js.Any])
    
    inline def setEoi(value: Boolean): Self = StObject.set(x, "eoi", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Instruction): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setPeekNextWriteInsn(value: CallbackTo[Instruction | Null]): Self = StObject.set(x, "peekNextWriteInsn", value.toJsFn)
    
    inline def setPeekNextWriteSource(value: CallbackTo[NativePointer]): Self = StObject.set(x, "peekNextWriteSource", value.toJsFn)
    
    inline def setReadOne(value: CallbackTo[Double]): Self = StObject.set(x, "readOne", value.toJsFn)
    
    inline def setReset(value: (NativePointerValue, ThumbWriter) => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction2((t0: NativePointerValue, t1: ThumbWriter) => (value(t0, t1)).runNow()))
    
    inline def setSkipOne(value: Callback): Self = StObject.set(x, "skipOne", value.toJsFn)
    
    inline def setWriteAll(value: Callback): Self = StObject.set(x, "writeAll", value.toJsFn)
    
    inline def setWriteOne(value: CallbackTo[Boolean]): Self = StObject.set(x, "writeOne", value.toJsFn)
  }
}
