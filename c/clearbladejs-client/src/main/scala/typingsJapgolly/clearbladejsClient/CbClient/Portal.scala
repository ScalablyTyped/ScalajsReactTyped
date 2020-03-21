package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Portal extends js.Object {
  var URI: String
  var name: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def fetch(callback: CbCallback): Unit
  def update(data: js.Object, callback: CbCallback): Unit
}

object Portal {
  @scala.inline
  def apply(
    URI: String,
    fetch: CbCallback => Callback,
    name: String,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Callback,
    user: APIUser
  ): Portal = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => fetch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Portal]
  }
}

