package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.audio
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 可通过 [MediaContainer.extractDataSource](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.extractDataSource.html) 返回。
  *
  * [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) 音频或视频轨道，可以对轨道进行一些操作
  *
  * 最低基础库： `2.9.0` */
trait MediaTrack extends StObject {
  
  /** 轨道长度，只读 */
  var duration: Double
  
  /** 轨道类型，只读
    *
    * 可选值：
    * - 'audio': 音频轨道;
    * - 'video': 视频轨道; */
  var kind: audio | video
  
  /** 音量，音频轨道下有效，可写 */
  var volume: Double
}
object MediaTrack {
  
  inline def apply(duration: Double, kind: audio | video, volume: Double): MediaTrack = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrack]
  }
  
  extension [Self <: MediaTrack](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setKind(value: audio | video): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
