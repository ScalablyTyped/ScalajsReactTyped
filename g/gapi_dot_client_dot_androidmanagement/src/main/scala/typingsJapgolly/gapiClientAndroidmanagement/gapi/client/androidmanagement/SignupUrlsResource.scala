package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonCallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: AnonCallbackUrl): Request_[SignupUrl]
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: AnonCallbackUrl => CallbackTo[Request_[SignupUrl]]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonCallbackUrl) => create(t0).runNow()))
    __obj.asInstanceOf[SignupUrlsResource]
  }
}

