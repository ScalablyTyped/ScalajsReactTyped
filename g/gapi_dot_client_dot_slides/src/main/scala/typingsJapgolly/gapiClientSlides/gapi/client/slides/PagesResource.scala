package typingsJapgolly.gapiClientSlides.gapi.client.slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSlides.AnonAccesstoken
import typingsJapgolly.gapiClientSlides.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Gets the latest version of the specified page in the presentation. */
  def get(request: AnonAccesstoken): Request_[Page]
  /**
    * Generates a thumbnail of the latest version of the specified page in the
    * presentation and returns a URL to the thumbnail image.
    */
  def getThumbnail(request: AnonAlt): Request_[Thumbnail]
}

object PagesResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[Page]],
    getThumbnail: AnonAlt => CallbackTo[Request_[Thumbnail]]
  ): PagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSlides.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("getThumbnail")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSlides.AnonAlt) => getThumbnail(t0).runNow()))
    __obj.asInstanceOf[PagesResource]
  }
}

