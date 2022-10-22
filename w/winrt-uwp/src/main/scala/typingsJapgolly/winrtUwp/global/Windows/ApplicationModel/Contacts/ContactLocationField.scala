package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a user's location and address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
open class ContactLocationField protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactLocationField {
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    */
  def this(unstructuredAddress: String) = this()
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category the field belongs to.
    */
  def this(
    unstructuredAddress: String,
    category: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory
  ) = this()
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category for the contact data.
    * @param street The street address of the contact.
    * @param city The name of the city for this contact's address.
    * @param region The name of the region for this contact's address.
    * @param country The name of the country for this contact's address.
    * @param postalCode The postal code for this contact's address.
    */
  def this(
    unstructuredAddress: String,
    category: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) = this()
  
  /** Gets the category for the contact data. */
  /* CompleteClass */
  var category: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory = js.native
  
  /** Gets the contact's city. */
  /* CompleteClass */
  var city: String = js.native
  
  /** Gets the contact's country. */
  /* CompleteClass */
  var country: String = js.native
  
  /** Gets the name of the field. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets the contact's postal code. */
  /* CompleteClass */
  var postalCode: String = js.native
  
  /** Gets the contact's region. */
  /* CompleteClass */
  var region: String = js.native
  
  /** Gets the contact's street. */
  /* CompleteClass */
  var street: String = js.native
  
  /** Gets the contact field type for the data. */
  /* CompleteClass */
  var `type`: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType = js.native
  
  /** Gets a string that represents an unstructured address. */
  /* CompleteClass */
  var unstructuredAddress: String = js.native
  
  /** Gets the value of the contact data. */
  /* CompleteClass */
  var value: String = js.native
}
