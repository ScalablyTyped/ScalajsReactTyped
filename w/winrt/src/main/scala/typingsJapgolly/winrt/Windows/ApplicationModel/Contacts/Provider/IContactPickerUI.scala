package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.Contact
import typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPickerUI extends js.Object {
  var desiredFields: IVectorView[String]
  var oncontactremoved: js.Any
  var selectionMode: ContactSelectionMode
  def addContact(id: String, contact: Contact): AddContactResult
  def containsContact(id: String): Boolean
  def removeContact(id: String): Unit
}

object IContactPickerUI {
  @scala.inline
  def apply(
    addContact: (String, Contact) => CallbackTo[AddContactResult],
    containsContact: String => CallbackTo[Boolean],
    desiredFields: IVectorView[String],
    oncontactremoved: js.Any,
    removeContact: String => Callback,
    selectionMode: ContactSelectionMode
  ): IContactPickerUI = {
    val __obj = js.Dynamic.literal(desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("addContact")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.Contact) => addContact(t0, t1).runNow()))
    __obj.updateDynamic("containsContact")(js.Any.fromFunction1((t0: java.lang.String) => containsContact(t0).runNow()))
    __obj.updateDynamic("removeContact")(js.Any.fromFunction1((t0: java.lang.String) => removeContact(t0).runNow()))
    __obj.asInstanceOf[IContactPickerUI]
  }
}

