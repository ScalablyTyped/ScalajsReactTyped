package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Defined in lib.d.ts
interface File {
  fullPath: string;
  type: string;
  size: number;
}
*/
trait FileWriter extends StObject {
  
  def abort(): Unit
  
  var error: FileError
  
  var fileName: String
  
  var length: Double
  
  var onabort: js.Function
  
  var onerror: js.Function
  
  var onprogress: js.Function
  
  var onwrite: js.Function
  
  var onwriteend: js.Function
  
  var onwritestart: js.Function
  
  var position: Double
  
  var readyState: Any
  
  def seek(arg: Double): Unit
  
  def truncate(arg: Double): Unit
  
  def write(arg: Any): Unit
}
object FileWriter {
  
  inline def apply(
    abort: Callback,
    error: FileError,
    fileName: String,
    length: Double,
    onabort: js.Function,
    onerror: js.Function,
    onprogress: js.Function,
    onwrite: js.Function,
    onwriteend: js.Function,
    onwritestart: js.Function,
    position: Double,
    readyState: Any,
    seek: Double => Callback,
    truncate: Double => Callback,
    write: Any => Callback
  ): FileWriter = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, error = error.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onabort = onabort.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onwrite = onwrite.asInstanceOf[js.Any], onwriteend = onwriteend.asInstanceOf[js.Any], onwritestart = onwritestart.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), truncate = js.Any.fromFunction1((t0: Double) => truncate(t0).runNow()), write = js.Any.fromFunction1((t0: Any) => write(t0).runNow()))
    __obj.asInstanceOf[FileWriter]
  }
  
  extension [Self <: FileWriter](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setError(value: FileError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOnabort(value: js.Function): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnprogress(value: js.Function): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setOnwrite(value: js.Function): Self = StObject.set(x, "onwrite", value.asInstanceOf[js.Any])
    
    inline def setOnwriteend(value: js.Function): Self = StObject.set(x, "onwriteend", value.asInstanceOf[js.Any])
    
    inline def setOnwritestart(value: js.Function): Self = StObject.set(x, "onwritestart", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: Any): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTruncate(value: Double => Callback): Self = StObject.set(x, "truncate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWrite(value: Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
