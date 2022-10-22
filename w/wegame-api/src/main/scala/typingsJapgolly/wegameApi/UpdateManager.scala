package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManager extends StObject {
  
  /**
    * 应用更新包并重启
    */
  def applyUpdate(): Unit
  
  /**
    * 监听检查更新结果回调
    */
  def onCheckForUpdate(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听更新包下载失败回调
    */
  def onUpdateFailed(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听更新包下载成功回调
    */
  def onUpdateReady(callback: js.Function0[Unit]): Unit
}
object UpdateManager {
  
  inline def apply(
    applyUpdate: Callback,
    onCheckForUpdate: js.Function0[Unit] => Callback,
    onUpdateFailed: js.Function0[Unit] => Callback,
    onUpdateReady: js.Function0[Unit] => Callback
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = applyUpdate.toJsFn, onCheckForUpdate = js.Any.fromFunction1((t0: js.Function0[Unit]) => onCheckForUpdate(t0).runNow()), onUpdateFailed = js.Any.fromFunction1((t0: js.Function0[Unit]) => onUpdateFailed(t0).runNow()), onUpdateReady = js.Any.fromFunction1((t0: js.Function0[Unit]) => onUpdateReady(t0).runNow()))
    __obj.asInstanceOf[UpdateManager]
  }
  
  extension [Self <: UpdateManager](x: Self) {
    
    inline def setApplyUpdate(value: Callback): Self = StObject.set(x, "applyUpdate", value.toJsFn)
    
    inline def setOnCheckForUpdate(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onCheckForUpdate", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnUpdateFailed(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnUpdateReady(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
