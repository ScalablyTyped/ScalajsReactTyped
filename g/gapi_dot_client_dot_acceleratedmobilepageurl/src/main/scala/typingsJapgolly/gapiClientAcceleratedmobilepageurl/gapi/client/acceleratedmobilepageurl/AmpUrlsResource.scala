package typingsJapgolly.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAcceleratedmobilepageurl.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: AnonAccesstoken): Request_[BatchGetAmpUrlsResponse]
}

object AmpUrlsResource {
  @scala.inline
  def apply(batchGet: AnonAccesstoken => CallbackTo[Request_[BatchGetAmpUrlsResponse]]): AmpUrlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAcceleratedmobilepageurl.AnonAccesstoken) => batchGet(t0).runNow()))
    __obj.asInstanceOf[AmpUrlsResource]
  }
}

