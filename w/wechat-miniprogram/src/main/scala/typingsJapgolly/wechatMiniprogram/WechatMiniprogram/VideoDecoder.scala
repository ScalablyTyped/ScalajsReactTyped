package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.bufferchange
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.ended
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.seek
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.start
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoder extends StObject {
  
  /** [Object VideoDecoder.getFrameData()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.getFrameData.html)
    *
    * 获取下一帧的解码数据
    *
    * 最低基础库： `2.11.0` */
  def getFrameData(): FrameDataOptions
  
  /** [VideoDecoder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Unit
  
  /** [VideoDecoder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行
    *
    * 最低基础库： `2.11.0` */
  def on(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: start | stop | seek | bufferchange | ended,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]
  ): Unit
  
  /** [Promise VideoDecoder.remove()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.remove.html)
    *
    * 移除解码器
    *
    * 最低基础库： `2.11.0` */
  def remove(): js.Promise[Any]
  
  /** [Promise VideoDecoder.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.seek.html)
    *
    * 跳到某个时间点解码
    *
    * 最低基础库： `2.11.0` */
  def seek(/** 跳转的解码位置，单位 ms */
  position: Double): js.Promise[Any]
  
  /** [Promise VideoDecoder.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.start.html)
    *
    * 开始解码
    *
    * 最低基础库： `2.11.0` */
  def start(option: VideoDecoderStartOption): js.Promise[Any]
  
  /** [Promise VideoDecoder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.stop.html)
    *
    * 停止解码
    *
    * 最低基础库： `2.11.0` */
  def stop(): js.Promise[Any]
}
object VideoDecoder {
  
  inline def apply(
    getFrameData: CallbackTo[FrameDataOptions],
    off: (String, js.Function1[/* repeated */ Any, Any]) => Callback,
    on: (start | stop | seek | bufferchange | ended, js.Function1[/* repeated */ Any, Any]) => Callback,
    remove: CallbackTo[js.Promise[Any]],
    seek: Double => js.Promise[Any],
    start: VideoDecoderStartOption => js.Promise[Any],
    stop: CallbackTo[js.Promise[Any]]
  ): VideoDecoder = {
    val __obj = js.Dynamic.literal(getFrameData = getFrameData.toJsFn, off = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: start | stop | seek | bufferchange | ended, t1: js.Function1[/* repeated */ Any, Any]) => (on(t0, t1)).runNow()), remove = remove.toJsFn, seek = js.Any.fromFunction1(seek), start = js.Any.fromFunction1(start), stop = stop.toJsFn)
    __obj.asInstanceOf[VideoDecoder]
  }
  
  extension [Self <: VideoDecoder](x: Self) {
    
    inline def setGetFrameData(value: CallbackTo[FrameDataOptions]): Self = StObject.set(x, "getFrameData", value.toJsFn)
    
    inline def setOff(value: (String, js.Function1[/* repeated */ Any, Any]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setOn(
      value: (start | stop | seek | bufferchange | ended, js.Function1[/* repeated */ Any, Any]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: start | stop | seek | bufferchange | ended, t1: js.Function1[/* repeated */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSeek(value: Double => js.Promise[Any]): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setStart(value: VideoDecoderStartOption => js.Promise[Any]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
