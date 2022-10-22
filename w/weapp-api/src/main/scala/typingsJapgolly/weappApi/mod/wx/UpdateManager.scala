package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManager extends StObject {
  
  /**
    * 强制小程序重启并使用新版本。在小程序新版本下载完成后（即收到 onUpdateReady 回调）调用。
    */
  def applyUpdate(callback: DataResponseCallback): Unit
  
  /**
    * 监听向微信后台请求检查更新结果事件。微信在小程序冷启动时自动检查更新，不需由开发者主动触发。
    */
  def onCheckForUpdate(): Unit
  
  /**
    * 监听小程序更新失败事件。小程序有新版本，客户端主动触发下载（无需开发者触发），下载失败（可能是网络原因等）后回调
    */
  def onUpdateFailed(callback: NoneParamCallback): Unit
  
  /**
    * 监听小程序有版本更新事件。客户端主动触发下载（无需开发者触发），下载成功后回调
    */
  def onUpdateReady(callback: NoneParamCallback): Unit
}
object UpdateManager {
  
  inline def apply(
    applyUpdate: DataResponseCallback => Callback,
    onCheckForUpdate: Callback,
    onUpdateFailed: NoneParamCallback => Callback,
    onUpdateReady: NoneParamCallback => Callback
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction1((t0: DataResponseCallback) => applyUpdate(t0).runNow()), onCheckForUpdate = onCheckForUpdate.toJsFn, onUpdateFailed = js.Any.fromFunction1((t0: NoneParamCallback) => onUpdateFailed(t0).runNow()), onUpdateReady = js.Any.fromFunction1((t0: NoneParamCallback) => onUpdateReady(t0).runNow()))
    __obj.asInstanceOf[UpdateManager]
  }
  
  extension [Self <: UpdateManager](x: Self) {
    
    inline def setApplyUpdate(value: DataResponseCallback => Callback): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction1((t0: DataResponseCallback) => value(t0).runNow()))
    
    inline def setOnCheckForUpdate(value: Callback): Self = StObject.set(x, "onCheckForUpdate", value.toJsFn)
    
    inline def setOnUpdateFailed(value: NoneParamCallback => Callback): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1((t0: NoneParamCallback) => value(t0).runNow()))
    
    inline def setOnUpdateReady(value: NoneParamCallback => Callback): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1((t0: NoneParamCallback) => value(t0).runNow()))
  }
}
