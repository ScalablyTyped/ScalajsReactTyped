package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManager extends StObject {
  
  /** [RecorderManager.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onError.html)
    *
    * 监听录音错误事件 */
  def onError(/** 录音错误事件的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit
  
  /** [RecorderManager.onFrameRecorded(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onFrameRecorded.html)
    *
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。 */
  def onFrameRecorded(/** 已录制完指定帧大小的文件事件的回调函数 */
  callback: OnFrameRecordedCallback): Unit
  
  /** [RecorderManager.onInterruptionBegin(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onInterruptionBegin.html)
    *
    * 监听录音因为受到系统占用而被中断开始事件。以下场景会触发此事件：微信语音聊天、微信视频聊天。此事件触发后，录音会被暂停。pause 事件在此事件后触发
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionBegin(/** 录音因为受到系统占用而被中断开始事件的回调函数 */
  callback: OnInterruptionBeginCallback): Unit
  
  /** [RecorderManager.onInterruptionEnd(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onInterruptionEnd.html)
    *
    * 监听录音中断结束事件。在收到 interruptionBegin 事件之后，小程序内所有录音会暂停，收到此事件之后才可再次录音成功。
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionEnd(/** 录音中断结束事件的回调函数 */
  callback: OnInterruptionEndCallback): Unit
  
  /** [RecorderManager.onPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onPause.html)
    *
    * 监听录音暂停事件 */
  def onPause(/** 录音暂停事件的回调函数 */
  callback: OnPauseCallback): Unit
  
  /** [RecorderManager.onResume(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onResume.html)
    *
    * 监听录音继续事件 */
  def onResume(/** 录音继续事件的回调函数 */
  callback: OnResumeCallback): Unit
  
  /** [RecorderManager.onStart(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onStart.html)
    *
    * 监听录音开始事件 */
  def onStart(/** 录音开始事件的回调函数 */
  callback: OnStartCallback): Unit
  
  /** [RecorderManager.onStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onStop.html)
    *
    * 监听录音结束事件 */
  def onStop(/** 录音结束事件的回调函数 */
  callback: RecorderManagerOnStopCallback): Unit
  
  /** [RecorderManager.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.pause.html)
    *
    * 暂停录音 */
  def pause(): Unit
  
  /** [RecorderManager.resume()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.resume.html)
    *
    * 继续录音 */
  def resume(): Unit
  
  /** [RecorderManager.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.start.html)
    *
    * 开始录音
    *
    * **采样率与编码码率限制**
    *
    *
    *  每种采样率有对应的编码码率范围有效值，设置不合法的采样率或编码码率会导致录音失败，具体对应关系如下表。
    *
    * | 采样率 | 编码码率       |
    * | ------ | -------------- |
    * | 8000   | 16000 ~ 48000  |
    * | 11025  | 16000 ~ 48000  |
    * | 12000  | 24000 ~ 64000  |
    * | 16000  | 24000 ~ 96000  |
    * | 22050  | 32000 ~ 128000 |
    * | 24000  | 32000 ~ 128000 |
    * | 32000  | 48000 ~ 192000 |
    * | 44100  | 64000 ~ 320000 |
    * | 48000  | 64000 ~ 320000 | */
  def start(option: RecorderManagerStartOption): Unit
  
  /** [RecorderManager.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.stop.html)
    *
    * 停止录音 */
  def stop(): Unit
}
object RecorderManager {
  
  inline def apply(
    onError: UDPSocketOnErrorCallback => Callback,
    onFrameRecorded: OnFrameRecordedCallback => Callback,
    onInterruptionBegin: OnInterruptionBeginCallback => Callback,
    onInterruptionEnd: OnInterruptionEndCallback => Callback,
    onPause: OnPauseCallback => Callback,
    onResume: OnResumeCallback => Callback,
    onStart: OnStartCallback => Callback,
    onStop: RecorderManagerOnStopCallback => Callback,
    pause: Callback,
    resume: Callback,
    start: RecorderManagerStartOption => Callback,
    stop: Callback
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: UDPSocketOnErrorCallback) => onError(t0).runNow()), onFrameRecorded = js.Any.fromFunction1((t0: OnFrameRecordedCallback) => onFrameRecorded(t0).runNow()), onInterruptionBegin = js.Any.fromFunction1((t0: OnInterruptionBeginCallback) => onInterruptionBegin(t0).runNow()), onInterruptionEnd = js.Any.fromFunction1((t0: OnInterruptionEndCallback) => onInterruptionEnd(t0).runNow()), onPause = js.Any.fromFunction1((t0: OnPauseCallback) => onPause(t0).runNow()), onResume = js.Any.fromFunction1((t0: OnResumeCallback) => onResume(t0).runNow()), onStart = js.Any.fromFunction1((t0: OnStartCallback) => onStart(t0).runNow()), onStop = js.Any.fromFunction1((t0: RecorderManagerOnStopCallback) => onStop(t0).runNow()), pause = pause.toJsFn, resume = resume.toJsFn, start = js.Any.fromFunction1((t0: RecorderManagerStartOption) => start(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[RecorderManager]
  }
  
  extension [Self <: RecorderManager](x: Self) {
    
    inline def setOnError(value: UDPSocketOnErrorCallback => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: UDPSocketOnErrorCallback) => value(t0).runNow()))
    
    inline def setOnFrameRecorded(value: OnFrameRecordedCallback => Callback): Self = StObject.set(x, "onFrameRecorded", js.Any.fromFunction1((t0: OnFrameRecordedCallback) => value(t0).runNow()))
    
    inline def setOnInterruptionBegin(value: OnInterruptionBeginCallback => Callback): Self = StObject.set(x, "onInterruptionBegin", js.Any.fromFunction1((t0: OnInterruptionBeginCallback) => value(t0).runNow()))
    
    inline def setOnInterruptionEnd(value: OnInterruptionEndCallback => Callback): Self = StObject.set(x, "onInterruptionEnd", js.Any.fromFunction1((t0: OnInterruptionEndCallback) => value(t0).runNow()))
    
    inline def setOnPause(value: OnPauseCallback => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: OnPauseCallback) => value(t0).runNow()))
    
    inline def setOnResume(value: OnResumeCallback => Callback): Self = StObject.set(x, "onResume", js.Any.fromFunction1((t0: OnResumeCallback) => value(t0).runNow()))
    
    inline def setOnStart(value: OnStartCallback => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: OnStartCallback) => value(t0).runNow()))
    
    inline def setOnStop(value: RecorderManagerOnStopCallback => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: RecorderManagerOnStopCallback) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStart(value: RecorderManagerStartOption => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: RecorderManagerStartOption) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
