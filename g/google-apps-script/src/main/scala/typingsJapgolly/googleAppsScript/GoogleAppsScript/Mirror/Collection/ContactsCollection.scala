package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.ContactsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: String): Contact
  // Inserts a new contact.
  def insert(resource: Contact): Contact
  // Retrieves a list of contacts for the authenticated user.
  def list(): ContactsListResponse
  // Updates a contact in place. This method supports patch semantics.
  def patch(resource: Contact, id: String): Contact
  // Deletes a contact.
  def remove(id: String): Unit
  // Updates a contact in place.
  def update(resource: Contact, id: String): Contact
}

object ContactsCollection {
  @scala.inline
  def apply(
    get: String => CallbackTo[Contact],
    insert: Contact => CallbackTo[Contact],
    list: CallbackTo[ContactsListResponse],
    patch: (Contact, String) => CallbackTo[Contact],
    remove: String => Callback,
    update: (Contact, String) => CallbackTo[Contact]
  ): ContactsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact) => insert(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact, t1: java.lang.String) => patch(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[ContactsCollection]
  }
}

