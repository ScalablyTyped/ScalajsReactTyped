package typingsJapgolly.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesconfiguration.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: AnonFields): Request_[ImageConfiguration]
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(upload: AnonFields => CallbackTo[Request_[ImageConfiguration]]): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("upload")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonFields) => upload(t0).runNow()))
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
}

