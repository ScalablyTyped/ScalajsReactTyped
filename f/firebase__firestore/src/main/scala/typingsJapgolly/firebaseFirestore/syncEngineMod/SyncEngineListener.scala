package typingsJapgolly.firebaseFirestore.syncEngineMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.queryMod.Query
import typingsJapgolly.firebaseFirestore.typesMod.OnlineState
import typingsJapgolly.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncEngineListener extends js.Object {
  /** Handles a change in online state. */
  def onOnlineStateChange(onlineState: OnlineState): Unit
  /** Handles new view snapshots. */
  def onWatchChange(snapshots: js.Array[ViewSnapshot]): Unit
  /** Handles the failure of a query. */
  def onWatchError(query: Query, error: js.Error): Unit
}

object SyncEngineListener {
  @scala.inline
  def apply(
    onOnlineStateChange: OnlineState => Callback,
    onWatchChange: js.Array[ViewSnapshot] => Callback,
    onWatchError: (Query, js.Error) => Callback
  ): SyncEngineListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onOnlineStateChange")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.typesMod.OnlineState) => onOnlineStateChange(t0).runNow()))
    __obj.updateDynamic("onWatchChange")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.firebaseFirestore.viewSnapshotMod.ViewSnapshot]) => onWatchChange(t0).runNow()))
    __obj.updateDynamic("onWatchError")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.queryMod.Query, t1: js.Error) => onWatchError(t0, t1).runNow()))
    __obj.asInstanceOf[SyncEngineListener]
  }
}

