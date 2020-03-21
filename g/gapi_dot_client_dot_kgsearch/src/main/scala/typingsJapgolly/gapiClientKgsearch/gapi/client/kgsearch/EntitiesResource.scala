package typingsJapgolly.gapiClientKgsearch.gapi.client.kgsearch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientKgsearch.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitiesResource extends js.Object {
  /**
    * Searches Knowledge Graph for entities that match the constraints.
    * A list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    */
  def search(request: AnonAccesstoken): Request_[SearchResponse]
}

object EntitiesResource {
  @scala.inline
  def apply(search: AnonAccesstoken => CallbackTo[Request_[SearchResponse]]): EntitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientKgsearch.AnonAccesstoken) => search(t0).runNow()))
    __obj.asInstanceOf[EntitiesResource]
  }
}

