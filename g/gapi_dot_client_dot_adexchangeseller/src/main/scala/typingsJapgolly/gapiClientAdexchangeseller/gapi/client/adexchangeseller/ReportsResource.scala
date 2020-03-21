package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var saved: SavedResource
  /**
    * Generate an Ad Exchange report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: AnonDimension): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(generate: AnonDimension => CallbackTo[Request_[Report]], saved: SavedResource): ReportsResource = {
    val __obj = js.Dynamic.literal(saved = saved.asInstanceOf[js.Any])
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonDimension) => generate(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

