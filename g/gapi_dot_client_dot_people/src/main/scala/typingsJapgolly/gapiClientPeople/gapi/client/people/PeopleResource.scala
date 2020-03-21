package typingsJapgolly.gapiClientPeople.gapi.client.people

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPeople.AnonAccesstoken
import typingsJapgolly.gapiClientPeople.AnonParent
import typingsJapgolly.gapiClientPeople.AnonPersonFields
import typingsJapgolly.gapiClientPeople.AnonPp
import typingsJapgolly.gapiClientPeople.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  var connections: ConnectionsResource
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: AnonParent): Request_[Person]
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Provides information about a person by specifying a resource name. Use
    * `people/me` to indicate the authenticated user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def get(request: AnonPersonFields): Request_[Person]
  /**
    * Provides information about a list of specific people by specifying a list
    * of requested resource names. Use `people/me` to indicate the authenticated
    * user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def getBatchGet(request: AnonPp): Request_[GetPeopleResponse]
  /**
    * Update contact data for an existing contact person. Any non-contact data
    * will not be modified.
    *
    * The request throws a 400 error if `updatePersonFields` is not specified.
    * <br>
    * The request throws a 400 error if `person.metadata.sources` is not
    * specified for the contact to be updated.
    * <br>
    * The request throws a 412 error if `person.metadata.sources.etag` is
    * different than the contact's etag, which indicates the contact has changed
    * since its data was read. Clients should get the latest person and re-apply
    * their updates to the latest person.
    */
  def updateContact(request: AnonPrettyPrint): Request_[Person]
}

object PeopleResource {
  @scala.inline
  def apply(
    connections: ConnectionsResource,
    createContact: AnonParent => CallbackTo[Request_[Person]],
    deleteContact: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonPersonFields => CallbackTo[Request_[Person]],
    getBatchGet: AnonPp => CallbackTo[Request_[GetPeopleResponse]],
    updateContact: AnonPrettyPrint => CallbackTo[Request_[Person]]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.updateDynamic("createContact")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonParent) => createContact(t0).runNow()))
    __obj.updateDynamic("deleteContact")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonAccesstoken) => deleteContact(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonPersonFields) => get(t0).runNow()))
    __obj.updateDynamic("getBatchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonPp) => getBatchGet(t0).runNow()))
    __obj.updateDynamic("updateContact")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonPrettyPrint) => updateContact(t0).runNow()))
    __obj.asInstanceOf[PeopleResource]
  }
}

