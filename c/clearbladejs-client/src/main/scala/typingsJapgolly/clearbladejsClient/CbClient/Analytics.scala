package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analytics extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def getCount(filter: QueryFilter, callback: CbCallback): Unit
  def getEventList(filter: QueryFilter, callback: CbCallback): Unit
  def getEventTotals(filter: QueryFilter, callback: CbCallback): Unit
  def getStorage(filter: QueryFilter, callback: CbCallback): Unit
  def getUserEvents(filter: QueryFilter, callback: CbCallback): Unit
}

object Analytics {
  @scala.inline
  def apply(
    URI: String,
    getCount: (QueryFilter, CbCallback) => Callback,
    getEventList: (QueryFilter, CbCallback) => Callback,
    getEventTotals: (QueryFilter, CbCallback) => Callback,
    getStorage: (QueryFilter, CbCallback) => Callback,
    getUserEvents: (QueryFilter, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Analytics = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("getCount")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryFilter, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getCount(t0, t1).runNow()))
    __obj.updateDynamic("getEventList")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryFilter, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getEventList(t0, t1).runNow()))
    __obj.updateDynamic("getEventTotals")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryFilter, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getEventTotals(t0, t1).runNow()))
    __obj.updateDynamic("getStorage")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryFilter, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getStorage(t0, t1).runNow()))
    __obj.updateDynamic("getUserEvents")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryFilter, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getUserEvents(t0, t1).runNow()))
    __obj.asInstanceOf[Analytics]
  }
}

