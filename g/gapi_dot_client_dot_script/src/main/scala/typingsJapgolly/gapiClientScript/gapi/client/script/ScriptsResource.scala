package typingsJapgolly.gapiClientScript.gapi.client.script

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientScript.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptsResource extends js.Object {
  /**
    * Runs a function in an Apps Script project. The project must be deployed
    * for use with the Apps Script Execution API.
    *
    * This method requires authorization with an OAuth 2.0 token that includes at
    * least one of the scopes listed in the [Authorization](#authorization)
    * section; script projects that do not require authorization cannot be
    * executed through this API. To find the correct scopes to include in the
    * authentication token, open the project in the script editor, then select
    * &#42;&#42;File > Project properties&#42;&#42; and click the &#42;&#42;Scopes&#42;&#42; tab.
    */
  def run(request: AnonAccesstoken): Request_[Operation]
}

object ScriptsResource {
  @scala.inline
  def apply(run: AnonAccesstoken => CallbackTo[Request_[Operation]]): ScriptsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientScript.AnonAccesstoken) => run(t0).runNow()))
    __obj.asInstanceOf[ScriptsResource]
  }
}

