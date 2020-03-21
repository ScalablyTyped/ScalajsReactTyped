package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonOauthtoken
import typingsJapgolly.gapiClientPlusdomains.AnonOrderBy
import typingsJapgolly.gapiClientPlusdomains.AnonPageToken
import typingsJapgolly.gapiClientPlusdomains.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: AnonOauthtoken): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonOrderBy): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonPageToken): Request_[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: AnonQuotaUser): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[Person]],
    list: AnonOrderBy => CallbackTo[Request_[PeopleFeed]],
    listByActivity: AnonPageToken => CallbackTo[Request_[PeopleFeed]],
    listByCircle: AnonQuotaUser => CallbackTo[Request_[PeopleFeed]]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonOrderBy) => list(t0).runNow()))
    __obj.updateDynamic("listByActivity")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonPageToken) => listByActivity(t0).runNow()))
    __obj.updateDynamic("listByCircle")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonQuotaUser) => listByCircle(t0).runNow()))
    __obj.asInstanceOf[PeopleResource]
  }
}

