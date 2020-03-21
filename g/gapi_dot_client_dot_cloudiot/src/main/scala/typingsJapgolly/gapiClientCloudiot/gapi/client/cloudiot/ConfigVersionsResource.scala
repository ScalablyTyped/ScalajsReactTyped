package typingsJapgolly.gapiClientCloudiot.gapi.client.cloudiot

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudiot.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigVersionsResource extends js.Object {
  /**
    * Lists the last few versions of the device configuration in descending
    * order (i.e.: newest first).
    */
  def list(request: AnonAccesstoken): Request_[ListDeviceConfigVersionsResponse]
}

object ConfigVersionsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => CallbackTo[Request_[ListDeviceConfigVersionsResponse]]): ConfigVersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonAccesstoken) => list(t0).runNow()))
    __obj.asInstanceOf[ConfigVersionsResource]
  }
}

