package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUser extends js.Object {
  var URI: String
  var callTimeout: Double
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def allUsers(query: Query, callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def getUser(callback: CbCallback): Unit
  def setPassword(old_password: String, new_password: String, callback: CbCallback): Unit
  def setUser(data: js.Object, callback: CbCallback): Unit
}

object AppUser {
  @scala.inline
  def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Callback,
    callTimeout: Double,
    count: (Query, CbCallback) => Callback,
    endpoint: String,
    getUser: CbCallback => Callback,
    setPassword: (String, String, CbCallback) => Callback,
    setUser: (js.Object, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("allUsers")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => allUsers(t0, t1).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => count(t0, t1).runNow()))
    __obj.updateDynamic("getUser")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getUser(t0).runNow()))
    __obj.updateDynamic("setPassword")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => setPassword(t0, t1, t2).runNow()))
    __obj.updateDynamic("setUser")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => setUser(t0, t1).runNow()))
    __obj.asInstanceOf[AppUser]
  }
}

