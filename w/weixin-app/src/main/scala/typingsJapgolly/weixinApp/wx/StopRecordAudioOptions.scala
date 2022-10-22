package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecordAudioOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_StopRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
}
object StopRecordAudioOptions {
  
  inline def apply(): StopRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordAudioOptions]
  }
  
  extension [Self <: StopRecordAudioOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ TempFileResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ TempFileResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
