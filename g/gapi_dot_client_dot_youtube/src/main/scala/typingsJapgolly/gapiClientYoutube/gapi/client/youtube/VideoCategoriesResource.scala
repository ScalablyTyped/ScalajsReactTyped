package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonRegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube videos. */
  def list(request: AnonRegionCode): Request_[VideoCategoryListResponse]
}

object VideoCategoriesResource {
  @scala.inline
  def apply(list: AnonRegionCode => CallbackTo[Request_[VideoCategoryListResponse]]): VideoCategoriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonRegionCode) => list(t0).runNow()))
    __obj.asInstanceOf[VideoCategoriesResource]
  }
}

