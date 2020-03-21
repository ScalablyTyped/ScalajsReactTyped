package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerInstance extends js.Object {
  var name: String
  var systemKey: String
  def Delete(callback: CbCallback): Unit
  def Update(options: js.Object, callback: CbCallback): Unit
}

object TriggerInstance {
  @scala.inline
  def apply(
    Delete: CbCallback => Callback,
    Update: (js.Object, CbCallback) => Callback,
    name: String,
    systemKey: String
  ): TriggerInstance = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Delete")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => Delete(t0).runNow()))
    __obj.updateDynamic("Update")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => Update(t0, t1).runNow()))
    __obj.asInstanceOf[TriggerInstance]
  }
}

