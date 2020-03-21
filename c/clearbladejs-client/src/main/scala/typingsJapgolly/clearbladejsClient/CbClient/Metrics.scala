package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var URI: String
  var systemKey: String
  var user: APIUser
  def getDBConnections(callback: CbCallback): Unit
  def getLogs(callback: CbCallback): Unit
  def getStatistics(callback: CbCallback): Unit
  def getStatisticsHistory(callback: CbCallback): Unit
  def setQuery(query: Query): Unit
}

object Metrics {
  @scala.inline
  def apply(
    URI: String,
    getDBConnections: CbCallback => Callback,
    getLogs: CbCallback => Callback,
    getStatistics: CbCallback => Callback,
    getStatisticsHistory: CbCallback => Callback,
    setQuery: Query => Callback,
    systemKey: String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("getDBConnections")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getDBConnections(t0).runNow()))
    __obj.updateDynamic("getLogs")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getLogs(t0).runNow()))
    __obj.updateDynamic("getStatistics")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getStatistics(t0).runNow()))
    __obj.updateDynamic("getStatisticsHistory")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getStatisticsHistory(t0).runNow()))
    __obj.updateDynamic("setQuery")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.Query) => setQuery(t0).runNow()))
    __obj.asInstanceOf[Metrics]
  }
}

