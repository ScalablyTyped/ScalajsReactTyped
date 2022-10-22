package typingsJapgolly.braftEditor.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(err: Msg): Unit
  
  var file: File
  
  var libraryId: String
  
  def progress(progress: Double): Unit
  
  def success(res: Meta): Unit
}
object Error {
  
  inline def apply(
    error: Msg => Callback,
    file: File,
    libraryId: String,
    progress: Double => Callback,
    success: Meta => Callback
  ): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Msg) => error(t0).runNow()), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1((t0: Double) => progress(t0).runNow()), success = js.Any.fromFunction1((t0: Meta) => success(t0).runNow()))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Msg => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Msg) => value(t0).runNow()))
    
    inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setLibraryId(value: String): Self = StObject.set(x, "libraryId", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSuccess(value: Meta => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Meta) => value(t0).runNow()))
  }
}
