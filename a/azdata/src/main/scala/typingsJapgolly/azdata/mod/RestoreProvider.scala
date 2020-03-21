package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreProvider extends DataProvider {
  def cancelRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[Boolean]
  def getRestoreConfigInfo(connectionUri: String): Thenable[RestoreConfigInfo]
  def getRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestorePlanResponse]
  def restore(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestoreResponse]
}

object RestoreProvider {
  @scala.inline
  def apply(
    cancelRestorePlan: (String, RestoreInfo) => CallbackTo[Thenable[Boolean]],
    getRestoreConfigInfo: String => CallbackTo[Thenable[RestoreConfigInfo]],
    getRestorePlan: (String, RestoreInfo) => CallbackTo[Thenable[RestorePlanResponse]],
    providerId: String,
    restore: (String, RestoreInfo) => CallbackTo[Thenable[RestoreResponse]],
    handle: Int | Double = null
  ): RestoreProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelRestorePlan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.RestoreInfo) => cancelRestorePlan(t0, t1).runNow()))
    __obj.updateDynamic("getRestoreConfigInfo")(js.Any.fromFunction1((t0: java.lang.String) => getRestoreConfigInfo(t0).runNow()))
    __obj.updateDynamic("getRestorePlan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.RestoreInfo) => getRestorePlan(t0, t1).runNow()))
    __obj.updateDynamic("restore")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.RestoreInfo) => restore(t0, t1).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreProvider]
  }
}

