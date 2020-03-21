package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(callback: CbCallback): Unit
  def refresh(callback: CbCallback): Unit
  def save(callback: CbCallback): Unit
}

object Item {
  @scala.inline
  def apply(
    data: js.Object,
    destroy: CbCallback => Callback,
    refresh: CbCallback => Callback,
    save: CbCallback => Callback
  ): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => destroy(t0).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => refresh(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => save(t0).runNow()))
    __obj.asInstanceOf[Item]
  }
}

