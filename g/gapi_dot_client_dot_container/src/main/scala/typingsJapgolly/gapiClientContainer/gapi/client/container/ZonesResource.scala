package typingsJapgolly.gapiClientContainer.gapi.client.container

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContainer.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  var clusters: ClustersResource
  var operations: OperationsResource
  /** Returns configuration info about the Container Engine service. */
  def getServerconfig(request: AnonBearertoken): Request_[ServerConfig]
}

object ZonesResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    getServerconfig: AnonBearertoken => CallbackTo[Request_[ServerConfig]],
    operations: OperationsResource
  ): ZonesResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("getServerconfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonBearertoken) => getServerconfig(t0).runNow()))
    __obj.asInstanceOf[ZonesResource]
  }
}

