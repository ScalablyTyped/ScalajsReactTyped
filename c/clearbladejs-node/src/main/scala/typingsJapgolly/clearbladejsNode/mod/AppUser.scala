package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): Unit
  def getUser(callback: CbCallback): Unit
  def setUser(data: js.Object, callback: CbCallback): Unit
}

object AppUser {
  @scala.inline
  def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Callback,
    getUser: CbCallback => Callback,
    setUser: (js.Object, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("allUsers")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsNode.mod.Query, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => allUsers(t0, t1).runNow()))
    __obj.updateDynamic("getUser")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsNode.mod.CbCallback) => getUser(t0).runNow()))
    __obj.updateDynamic("setUser")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => setUser(t0, t1).runNow()))
    __obj.asInstanceOf[AppUser]
  }
}

