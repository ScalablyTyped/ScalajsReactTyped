package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonMaxresults
import typingsJapgolly.gapiClientAnalytics.AnonOauthtoken
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: AnonQuotaUser): Request_[Webproperty]
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: AnonOauthtoken): Request_[Webproperty]
  /** Lists web properties to which the user has access. */
  def list(request: AnonMaxresults): Request_[Webproperties]
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Webproperty]
  /** Updates an existing web property. */
  def update(request: AnonQuotaUser): Request_[Webproperty]
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: AnonQuotaUser => CallbackTo[Request_[Webproperty]],
    insert: AnonOauthtoken => CallbackTo[Request_[Webproperty]],
    list: AnonMaxresults => CallbackTo[Request_[Webproperties]],
    patch: AnonQuotaUser => CallbackTo[Request_[Webproperty]],
    update: AnonQuotaUser => CallbackTo[Request_[Webproperty]]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonMaxresults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => update(t0).runNow()))
    __obj.asInstanceOf[WebpropertiesResource]
  }
}

