package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdateFunction extends OptimisticUpdate {
  def storeUpdater(store: RecordSourceProxy): Unit
}

object OptimisticUpdateFunction {
  @scala.inline
  def apply(storeUpdater: RecordSourceProxy => Callback): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storeUpdater")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceProxy) => storeUpdater(t0).runNow()))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
}

