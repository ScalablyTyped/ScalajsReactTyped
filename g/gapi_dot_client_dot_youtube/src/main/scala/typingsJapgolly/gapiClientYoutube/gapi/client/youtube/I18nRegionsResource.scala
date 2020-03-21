package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionsResource extends js.Object {
  /** Returns a list of content regions that the YouTube website supports. */
  def list(request: AnonUserIp): Request_[I18nRegionListResponse]
}

object I18nRegionsResource {
  @scala.inline
  def apply(list: AnonUserIp => CallbackTo[Request_[I18nRegionListResponse]]): I18nRegionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonUserIp) => list(t0).runNow()))
    __obj.asInstanceOf[I18nRegionsResource]
  }
}

