package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.pause
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.resume
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.start
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.stop
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.timeupdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorder extends StObject {
  
  /** [Promise MediaRecorder.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.destroy.html)
    *
    * 销毁录制器
    *
    * 最低基础库： `2.11.0` */
  def destroy(): js.Promise[Any]
  
  /** [MediaRecorder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行。
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Unit
  
  /** [MediaRecorder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行。
    *
    * 最低基础库： `2.11.0` */
  def on(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 录制开始事件。;
    * - 'stop': 录制结束事件。返回 {tempFilePath, duration, fileSize};
    * - 'pause': 录制暂停事件。;
    * - 'resume': 录制继续事件。;
    * - 'timeupdate': 录制时间更新事件。; */
  eventName: start | stop | pause | resume | timeupdate,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]
  ): Unit
  
  /** [Promise MediaRecorder.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.pause.html)
    *
    * 暂停录制
    *
    * 最低基础库： `2.11.0` */
  def pause(): js.Promise[Any]
  
  /** [Promise MediaRecorder.requestFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.requestFrame.html)
    *
    * 请求下一帧录制，在 callback 里完成一帧渲染后开始录制当前帧
    *
    * 最低基础库： `2.11.0` */
  def requestFrame(callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any]
  
  /** [Promise MediaRecorder.resume()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.resume.html)
    *
    * 恢复录制
    *
    * 最低基础库： `2.11.0` */
  def resume(): js.Promise[Any]
  
  /** [Promise MediaRecorder.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.start.html)
    *
    * 开始录制
    *
    * 最低基础库： `2.11.0` */
  def start(): js.Promise[Any]
  
  /** [Promise MediaRecorder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.stop.html)
    *
    * 结束录制
    *
    * 最低基础库： `2.11.0` */
  def stop(): js.Promise[Any]
}
object MediaRecorder {
  
  inline def apply(
    destroy: CallbackTo[js.Promise[Any]],
    off: (String, js.Function1[/* repeated */ Any, Any]) => Callback,
    on: (start | stop | pause | resume | timeupdate, js.Function1[/* repeated */ Any, Any]) => Callback,
    pause: CallbackTo[js.Promise[Any]],
    requestFrame: js.Function1[/* repeated */ Any, Any] => js.Promise[Any],
    resume: CallbackTo[js.Promise[Any]],
    start: CallbackTo[js.Promise[Any]],
    stop: CallbackTo[js.Promise[Any]]
  ): MediaRecorder = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, off = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: start | stop | pause | resume | timeupdate, t1: js.Function1[/* repeated */ Any, Any]) => (on(t0, t1)).runNow()), pause = pause.toJsFn, requestFrame = js.Any.fromFunction1(requestFrame), resume = resume.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[MediaRecorder]
  }
  
  extension [Self <: MediaRecorder](x: Self) {
    
    inline def setDestroy(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOff(value: (String, js.Function1[/* repeated */ Any, Any]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setOn(
      value: (start | stop | pause | resume | timeupdate, js.Function1[/* repeated */ Any, Any]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: start | stop | pause | resume | timeupdate, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setPause(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setRequestFrame(value: js.Function1[/* repeated */ Any, Any] => js.Promise[Any]): Self = StObject.set(x, "requestFrame", js.Any.fromFunction1(value))
    
    inline def setResume(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStart(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
