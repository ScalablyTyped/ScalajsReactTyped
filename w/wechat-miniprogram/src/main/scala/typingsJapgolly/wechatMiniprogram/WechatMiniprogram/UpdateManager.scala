package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManager extends StObject {
  
  /** [UpdateManager.applyUpdate()](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.applyUpdate.html)
    *
    * 强制小程序重启并使用新版本。在小程序新版本下载完成后（即收到 `onUpdateReady` 回调）调用。
    *
    * **示例代码**
    *
    *
    * [示例代码]((UpdateManager#示例代码)) */
  def applyUpdate(): Unit
  
  /** [UpdateManager.onCheckForUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onCheckForUpdate.html)
    *
    * 监听向微信后台请求检查更新结果事件。微信在小程序冷启动时自动检查更新，不需由开发者主动触发。
    *
    * **示例代码**
    *
    *
    * [示例代码]((UpdateManager#示例代码)) */
  def onCheckForUpdate(/** 向微信后台请求检查更新结果事件的回调函数 */
  callback: OnCheckForUpdateCallback): Unit
  
  /** [UpdateManager.onUpdateFailed(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onUpdateFailed.html)
    *
    * 监听小程序更新失败事件。小程序有新版本，客户端主动触发下载（无需开发者触发），下载失败（可能是网络原因等）后回调
    *
    * **示例代码**
    *
    *
    * [示例代码]((UpdateManager#示例代码)) */
  def onUpdateFailed(/** 小程序更新失败事件的回调函数 */
  callback: OnUpdateFailedCallback): Unit
  
  /** [UpdateManager.onUpdateReady(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onUpdateReady.html)
    *
    * 监听小程序有版本更新事件。客户端主动触发下载（无需开发者触发），下载成功后回调
    *
    * **示例代码**
    *
    *
    * [示例代码]((UpdateManager#示例代码)) */
  def onUpdateReady(/** 小程序有版本更新事件的回调函数 */
  callback: OnUpdateReadyCallback): Unit
}
object UpdateManager {
  
  inline def apply(
    applyUpdate: Callback,
    onCheckForUpdate: OnCheckForUpdateCallback => Callback,
    onUpdateFailed: OnUpdateFailedCallback => Callback,
    onUpdateReady: OnUpdateReadyCallback => Callback
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = applyUpdate.toJsFn, onCheckForUpdate = js.Any.fromFunction1((t0: OnCheckForUpdateCallback) => onCheckForUpdate(t0).runNow()), onUpdateFailed = js.Any.fromFunction1((t0: OnUpdateFailedCallback) => onUpdateFailed(t0).runNow()), onUpdateReady = js.Any.fromFunction1((t0: OnUpdateReadyCallback) => onUpdateReady(t0).runNow()))
    __obj.asInstanceOf[UpdateManager]
  }
  
  extension [Self <: UpdateManager](x: Self) {
    
    inline def setApplyUpdate(value: Callback): Self = StObject.set(x, "applyUpdate", value.toJsFn)
    
    inline def setOnCheckForUpdate(value: OnCheckForUpdateCallback => Callback): Self = StObject.set(x, "onCheckForUpdate", js.Any.fromFunction1((t0: OnCheckForUpdateCallback) => value(t0).runNow()))
    
    inline def setOnUpdateFailed(value: OnUpdateFailedCallback => Callback): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1((t0: OnUpdateFailedCallback) => value(t0).runNow()))
    
    inline def setOnUpdateReady(value: OnUpdateReadyCallback => Callback): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1((t0: OnUpdateReadyCallback) => value(t0).runNow()))
  }
}
