package typingsJapgolly.baiduApp.swan.ai

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.swan.DataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceRecognizerTask extends js.Object {
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
  @scala.inline
  def apply(
    cancel: Callback,
    onError: js.Function1[/* res */ VoiceErrorResponse, Unit] => Callback,
    onFinish: js.Function1[/* res */ DataResponse, Unit] => Callback,
    onRecognize: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Callback,
    onStart: js.Function0[Unit] => Callback,
    start: VoiceRecognizerStart => Callback,
    stop: Callback
  ): VoiceRecognizerTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ai.VoiceErrorResponse, scala.Unit]) => onError(t0).runNow()))
    __obj.updateDynamic("onFinish")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.DataResponse, scala.Unit]) => onFinish(t0).runNow()))
    __obj.updateDynamic("onRecognize")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ai.VoiceRecognizeResponse, scala.Unit]) => onRecognize(t0).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onStart(t0).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.ai.VoiceRecognizerStart) => start(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[VoiceRecognizerTask]
  }
}

