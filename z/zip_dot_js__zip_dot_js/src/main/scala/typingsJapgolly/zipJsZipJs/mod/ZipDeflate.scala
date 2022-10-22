package typingsJapgolly.zipJsZipJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an intance used to compress data.
  */
trait ZipDeflate
  extends StObject
     with SyncCodec {
  
  /**
    * Flushes the data
    * 
    * @returns A chunk of compressed data.
    */
  def flush(): js.typedarray.Uint8Array
}
object ZipDeflate {
  
  inline def apply(
    append: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
    flush: CallbackTo[js.typedarray.Uint8Array]
  ): ZipDeflate = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), flush = flush.toJsFn)
    __obj.asInstanceOf[ZipDeflate]
  }
  
  extension [Self <: ZipDeflate](x: Self) {
    
    inline def setFlush(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "flush", value.toJsFn)
  }
}
