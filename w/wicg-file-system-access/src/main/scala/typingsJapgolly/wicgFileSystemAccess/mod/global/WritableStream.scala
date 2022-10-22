package typingsJapgolly.wicgFileSystemAccess.mod.global

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: remove this once https://github.com/microsoft/TSJS-lib-generator/issues/881 is fixed.
// Native File System API especially needs this method.
trait WritableStream extends StObject {
  
  def close(): js.Promise[Unit]
}
object WritableStream {
  
  inline def apply(close: CallbackTo[js.Promise[Unit]]): WritableStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[WritableStream]
  }
  
  extension [Self <: WritableStream](x: Self) {
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
  }
}
