package typingsJapgolly.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexperiencereport.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: AnonAccesstoken): Request_[SiteSummaryResponse]
}

object SitesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => CallbackTo[Request_[SiteSummaryResponse]]): SitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexperiencereport.AnonAccesstoken) => get(t0).runNow()))
    __obj.asInstanceOf[SitesResource]
  }
}

