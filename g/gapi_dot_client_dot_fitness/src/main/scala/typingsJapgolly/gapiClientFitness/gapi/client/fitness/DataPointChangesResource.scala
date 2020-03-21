package typingsJapgolly.gapiClientFitness.gapi.client.fitness

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFitness.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: AnonAlt): Request_[ListDataPointChangesResponse]
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ListDataPointChangesResponse]]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[DataPointChangesResource]
  }
}

