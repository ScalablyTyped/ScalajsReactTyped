package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: AnonLicense): Request_[License]
}

object LicensesResource {
  @scala.inline
  def apply(get: AnonLicense => CallbackTo[Request_[License]]): LicensesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonLicense) => get(t0).runNow()))
    __obj.asInstanceOf[LicensesResource]
  }
}

