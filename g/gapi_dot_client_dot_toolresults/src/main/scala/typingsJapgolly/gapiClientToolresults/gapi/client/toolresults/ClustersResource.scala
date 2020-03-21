package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonAlt
import typingsJapgolly.gapiClientToolresults.AnonExecutionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Retrieves a single screenshot cluster by its ID */
  def get(request: AnonAlt): Request_[ScreenshotCluster]
  /**
    * Lists Screenshot Clusters
    *
    * Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are
    * created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar
    * they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
    */
  def list(request: AnonExecutionId): Request_[ListScreenshotClustersResponse]
}

object ClustersResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[ScreenshotCluster]],
    list: AnonExecutionId => CallbackTo[Request_[ListScreenshotClustersResponse]]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonExecutionId) => list(t0).runNow()))
    __obj.asInstanceOf[ClustersResource]
  }
}

