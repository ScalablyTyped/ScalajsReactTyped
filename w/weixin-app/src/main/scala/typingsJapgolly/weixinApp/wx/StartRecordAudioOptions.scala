package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----录音
trait StartRecordAudioOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 录音成功后调用，返回录音文件的临时文件路径，res = {tempFilePath: '录音文件的临时路径'} */
  @JSName("success")
  var success_StartRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
}
object StartRecordAudioOptions {
  
  inline def apply(): StartRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecordAudioOptions]
  }
  
  extension [Self <: StartRecordAudioOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ TempFileResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ TempFileResponse) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
