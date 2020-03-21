package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Add a new media item to an album. The current upload size limitations are 36MB for a photo and 1GB for a video. Uploads do not count against quota if
    * photos are less than 2048 pixels on their longest side or videos are less than 15 minutes in length.
    */
  def insert(request: AnonPrettyPrint): Request_[Media]
}

object MediaResource {
  @scala.inline
  def apply(insert: AnonPrettyPrint => CallbackTo[Request_[Media]]): MediaResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.asInstanceOf[MediaResource]
  }
}

