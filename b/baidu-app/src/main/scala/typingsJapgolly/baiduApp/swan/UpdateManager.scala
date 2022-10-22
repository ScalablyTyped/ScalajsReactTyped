package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Confirm
import typingsJapgolly.baiduApp.anon.HasUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 更新
trait UpdateManager extends StObject {
  
  def applyUpdate(): Unit
  
  def onCheckForUpdate(callback: js.Function1[/* res */ HasUpdate, Unit]): Unit
  
  def onUpdateFailed(callback: js.Function1[/* res */ Any, Unit]): Unit
  
  def onUpdateReady(callback: js.Function1[/* res */ Confirm, Unit]): Unit
}
object UpdateManager {
  
  inline def apply(
    applyUpdate: Callback,
    onCheckForUpdate: js.Function1[/* res */ HasUpdate, Unit] => Callback,
    onUpdateFailed: js.Function1[/* res */ Any, Unit] => Callback,
    onUpdateReady: js.Function1[/* res */ Confirm, Unit] => Callback
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = applyUpdate.toJsFn, onCheckForUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ HasUpdate, Unit]) => onCheckForUpdate(t0).runNow()), onUpdateFailed = js.Any.fromFunction1((t0: js.Function1[/* res */ Any, Unit]) => onUpdateFailed(t0).runNow()), onUpdateReady = js.Any.fromFunction1((t0: js.Function1[/* res */ Confirm, Unit]) => onUpdateReady(t0).runNow()))
    __obj.asInstanceOf[UpdateManager]
  }
  
  extension [Self <: UpdateManager](x: Self) {
    
    inline def setApplyUpdate(value: Callback): Self = StObject.set(x, "applyUpdate", value.toJsFn)
    
    inline def setOnCheckForUpdate(value: js.Function1[/* res */ HasUpdate, Unit] => Callback): Self = StObject.set(x, "onCheckForUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ HasUpdate, Unit]) => value(t0).runNow()))
    
    inline def setOnUpdateFailed(value: js.Function1[/* res */ Any, Unit] => Callback): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1((t0: js.Function1[/* res */ Any, Unit]) => value(t0).runNow()))
    
    inline def setOnUpdateReady(value: js.Function1[/* res */ Confirm, Unit] => Callback): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1((t0: js.Function1[/* res */ Confirm, Unit]) => value(t0).runNow()))
  }
}
