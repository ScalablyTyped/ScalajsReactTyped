package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @js.native
  sealed trait AddContactResult extends StObject
  @JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
  @js.native
  object AddContactResult extends StObject {
    
    @js.native
    sealed trait added
      extends StObject
         with AddContactResult
    
    @js.native
    sealed trait alreadyAdded
      extends StObject
         with AddContactResult
    
    @js.native
    sealed trait unavailable
      extends StObject
         with AddContactResult
  }
  
  trait ContactPickerUI
    extends StObject
       with IContactPickerUI
  object ContactPickerUI {
    
    inline def apply(
      addContact: (String, Contact) => AddContactResult,
      containsContact: String => Boolean,
      desiredFields: IVectorView[String],
      oncontactremoved: Any,
      removeContact: String => Callback,
      selectionMode: ContactSelectionMode
    ): ContactPickerUI = {
      val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1((t0: String) => removeContact(t0).runNow()), selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactPickerUI]
    }
  }
  
  trait ContactRemovedEventArgs
    extends StObject
       with IContactRemovedEventArgs
  object ContactRemovedEventArgs {
    
    inline def apply(id: String): ContactRemovedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactRemovedEventArgs]
    }
  }
  
  trait IContactPickerUI extends StObject {
    
    def addContact(id: String, contact: Contact): AddContactResult
    
    def containsContact(id: String): Boolean
    
    var desiredFields: IVectorView[String]
    
    var oncontactremoved: Any
    
    def removeContact(id: String): Unit
    
    var selectionMode: ContactSelectionMode
  }
  object IContactPickerUI {
    
    inline def apply(
      addContact: (String, Contact) => AddContactResult,
      containsContact: String => Boolean,
      desiredFields: IVectorView[String],
      oncontactremoved: Any,
      removeContact: String => Callback,
      selectionMode: ContactSelectionMode
    ): IContactPickerUI = {
      val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1((t0: String) => removeContact(t0).runNow()), selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContactPickerUI]
    }
    
    extension [Self <: IContactPickerUI](x: Self) {
      
      inline def setAddContact(value: (String, Contact) => AddContactResult): Self = StObject.set(x, "addContact", js.Any.fromFunction2(value))
      
      inline def setContainsContact(value: String => Boolean): Self = StObject.set(x, "containsContact", js.Any.fromFunction1(value))
      
      inline def setDesiredFields(value: IVectorView[String]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
      
      inline def setOncontactremoved(value: Any): Self = StObject.set(x, "oncontactremoved", value.asInstanceOf[js.Any])
      
      inline def setRemoveContact(value: String => Callback): Self = StObject.set(x, "removeContact", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSelectionMode(value: ContactSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait IContactRemovedEventArgs extends StObject {
    
    var id: String
  }
  object IContactRemovedEventArgs {
    
    inline def apply(id: String): IContactRemovedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContactRemovedEventArgs]
    }
    
    extension [Self <: IContactRemovedEventArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
