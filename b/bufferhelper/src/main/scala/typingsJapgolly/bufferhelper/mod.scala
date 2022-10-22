package typingsJapgolly.bufferhelper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bufferhelper", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BufferHelper {
    
    /* CompleteClass */
    override def concat(buffer: Any): BufferHelper = js.native
    
    /* CompleteClass */
    override def empty(): BufferHelper = js.native
    
    /* CompleteClass */
    override def load(stream: Any, callback: js.Function1[/* arg */ Any, Any]): Unit = js.native
    
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
    
    /* CompleteClass */
    override def toString(encoding: encoding): String = js.native
  }
  
  trait BufferHelper extends StObject {
    
    def concat(buffer: Any): BufferHelper
    
    def empty(): BufferHelper
    
    def load(stream: Any, callback: js.Function1[/* arg */ Any, Any]): Unit
    
    def toBuffer(): Buffer
    
    def toString(encoding: encoding): String
  }
  object BufferHelper {
    
    inline def apply(
      concat: Any => BufferHelper,
      empty: CallbackTo[BufferHelper],
      load: (Any, js.Function1[/* arg */ Any, Any]) => Callback,
      toBuffer: CallbackTo[Buffer],
      toString_ : encoding => String
    ): BufferHelper = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = empty.toJsFn, load = js.Any.fromFunction2((t0: Any, t1: js.Function1[/* arg */ Any, Any]) => (load(t0, t1)).runNow()), toBuffer = toBuffer.toJsFn)
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[BufferHelper]
    }
    
    extension [Self <: BufferHelper](x: Self) {
      
      inline def setConcat(value: Any => BufferHelper): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: CallbackTo[BufferHelper]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setLoad(value: (Any, js.Function1[/* arg */ Any, Any]) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction2((t0: Any, t1: js.Function1[/* arg */ Any, Any]) => (value(t0, t1)).runNow()))
      
      inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
      
      inline def setToString_(value: encoding => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bufferhelper.bufferhelperStrings.ascii
    - typingsJapgolly.bufferhelper.bufferhelperStrings.utf8
    - typingsJapgolly.bufferhelper.bufferhelperStrings.utf16le
    - typingsJapgolly.bufferhelper.bufferhelperStrings.ucs2
    - typingsJapgolly.bufferhelper.bufferhelperStrings.base64
    - typingsJapgolly.bufferhelper.bufferhelperStrings.binary
    - typingsJapgolly.bufferhelper.bufferhelperStrings.hex
  */
  trait encoding extends StObject
  object encoding {
    
    inline def ascii: typingsJapgolly.bufferhelper.bufferhelperStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.ascii]
    
    inline def base64: typingsJapgolly.bufferhelper.bufferhelperStrings.base64 = "base64".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.base64]
    
    inline def binary: typingsJapgolly.bufferhelper.bufferhelperStrings.binary = "binary".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.binary]
    
    inline def hex: typingsJapgolly.bufferhelper.bufferhelperStrings.hex = "hex".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.hex]
    
    inline def ucs2: typingsJapgolly.bufferhelper.bufferhelperStrings.ucs2 = "ucs2".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.ucs2]
    
    inline def utf16le: typingsJapgolly.bufferhelper.bufferhelperStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.utf16le]
    
    inline def utf8: typingsJapgolly.bufferhelper.bufferhelperStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.bufferhelper.bufferhelperStrings.utf8]
  }
}
