package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonConfirm
import typingsJapgolly.baiduApp.AnonHasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 更新
trait UpdateManager extends js.Object {
  def applyUpdate(): Unit
  def onCheckForUpdate(callback: js.Function1[/* res */ AnonHasUpdate, Unit]): Unit
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, Unit]): Unit
  def onUpdateReady(callback: js.Function1[/* res */ AnonConfirm, Unit]): Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: Callback,
    onCheckForUpdate: js.Function1[/* res */ AnonHasUpdate, Unit] => Callback,
    onUpdateFailed: js.Function1[/* res */ js.Any, Unit] => Callback,
    onUpdateReady: js.Function1[/* res */ AnonConfirm, Unit] => Callback
  ): UpdateManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyUpdate")(applyUpdate.toJsFn)
    __obj.updateDynamic("onCheckForUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.AnonHasUpdate, scala.Unit]) => onCheckForUpdate(t0).runNow()))
    __obj.updateDynamic("onUpdateFailed")(js.Any.fromFunction1((t0: js.Function1[/* res */ js.Any, scala.Unit]) => onUpdateFailed(t0).runNow()))
    __obj.updateDynamic("onUpdateReady")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.AnonConfirm, scala.Unit]) => onUpdateReady(t0).runNow()))
    __obj.asInstanceOf[UpdateManager]
  }
}

