package typingsJapgolly.cassandraDriver.metadataMod.metadata

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientState extends js.Object {
  def getConnectedHosts(): js.Array[Host]
  def getInFlightQueries(host: Host): Double
  def getOpenConnections(host: Host): Double
}

object ClientState {
  @scala.inline
  def apply(
    getConnectedHosts: CallbackTo[js.Array[Host]],
    getInFlightQueries: Host => CallbackTo[Double],
    getOpenConnections: Host => CallbackTo[Double]
  ): ClientState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConnectedHosts")(getConnectedHosts.toJsFn)
    __obj.updateDynamic("getInFlightQueries")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.Host) => getInFlightQueries(t0).runNow()))
    __obj.updateDynamic("getOpenConnections")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.Host) => getOpenConnections(t0).runNow()))
    __obj.asInstanceOf[ClientState]
  }
}

