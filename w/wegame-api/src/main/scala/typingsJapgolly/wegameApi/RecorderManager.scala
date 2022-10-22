package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.anon.AudioSource
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.anon.FrameBuffer
import typingsJapgolly.wegameApi.anon.TempFilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManager extends StObject {
  
  /**
    * 监听录音错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。
    * @param callback.res.frameBuffer 录音分片数据
    * @param callback.res.isLastFrame 当前帧是否正常录音结束前的最后一帧
    */
  def onFrameRecorded(callback: js.Function1[/* res */ FrameBuffer, Unit]): Unit
  
  /**
    * 监听录音暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听录音继续事件
    */
  def onResume(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听录音开始事件
    */
  def onStart(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听录音结束事件
    * @param callback.res.tempFilePath 录音文件的临时路径
    */
  def onStop(callback: js.Function1[/* res */ TempFilePath, Unit]): Unit
  
  /**
    * 暂停录音
    */
  def pause(): Unit
  
  /**
    * 继续录音
    */
  def resume(): Unit
  
  /**
    * 开始录音
    */
  def start(param: AudioSource): Unit
  
  /**
    * 停止录音
    */
  def stop(): Unit
}
object RecorderManager {
  
  inline def apply(
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onFrameRecorded: js.Function1[/* res */ FrameBuffer, Unit] => Callback,
    onPause: js.Function0[Unit] => Callback,
    onResume: js.Function0[Unit] => Callback,
    onStart: js.Function0[Unit] => Callback,
    onStop: js.Function1[/* res */ TempFilePath, Unit] => Callback,
    pause: Callback,
    resume: Callback,
    start: AudioSource => Callback,
    stop: Callback
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onFrameRecorded = js.Any.fromFunction1((t0: js.Function1[/* res */ FrameBuffer, Unit]) => onFrameRecorded(t0).runNow()), onPause = js.Any.fromFunction1((t0: js.Function0[Unit]) => onPause(t0).runNow()), onResume = js.Any.fromFunction1((t0: js.Function0[Unit]) => onResume(t0).runNow()), onStart = js.Any.fromFunction1((t0: js.Function0[Unit]) => onStart(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function1[/* res */ TempFilePath, Unit]) => onStop(t0).runNow()), pause = pause.toJsFn, resume = resume.toJsFn, start = js.Any.fromFunction1((t0: AudioSource) => start(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[RecorderManager]
  }
  
  extension [Self <: RecorderManager](x: Self) {
    
    inline def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => value(t0).runNow()))
    
    inline def setOnFrameRecorded(value: js.Function1[/* res */ FrameBuffer, Unit] => Callback): Self = StObject.set(x, "onFrameRecorded", js.Any.fromFunction1((t0: js.Function1[/* res */ FrameBuffer, Unit]) => value(t0).runNow()))
    
    inline def setOnPause(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnResume(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onResume", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnStart(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function1[/* res */ TempFilePath, Unit] => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function1[/* res */ TempFilePath, Unit]) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStart(value: AudioSource => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: AudioSource) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
