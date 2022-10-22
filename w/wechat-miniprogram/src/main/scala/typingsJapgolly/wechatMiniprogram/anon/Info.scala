package typingsJapgolly.wechatMiniprogram.anon

import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.audioBitrate
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.netJitter
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.netSpeed
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.videoBitrate
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.videoFPS
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.videoGOP
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.videoHeight
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.videoWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  /**
    * 网络状态数据
    *
    * -`videoBitrate` 当前视频编/码器输出的比特率，单位 kbps
    * -`audioBitrate` 当前音频编/码器输出的比特率，单位 kbps
    * -`videoFPS` 当前视频帧率
    * -`videoGOP` 当前视频 GOP,也就是每两个关键帧(I帧)间隔时长，单位 s
    * -`netSpeed` 当前的发送/接收速度
    * -`netJitter` 网络抖动情况，抖动越大，网络越不稳定
    * -`videoWidth` 视频画面的宽度
    * -`videoHeight` 视频画面的高度
    */
  var info: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
}
object Info {
  
  inline def apply(
    info: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
  ): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setInfo(
      value: videoBitrate | audioBitrate | videoFPS | videoGOP | netSpeed | netJitter | videoWidth | videoHeight
    ): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
