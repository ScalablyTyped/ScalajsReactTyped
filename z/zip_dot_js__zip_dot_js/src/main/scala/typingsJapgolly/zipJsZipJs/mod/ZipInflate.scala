package typingsJapgolly.zipJsZipJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a codec used to decompress data.
  */
trait ZipInflate
  extends StObject
     with SyncCodec {
  
  /**
    * Flushes the data
    */
  def flush(): Unit
}
object ZipInflate {
  
  inline def apply(append: js.typedarray.Uint8Array => js.typedarray.Uint8Array, flush: Callback): ZipInflate = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), flush = flush.toJsFn)
    __obj.asInstanceOf[ZipInflate]
  }
  
  extension [Self <: ZipInflate](x: Self) {
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
  }
}
