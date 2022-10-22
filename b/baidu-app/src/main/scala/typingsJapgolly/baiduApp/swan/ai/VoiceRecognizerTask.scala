package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.DataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecognizerTask extends StObject {
  
  // 停止;
  def cancel(): Unit
  
  // 识别完成;
  def onError(callback: js.Function1[/* res */ VoiceErrorResponse, Unit]): Unit
  
  // ;有识别结果返回
  def onFinish(callback: js.Function1[/* res */ DataResponse, Unit]): Unit
  
  // 引擎准备就绪，可以开始说话;
  def onRecognize(callback: js.Function1[/* res */ VoiceRecognizeResponse, Unit]): Unit
  
  // 取消;
  def onStart(callback: js.Function0[Unit]): Unit
  
  def start(options: VoiceRecognizerStart): Unit
  
  // 开始;
  def stop(): Unit
}
object VoiceRecognizerTask {
  
  inline def apply(
    cancel: Callback,
    onError: js.Function1[/* res */ VoiceErrorResponse, Unit] => Callback,
    onFinish: js.Function1[/* res */ DataResponse, Unit] => Callback,
    onRecognize: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Callback,
    onStart: js.Function0[Unit] => Callback,
    start: VoiceRecognizerStart => Callback,
    stop: Callback
  ): VoiceRecognizerTask = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, onError = js.Any.fromFunction1((t0: js.Function1[/* res */ VoiceErrorResponse, Unit]) => onError(t0).runNow()), onFinish = js.Any.fromFunction1((t0: js.Function1[/* res */ DataResponse, Unit]) => onFinish(t0).runNow()), onRecognize = js.Any.fromFunction1((t0: js.Function1[/* res */ VoiceRecognizeResponse, Unit]) => onRecognize(t0).runNow()), onStart = js.Any.fromFunction1((t0: js.Function0[Unit]) => onStart(t0).runNow()), start = js.Any.fromFunction1((t0: VoiceRecognizerStart) => start(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[VoiceRecognizerTask]
  }
  
  extension [Self <: VoiceRecognizerTask](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setOnError(value: js.Function1[/* res */ VoiceErrorResponse, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ VoiceErrorResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnFinish(value: js.Function1[/* res */ DataResponse, Unit] => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction1((t0: js.Function1[/* res */ DataResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnRecognize(value: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Callback): Self = StObject.set(x, "onRecognize", js.Any.fromFunction1((t0: js.Function1[/* res */ VoiceRecognizeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnStart(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setStart(value: VoiceRecognizerStart => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: VoiceRecognizerStart) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
