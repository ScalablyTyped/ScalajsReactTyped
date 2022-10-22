package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUploadFileTask extends StObject {
  
  def abort(args: Any*): Any
  @JSName("abort")
  var abort_Original: AnyFunction
  
  def onProgressUpdate(fn: js.Function1[/* event */ IProgressUpdateEvent, Unit]): Unit
}
object IUploadFileTask {
  
  inline def apply(
    abort: AnyFunction,
    onProgressUpdate: js.Function1[/* event */ IProgressUpdateEvent, Unit] => Callback
  ): IUploadFileTask = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], onProgressUpdate = js.Any.fromFunction1((t0: js.Function1[/* event */ IProgressUpdateEvent, Unit]) => onProgressUpdate(t0).runNow()))
    __obj.asInstanceOf[IUploadFileTask]
  }
  
  extension [Self <: IUploadFileTask](x: Self) {
    
    inline def setAbort(value: AnyFunction): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setOnProgressUpdate(value: js.Function1[/* event */ IProgressUpdateEvent, Unit] => Callback): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1((t0: js.Function1[/* event */ IProgressUpdateEvent, Unit]) => value(t0).runNow()))
  }
}
