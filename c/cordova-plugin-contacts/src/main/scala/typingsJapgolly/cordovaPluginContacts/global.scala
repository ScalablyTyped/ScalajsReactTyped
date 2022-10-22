package typingsJapgolly.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Contact")
  @js.native
  open class Contact protected ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.Contact {
    /** Constructor of Contact object */
    def this(
      id: js.UndefOr[String],
      displayName: js.UndefOr[String],
      name: js.UndefOr[typingsJapgolly.cordovaPluginContacts.ContactName],
      nickname: js.UndefOr[String],
      phoneNumbers: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactField]],
      emails: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactField]],
      addresses: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactAddress]],
      ims: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactField]],
      organizations: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactOrganization]],
      birthday: js.UndefOr[js.Date],
      note: js.UndefOr[String],
      photos: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactField]],
      categories: js.UndefOr[typingsJapgolly.cordovaPluginContacts.ContactField],
      urls: js.UndefOr[js.Array[typingsJapgolly.cordovaPluginContacts.ContactField]]
    ) = this()
    
    /**
      * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
      * @param onSuccess Success callback function invoked on success operation.
      * @param onError Error callback function, invoked when an error occurs.
      */
    /* CompleteClass */
    override def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
      * @param onSuccess Success callback function invoked on success operation with che Contact object.
      * @param onError Error callback function, invoked when an error occurs.
      */
    /* CompleteClass */
    override def save(
      onSuccess: js.Function1[/* contact */ this.type, Unit],
      onError: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactAddress")
  @js.native
  open class ContactAddress protected ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactAddress {
    /** Constructor of ContactAddress object */
    def this(
      pref: js.UndefOr[Boolean],
      `type`: js.UndefOr[String],
      formatted: js.UndefOr[String],
      streetAddress: js.UndefOr[String],
      locality: js.UndefOr[String],
      region: js.UndefOr[String],
      postalCode: js.UndefOr[String],
      country: js.UndefOr[String]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactError")
  @js.native
  open class ContactError protected ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactError {
    def this(code: Double) = this()
    
    /** Error code */
    /* CompleteClass */
    var code: Double = js.native
    
    /** Error message */
    /* CompleteClass */
    var message: String = js.native
  }
  object ContactError {
    
    @JSGlobal("ContactError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ContactError.INVALID_ARGUMENT_ERROR")
    @js.native
    def INVALID_ARGUMENT_ERROR: Double = js.native
    inline def INVALID_ARGUMENT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.IO_ERROR")
    @js.native
    def IO_ERROR: Double = js.native
    inline def IO_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IO_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.NOT_SUPPORTED_ERROR")
    @js.native
    def NOT_SUPPORTED_ERROR: Double = js.native
    inline def NOT_SUPPORTED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PENDING_OPERATION_ERROR")
    @js.native
    def PENDING_OPERATION_ERROR: Double = js.native
    inline def PENDING_OPERATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_OPERATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PERMISSION_DENIED_ERROR")
    @js.native
    def PERMISSION_DENIED_ERROR: Double = js.native
    inline def PERMISSION_DENIED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.TIMEOUT_ERROR")
    @js.native
    def TIMEOUT_ERROR: Double = js.native
    inline def TIMEOUT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: Double = js.native
    inline def UNKNOWN_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactField")
  @js.native
  /** Constructor for ContactField object */
  open class ContactField ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactField {
    def this(`type`: String) = this()
    def this(`type`: String, value: String) = this()
    def this(`type`: Unit, value: String) = this()
    def this(`type`: String, value: String, pref: Boolean) = this()
    def this(`type`: String, value: Unit, pref: Boolean) = this()
    def this(`type`: Unit, value: String, pref: Boolean) = this()
    def this(`type`: Unit, value: Unit, pref: Boolean) = this()
    
    /** Set to true if this ContactField contains the user's preferred value. */
    /* CompleteClass */
    var pref: Boolean = js.native
    
    /** A string that indicates what type of field this is, home for example. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** The value of the field, such as a phone number or email address. */
    /* CompleteClass */
    var value: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactFindOptions")
  @js.native
  /** Constructor for ContactFindOptions object */
  open class ContactFindOptions ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactFindOptions {
    def this(filter: String) = this()
    def this(filter: String, multiple: Boolean) = this()
    def this(filter: Unit, multiple: Boolean) = this()
    def this(filter: String, multiple: Boolean, desiredFields: js.Array[ContactFieldType]) = this()
    def this(filter: String, multiple: Unit, desiredFields: js.Array[ContactFieldType]) = this()
    def this(filter: Unit, multiple: Boolean, desiredFields: js.Array[ContactFieldType]) = this()
    def this(filter: Unit, multiple: Unit, desiredFields: js.Array[ContactFieldType]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactName")
  @js.native
  open class ContactName protected ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactName {
    /** Constructor for ContactName object */
    def this(
      formatted: js.UndefOr[String],
      familyName: js.UndefOr[String],
      givenName: js.UndefOr[String],
      middleName: js.UndefOr[String],
      honorificPrefix: js.UndefOr[String],
      honorificSuffix: js.UndefOr[String]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactOrganization")
  @js.native
  /** Constructor for ContactOrganization object */
  open class ContactOrganization ()
    extends StObject
       with typingsJapgolly.cordovaPluginContacts.ContactOrganization {
    def this(pref: Boolean) = this()
    def this(pref: Boolean, `type`: String) = this()
    def this(pref: Unit, `type`: String) = this()
    def this(pref: Boolean, `type`: String, name: String) = this()
    def this(pref: Boolean, `type`: Unit, name: String) = this()
    def this(pref: Unit, `type`: String, name: String) = this()
    def this(pref: Unit, `type`: Unit, name: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String) = this()
    def this(pref: Boolean, `type`: String, name: Unit, department: String) = this()
    def this(pref: Boolean, `type`: Unit, name: String, department: String) = this()
    def this(pref: Boolean, `type`: Unit, name: Unit, department: String) = this()
    def this(pref: Unit, `type`: String, name: String, department: String) = this()
    def this(pref: Unit, `type`: String, name: Unit, department: String) = this()
    def this(pref: Unit, `type`: Unit, name: String, department: String) = this()
    def this(pref: Unit, `type`: Unit, name: Unit, department: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String, title: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: Unit, title: String) = this()
    def this(pref: Boolean, `type`: String, name: Unit, department: String, title: String) = this()
    def this(pref: Boolean, `type`: String, name: Unit, department: Unit, title: String) = this()
    def this(pref: Boolean, `type`: Unit, name: String, department: String, title: String) = this()
    def this(pref: Boolean, `type`: Unit, name: String, department: Unit, title: String) = this()
    def this(pref: Boolean, `type`: Unit, name: Unit, department: String, title: String) = this()
    def this(pref: Boolean, `type`: Unit, name: Unit, department: Unit, title: String) = this()
    def this(pref: Unit, `type`: String, name: String, department: String, title: String) = this()
    def this(pref: Unit, `type`: String, name: String, department: Unit, title: String) = this()
    def this(pref: Unit, `type`: String, name: Unit, department: String, title: String) = this()
    def this(pref: Unit, `type`: String, name: Unit, department: Unit, title: String) = this()
    def this(pref: Unit, `type`: Unit, name: String, department: String, title: String) = this()
    def this(pref: Unit, `type`: Unit, name: String, department: Unit, title: String) = this()
    def this(pref: Unit, `type`: Unit, name: Unit, department: String, title: String) = this()
    def this(pref: Unit, `type`: Unit, name: Unit, department: Unit, title: String) = this()
  }
}
