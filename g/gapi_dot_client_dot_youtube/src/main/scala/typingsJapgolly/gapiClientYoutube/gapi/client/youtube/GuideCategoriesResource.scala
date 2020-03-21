package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonRegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube channels. */
  def list(request: AnonRegionCode): Request_[GuideCategoryListResponse]
}

object GuideCategoriesResource {
  @scala.inline
  def apply(list: AnonRegionCode => CallbackTo[Request_[GuideCategoryListResponse]]): GuideCategoriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonRegionCode) => list(t0).runNow()))
    __obj.asInstanceOf[GuideCategoriesResource]
  }
}

