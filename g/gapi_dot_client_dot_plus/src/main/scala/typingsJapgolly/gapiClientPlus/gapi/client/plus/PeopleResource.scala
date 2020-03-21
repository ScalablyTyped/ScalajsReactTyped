package typingsJapgolly.gapiClientPlus.gapi.client.plus

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlus.AnonCollection
import typingsJapgolly.gapiClientPlus.AnonLanguage
import typingsJapgolly.gapiClientPlus.AnonMaxResults
import typingsJapgolly.gapiClientPlus.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: AnonOauthtoken): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonCollection): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonMaxResults): Request_[PeopleFeed]
  /** Search all public profiles. */
  def search(request: AnonLanguage): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[Person]],
    list: AnonCollection => CallbackTo[Request_[PeopleFeed]],
    listByActivity: AnonMaxResults => CallbackTo[Request_[PeopleFeed]],
    search: AnonLanguage => CallbackTo[Request_[PeopleFeed]]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonCollection) => list(t0).runNow()))
    __obj.updateDynamic("listByActivity")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonMaxResults) => listByActivity(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonLanguage) => search(t0).runNow()))
    __obj.asInstanceOf[PeopleResource]
  }
}

