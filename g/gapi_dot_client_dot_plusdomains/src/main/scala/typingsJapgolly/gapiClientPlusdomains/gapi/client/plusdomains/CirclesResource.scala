package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonCircleId
import typingsJapgolly.gapiClientPlusdomains.AnonFields
import typingsJapgolly.gapiClientPlusdomains.AnonKey
import typingsJapgolly.gapiClientPlusdomains.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: AnonCircleId): Request_[Circle]
  /** Get a circle. */
  def get(request: AnonKey): Request_[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: AnonOauthtoken): Request_[Circle]
  /** List all of the circles for a user. */
  def list(request: AnonFields): Request_[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[Circle]
  /** Delete a circle. */
  def remove(request: AnonKey): Request_[Unit]
  /** Remove a person from a circle. */
  def removePeople(request: AnonCircleId): Request_[Unit]
  /** Update a circle's description. */
  def update(request: AnonKey): Request_[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: AnonCircleId => CallbackTo[Request_[Circle]],
    get: AnonKey => CallbackTo[Request_[Circle]],
    insert: AnonOauthtoken => CallbackTo[Request_[Circle]],
    list: AnonFields => CallbackTo[Request_[CircleFeed]],
    patch: AnonKey => CallbackTo[Request_[Circle]],
    remove: AnonKey => CallbackTo[Request_[Unit]],
    removePeople: AnonCircleId => CallbackTo[Request_[Unit]],
    update: AnonKey => CallbackTo[Request_[Circle]]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPeople")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonCircleId) => addPeople(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonKey) => remove(t0).runNow()))
    __obj.updateDynamic("removePeople")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonCircleId) => removePeople(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CirclesResource]
  }
}

