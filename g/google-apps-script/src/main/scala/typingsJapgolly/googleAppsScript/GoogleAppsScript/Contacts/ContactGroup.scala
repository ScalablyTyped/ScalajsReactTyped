package typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ContactGroup is is a group of contacts.
  */
trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup
  def deleteGroup(): Unit
  def getContacts(): js.Array[Contact]
  /** @deprecated DO NOT USE */ def getGroupName(): String
  def getId(): String
  def getName(): String
  def isSystemGroup(): Boolean
  def removeContact(contact: Contact): ContactGroup
  /** @deprecated DO NOT USE */ def setGroupName(name: String): Unit
  def setName(name: String): ContactGroup
}

object ContactGroup {
  @scala.inline
  def apply(
    addContact: Contact => CallbackTo[ContactGroup],
    deleteGroup: Callback,
    getContacts: CallbackTo[js.Array[Contact]],
    getGroupName: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    isSystemGroup: CallbackTo[Boolean],
    removeContact: Contact => CallbackTo[ContactGroup],
    setGroupName: String => Callback,
    setName: String => CallbackTo[ContactGroup]
  ): ContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addContact")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts.Contact) => addContact(t0).runNow()))
    __obj.updateDynamic("deleteGroup")(deleteGroup.toJsFn)
    __obj.updateDynamic("getContacts")(getContacts.toJsFn)
    __obj.updateDynamic("getGroupName")(getGroupName.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("isSystemGroup")(isSystemGroup.toJsFn)
    __obj.updateDynamic("removeContact")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts.Contact) => removeContact(t0).runNow()))
    __obj.updateDynamic("setGroupName")(js.Any.fromFunction1((t0: java.lang.String) => setGroupName(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[ContactGroup]
  }
}

