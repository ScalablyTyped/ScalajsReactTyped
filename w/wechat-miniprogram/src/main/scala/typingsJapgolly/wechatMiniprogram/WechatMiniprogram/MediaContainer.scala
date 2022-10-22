package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaContainer extends StObject {
  
  /** [MediaContainer.addTrack([MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) track)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.addTrack.html)
    *
    * 将音频或视频轨道添加到容器
    *
    * 最低基础库： `2.9.0` */
  def addTrack(
    /** [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html)
    *
    * 要添加的音频或视频轨道 */
  track: MediaTrack
  ): Unit
  
  /** [MediaContainer.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.destroy.html)
    *
    * 将容器销毁，释放资源
    *
    * 最低基础库： `2.9.0` */
  def destroy(): Unit
  
  /** [MediaContainer.export()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.export.html)
    *
    * 将容器内的轨道合并并导出视频文件
    *
    * 最低基础库： `2.9.0` */
  def `export`(): Unit
  
  /** [MediaContainer.extractDataSource(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.extractDataSource.html)
    *
    * 将传入的视频源分离轨道。不会自动将轨道添加到待合成的容器里。
    *
    * 最低基础库： `2.9.0` */
  def extractDataSource(option: ExtractDataSourceOption): Unit
  
  /** [MediaContainer.removeTrack([MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) track)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.removeTrack.html)
    *
    * 将音频或视频轨道从容器中移除
    *
    * 最低基础库： `2.9.0` */
  def removeTrack(
    /** [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html)
    *
    * 要移除的音频或视频轨道 */
  track: MediaTrack
  ): Unit
}
object MediaContainer {
  
  inline def apply(
    addTrack: MediaTrack => Callback,
    destroy: Callback,
    `export`: Callback,
    extractDataSource: ExtractDataSourceOption => Callback,
    removeTrack: MediaTrack => Callback
  ): MediaContainer = {
    val __obj = js.Dynamic.literal(addTrack = js.Any.fromFunction1((t0: MediaTrack) => addTrack(t0).runNow()), destroy = destroy.toJsFn, extractDataSource = js.Any.fromFunction1((t0: ExtractDataSourceOption) => extractDataSource(t0).runNow()), removeTrack = js.Any.fromFunction1((t0: MediaTrack) => removeTrack(t0).runNow()))
    __obj.updateDynamic("export")(`export`.toJsFn)
    __obj.asInstanceOf[MediaContainer]
  }
  
  extension [Self <: MediaContainer](x: Self) {
    
    inline def setAddTrack(value: MediaTrack => Callback): Self = StObject.set(x, "addTrack", js.Any.fromFunction1((t0: MediaTrack) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExport(value: Callback): Self = StObject.set(x, "export", value.toJsFn)
    
    inline def setExtractDataSource(value: ExtractDataSourceOption => Callback): Self = StObject.set(x, "extractDataSource", js.Any.fromFunction1((t0: ExtractDataSourceOption) => value(t0).runNow()))
    
    inline def setRemoveTrack(value: MediaTrack => Callback): Self = StObject.set(x, "removeTrack", js.Any.fromFunction1((t0: MediaTrack) => value(t0).runNow()))
  }
}
