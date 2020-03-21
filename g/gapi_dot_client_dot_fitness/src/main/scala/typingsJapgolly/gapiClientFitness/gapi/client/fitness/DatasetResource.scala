package typingsJapgolly.gapiClientFitness.gapi.client.fitness

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFitness.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetResource extends js.Object {
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple
    * sources can be aggreated into exactly one bucket type per request.
    */
  def aggregate(request: AnonFields): Request_[AggregateResponse]
}

object DatasetResource {
  @scala.inline
  def apply(aggregate: AnonFields => CallbackTo[Request_[AggregateResponse]]): DatasetResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFitness.AnonFields) => aggregate(t0).runNow()))
    __obj.asInstanceOf[DatasetResource]
  }
}

