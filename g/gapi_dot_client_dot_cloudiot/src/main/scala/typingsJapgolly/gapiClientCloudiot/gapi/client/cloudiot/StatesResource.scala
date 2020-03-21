package typingsJapgolly.gapiClientCloudiot.gapi.client.cloudiot

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudiot.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Lists the last few versions of the device state in descending order (i.e.:
    * newest first).
    */
  def list(request: AnonAlt): Request_[ListDeviceStatesResponse]
}

object StatesResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ListDeviceStatesResponse]]): StatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[StatesResource]
  }
}

