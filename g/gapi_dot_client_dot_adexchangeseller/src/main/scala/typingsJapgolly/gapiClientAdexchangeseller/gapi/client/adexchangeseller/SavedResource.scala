package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonAccountId
import typingsJapgolly.gapiClientAdexchangeseller.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonLocale): Request_[Report]
  /** List all saved reports in this Ad Exchange account. */
  def list(request: AnonAccountId): Request_[SavedReports]
}

object SavedResource {
  @scala.inline
  def apply(
    generate: AnonLocale => CallbackTo[Request_[Report]],
    list: AnonAccountId => CallbackTo[Request_[SavedReports]]
  ): SavedResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonLocale) => generate(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonAccountId) => list(t0).runNow()))
    __obj.asInstanceOf[SavedResource]
  }
}

