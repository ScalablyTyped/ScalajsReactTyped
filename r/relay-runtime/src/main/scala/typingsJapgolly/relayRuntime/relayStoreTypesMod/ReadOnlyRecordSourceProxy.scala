package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnlyRecordSourceProxy extends js.Object {
  def get(dataID: DataID): js.UndefOr[ReadOnlyRecordProxy | Null]
  def getRoot(): ReadOnlyRecordProxy
}

object ReadOnlyRecordSourceProxy {
  @scala.inline
  def apply(
    get: DataID => CallbackTo[js.UndefOr[ReadOnlyRecordProxy | Null]],
    getRoot: CallbackTo[ReadOnlyRecordProxy]
  ): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => get(t0).runNow()))
    __obj.updateDynamic("getRoot")(getRoot.toJsFn)
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
}

