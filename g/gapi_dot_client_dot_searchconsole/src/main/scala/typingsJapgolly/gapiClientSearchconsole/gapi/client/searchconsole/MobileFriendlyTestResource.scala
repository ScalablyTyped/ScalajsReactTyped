package typingsJapgolly.gapiClientSearchconsole.gapi.client.searchconsole

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSearchconsole.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: AnonAccesstoken): Request_[RunMobileFriendlyTestResponse]
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(run: AnonAccesstoken => CallbackTo[Request_[RunMobileFriendlyTestResponse]]): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSearchconsole.AnonAccesstoken) => run(t0).runNow()))
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
}

