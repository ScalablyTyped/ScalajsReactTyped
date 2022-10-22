package typingsJapgolly.ethereumjsVm

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmMemoryMod {
  
  @JSImport("ethereumjs-vm/dist/evm/memory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Memory {
    
    /* CompleteClass */
    var _store: js.Array[Double] = js.native
    
    /**
      * Extends the memory given an offset and size. Rounds extended
      * memory to word-size.
      */
    /* CompleteClass */
    override def extend(offset: Double, size: Double): Unit = js.native
    
    /**
      * Reads a slice of memory from `offset` till `offset + size` as a `Buffer`.
      * It fills up the difference between memory's length and `offset + size` with zeros.
      * @param offset - Starting position
      * @param size - How many bytes to read
      */
    /* CompleteClass */
    override def read(offset: Double, size: Double): Buffer = js.native
    
    /**
      * Writes a byte array with length `size` to memory, starting from `offset`.
      * @param offset - Starting position
      * @param size - How many bytes to write
      * @param value - Value
      */
    /* CompleteClass */
    override def write(offset: Double, size: Double, value: Buffer): Unit = js.native
  }
  
  trait Memory extends StObject {
    
    var _store: js.Array[Double]
    
    /**
      * Extends the memory given an offset and size. Rounds extended
      * memory to word-size.
      */
    def extend(offset: Double, size: Double): Unit
    
    /**
      * Reads a slice of memory from `offset` till `offset + size` as a `Buffer`.
      * It fills up the difference between memory's length and `offset + size` with zeros.
      * @param offset - Starting position
      * @param size - How many bytes to read
      */
    def read(offset: Double, size: Double): Buffer
    
    /**
      * Writes a byte array with length `size` to memory, starting from `offset`.
      * @param offset - Starting position
      * @param size - How many bytes to write
      * @param value - Value
      */
    def write(offset: Double, size: Double, value: Buffer): Unit
  }
  object Memory {
    
    inline def apply(
      _store: js.Array[Double],
      extend: (Double, Double) => Callback,
      read: (Double, Double) => Buffer,
      write: (Double, Double, Buffer) => Callback
    ): Memory = {
      val __obj = js.Dynamic.literal(_store = _store.asInstanceOf[js.Any], extend = js.Any.fromFunction2((t0: Double, t1: Double) => (extend(t0, t1)).runNow()), read = js.Any.fromFunction2(read), write = js.Any.fromFunction3((t0: Double, t1: Double, t2: Buffer) => (write(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Memory]
    }
    
    extension [Self <: Memory](x: Self) {
      
      inline def setExtend(value: (Double, Double) => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setRead(value: (Double, Double) => Buffer): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setWrite(value: (Double, Double, Buffer) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction3((t0: Double, t1: Double, t2: Buffer) => (value(t0, t1, t2)).runNow()))
      
      inline def set_store(value: js.Array[Double]): Self = StObject.set(x, "_store", value.asInstanceOf[js.Any])
      
      inline def set_storeVarargs(value: Double*): Self = StObject.set(x, "_store", js.Array(value*))
    }
  }
}
