package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import typingsJapgolly.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: AnonWebPropertyAdWordsLinkId): Request_[Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: AnonQuotaUser): Request_[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: AnonPrettyPrint): Request_[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyAdWordsLinkId => CallbackTo[Request_[Unit]],
    get: AnonWebPropertyAdWordsLinkId => CallbackTo[Request_[EntityAdWordsLink]],
    insert: AnonQuotaUser => CallbackTo[Request_[EntityAdWordsLink]],
    list: AnonPrettyPrint => CallbackTo[Request_[EntityAdWordsLinks]],
    patch: AnonWebPropertyAdWordsLinkId => CallbackTo[Request_[EntityAdWordsLink]],
    update: AnonWebPropertyAdWordsLinkId => CallbackTo[Request_[EntityAdWordsLink]]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId) => update(t0).runNow()))
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
}

