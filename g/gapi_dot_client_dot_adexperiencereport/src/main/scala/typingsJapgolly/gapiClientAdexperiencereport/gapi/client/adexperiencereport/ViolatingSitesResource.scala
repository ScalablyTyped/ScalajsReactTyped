package typingsJapgolly.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexperiencereport.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResource extends js.Object {
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: AnonAlt): Request_[ViolatingSitesResponse]
}

object ViolatingSitesResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ViolatingSitesResponse]]): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexperiencereport.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ViolatingSitesResource]
  }
}

