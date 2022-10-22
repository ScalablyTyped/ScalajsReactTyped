package typingsJapgolly.xrm.Xrm

import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import typingsJapgolly.xrm.Xrm.Controls.BooleanControl
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Controls.DateControl
import typingsJapgolly.xrm.Xrm.Controls.LookupControl
import typingsJapgolly.xrm.Xrm.Controls.NumberControl
import typingsJapgolly.xrm.Xrm.Controls.OptionSetControl
import typingsJapgolly.xrm.Xrm.Controls.StringControl
import typingsJapgolly.xrm.Xrm.Events.Attribute.ChangeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of types and methods for working with formContext attributes.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
  */
object Attributes {
  
  /**
    * Interface for an Entity attribute.
    */
  @js.native
  trait Attribute[T] extends StObject {
    
    /**
      * Adds a handler to be called when the attribute's value is changed.
      * @param handler The function reference.
      */
    def addOnChange(handler: ChangeEventHandler): Unit = js.native
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    var controls: ItemCollection[Control] = js.native
    
    /**
      * Fire all "on change" event handlers.
      */
    def fireOnChange(): Unit = js.native
    
    /**
      * Gets attribute type.
      * @returns The attribute's type name.<BR><BR>
      * **Values returned are**:
      * * boolean
      * * datetime
      * * decimal
      * * double
      * * integer
      * * lookup
      * * memo
      * * money
      * * optionset
      * * string
      */
    def getAttributeType(): AttributeType = js.native
    
    /**
      * Gets the attribute format.
      * @returns The format of the attribute.<BR><BR>
      * **Values returned are**:
      * * date           (datetime)
      * * datetime       (datetime)
      * * duration       (integer)
      * * email          (string)
      * * language       (optionset)
      * * none           (integer)
      * * phone          (string)
      * * text           (string)
      * * textarea       (string)
      * * tickersymbol   (string)
      * * timezone       (optionset)
      * * url            (string)
      * @see {@link getAttributeType}
      */
    def getFormat(): AttributeFormat = js.native
    
    /**
      * Gets a boolean value indicating whether this Attribute has unsaved changes.
      * @returns true if there are unsaved changes, otherwise false.
      */
    def getIsDirty(): Boolean = js.native
    
    /**
      * Gets the logical name of the attribute.
      * @returns The logical name.
      */
    def getName(): String = js.native
    
    /**
      * Gets a reference to the record context of this attribute.
      * @returns The parent record context.
      */
    def getParent(): Entity = js.native
    
    /**
      * Gets the current level of requirement for the attribute.
      * @returns The required level, as either "none", "required", or "recommended"
      */
    def getRequiredLevel(): RequirementLevel = js.native
    
    /**
      * Gets current submit mode for the attribute.
      * @returns The submit mode, as either "always", "never", or "dirty"
      * @remarks The default value is "dirty"
      */
    def getSubmitMode(): SubmitMode = js.native
    
    /**
      * Gets the current user's privileges for the attribute.
      * @returns The user privileges.
      */
    def getUserPrivilege(): Privilege = js.native
    
    /**
      * Gets the value.
      * @returns The value.
      */
    def getValue(): T | Null = js.native
    
    /**
      * Removes the handler from the "on change" event.
      * @param handler The handler.
      */
    def removeOnChange(handler: ChangeEventHandler): Unit = js.native
    
    /**
      * Sets a value for a column to determine whether it is valid or invalid with a message
      * @param isValid Specify false to set the column value to invalid and true to set the value to valid.
      * @param message The message to display.
      * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/attributes/setisvalid External Link: setIsValid (Client API reference)}
      */
    def setIsValid(isValid: Boolean): Unit = js.native
    def setIsValid(isValid: Boolean, message: String): Unit = js.native
    
    /**
      * Sets the required level.
      * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
      * @see {@link XrmEnum.AttributeRequirementLevel}
      */
    def setRequiredLevel(requirementLevel: RequirementLevel): Unit = js.native
    
    /**
      * Sets the submit mode.
      * @param submitMode The submit mode, as either "always", "never", or "dirty".
      * @default submitMode "dirty"
      * @see {@link XrmEnum.AttributeRequirementLevel}
      */
    def setSubmitMode(submitMode: SubmitMode): Unit = js.native
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks Attributes on Quick Create Forms will not save values set with this method.
      */
    def setValue(): Unit = js.native
    def setValue(value: T): Unit = js.native
  }
  
  /**
    * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
    * @see {@link XrmEnum.DateAttributeFormat}
    * @see {@link XrmEnum.IntegerAttributeFormat}
    * @see {@link XrmEnum.OptionSetAttributeFormat}
    * @see {@link XrmEnum.StringAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.date
    - typingsJapgolly.xrm.xrmStrings.datetime
    - typingsJapgolly.xrm.xrmStrings.duration
    - typingsJapgolly.xrm.xrmStrings.none
    - typingsJapgolly.xrm.xrmStrings.language
    - typingsJapgolly.xrm.xrmStrings.timezone
    - typingsJapgolly.xrm.xrmStrings.email
    - typingsJapgolly.xrm.xrmStrings.phone
    - typingsJapgolly.xrm.xrmStrings.text
    - typingsJapgolly.xrm.xrmStrings.textarea
    - typingsJapgolly.xrm.xrmStrings.tickersymbol
    - typingsJapgolly.xrm.xrmStrings.url
  */
  trait AttributeFormat extends StObject
  object AttributeFormat {
    
    inline def date: typingsJapgolly.xrm.xrmStrings.date = "date".asInstanceOf[typingsJapgolly.xrm.xrmStrings.date]
    
    inline def datetime: typingsJapgolly.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.xrm.xrmStrings.datetime]
    
    inline def duration: typingsJapgolly.xrm.xrmStrings.duration = "duration".asInstanceOf[typingsJapgolly.xrm.xrmStrings.duration]
    
    inline def email: typingsJapgolly.xrm.xrmStrings.email = "email".asInstanceOf[typingsJapgolly.xrm.xrmStrings.email]
    
    inline def language: typingsJapgolly.xrm.xrmStrings.language = "language".asInstanceOf[typingsJapgolly.xrm.xrmStrings.language]
    
    inline def none: typingsJapgolly.xrm.xrmStrings.none = "none".asInstanceOf[typingsJapgolly.xrm.xrmStrings.none]
    
    inline def phone: typingsJapgolly.xrm.xrmStrings.phone = "phone".asInstanceOf[typingsJapgolly.xrm.xrmStrings.phone]
    
    inline def text: typingsJapgolly.xrm.xrmStrings.text = "text".asInstanceOf[typingsJapgolly.xrm.xrmStrings.text]
    
    inline def textarea: typingsJapgolly.xrm.xrmStrings.textarea = "textarea".asInstanceOf[typingsJapgolly.xrm.xrmStrings.textarea]
    
    inline def tickersymbol: typingsJapgolly.xrm.xrmStrings.tickersymbol = "tickersymbol".asInstanceOf[typingsJapgolly.xrm.xrmStrings.tickersymbol]
    
    inline def timezone: typingsJapgolly.xrm.xrmStrings.timezone = "timezone".asInstanceOf[typingsJapgolly.xrm.xrmStrings.timezone]
    
    inline def url: typingsJapgolly.xrm.xrmStrings.url = "url".asInstanceOf[typingsJapgolly.xrm.xrmStrings.url]
  }
  
  /**
    * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
    * @see {@link XrmEnum.AttributeType}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.boolean
    - typingsJapgolly.xrm.xrmStrings.datetime
    - typingsJapgolly.xrm.xrmStrings.decimal
    - typingsJapgolly.xrm.xrmStrings.double
    - typingsJapgolly.xrm.xrmStrings.integer
    - typingsJapgolly.xrm.xrmStrings.lookup
    - typingsJapgolly.xrm.xrmStrings.memo
    - typingsJapgolly.xrm.xrmStrings.money
    - typingsJapgolly.xrm.xrmStrings.multiselectoptionset
    - typingsJapgolly.xrm.xrmStrings.optionset
    - typingsJapgolly.xrm.xrmStrings.string
  */
  trait AttributeType extends StObject
  object AttributeType {
    
    inline def boolean: typingsJapgolly.xrm.xrmStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.xrm.xrmStrings.boolean]
    
    inline def datetime: typingsJapgolly.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.xrm.xrmStrings.datetime]
    
    inline def decimal: typingsJapgolly.xrm.xrmStrings.decimal = "decimal".asInstanceOf[typingsJapgolly.xrm.xrmStrings.decimal]
    
    inline def double: typingsJapgolly.xrm.xrmStrings.double = "double".asInstanceOf[typingsJapgolly.xrm.xrmStrings.double]
    
    inline def integer: typingsJapgolly.xrm.xrmStrings.integer = "integer".asInstanceOf[typingsJapgolly.xrm.xrmStrings.integer]
    
    inline def lookup: typingsJapgolly.xrm.xrmStrings.lookup = "lookup".asInstanceOf[typingsJapgolly.xrm.xrmStrings.lookup]
    
    inline def memo: typingsJapgolly.xrm.xrmStrings.memo = "memo".asInstanceOf[typingsJapgolly.xrm.xrmStrings.memo]
    
    inline def money: typingsJapgolly.xrm.xrmStrings.money = "money".asInstanceOf[typingsJapgolly.xrm.xrmStrings.money]
    
    inline def multiselectoptionset: typingsJapgolly.xrm.xrmStrings.multiselectoptionset = "multiselectoptionset".asInstanceOf[typingsJapgolly.xrm.xrmStrings.multiselectoptionset]
    
    inline def optionset: typingsJapgolly.xrm.xrmStrings.optionset = "optionset".asInstanceOf[typingsJapgolly.xrm.xrmStrings.optionset]
    
    inline def string: typingsJapgolly.xrm.xrmStrings.string = "string".asInstanceOf[typingsJapgolly.xrm.xrmStrings.string]
  }
  
  /**
    * Interface for a Boolean attribute.
    * @see {@link EnumAttribute}
    */
  @js.native
  trait BooleanAttribute
    extends StObject
       with EnumAttribute[Boolean] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_BooleanAttribute: ItemCollection[BooleanControl] = js.native
  }
  
  /**
    * Interface for a Date attribute.
    *
    * @see {@link Attribute}
    */
  @js.native
  trait DateAttribute
    extends StObject
       with Attribute[js.Date] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_DateAttribute: ItemCollection[DateControl] = js.native
  }
  
  /**
    * Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
    * @see {@link XrmEnum.DateAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.date
    - typingsJapgolly.xrm.xrmStrings.datetime
  */
  trait DateAttributeFormat extends StObject
  object DateAttributeFormat {
    
    inline def date: typingsJapgolly.xrm.xrmStrings.date = "date".asInstanceOf[typingsJapgolly.xrm.xrmStrings.date]
    
    inline def datetime: typingsJapgolly.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.xrm.xrmStrings.datetime]
  }
  
  /**
    * Common interface for enumeration attributes (OptionSet and Boolean).
    * @see {@link Attribute}
    */
  @js.native
  trait EnumAttribute[T /* <: Double | Boolean */]
    extends StObject
       with Attribute[T] {
    
    /**
      * Gets the initial value of the attribute.
      * @returns The initial value.
      * @remarks Valid for OptionSet and boolean attribute types
      * @see {@link https://docs.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/attributes/getinitialvalue External Link: getInitialValue (Client API reference)}
      */
    def getInitialValue(): T | Null = js.native
  }
  
  /**
    * Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
    * @see {@link XrmEnum.IntegerAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.duration
    - typingsJapgolly.xrm.xrmStrings.none
  */
  trait IntegerAttributeFormat extends StObject
  object IntegerAttributeFormat {
    
    inline def duration: typingsJapgolly.xrm.xrmStrings.duration = "duration".asInstanceOf[typingsJapgolly.xrm.xrmStrings.duration]
    
    inline def none: typingsJapgolly.xrm.xrmStrings.none = "none".asInstanceOf[typingsJapgolly.xrm.xrmStrings.none]
  }
  
  /**
    * Interface a Lookup attribute.
    *
    * @see {@link Attribute}
    */
  @js.native
  trait LookupAttribute
    extends StObject
       with Attribute[js.Array[LookupValue]] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_LookupAttribute: ItemCollection[LookupControl] = js.native
    
    /**
      * Gets a boolean value indicating whether the Lookup is a multi-value PartyList.
      * @returns true the attribute is a PartyList, otherwise false.
      */
    def getIsPartyList(): Boolean = js.native
  }
  
  /**
    * Interface for a Number attribute.
    * @see {@link Attribute}
    */
  @js.native
  trait NumberAttribute
    extends StObject
       with Attribute[Double] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_NumberAttribute: ItemCollection[NumberControl] = js.native
    
    /**
      * Gets the maximum value allowed.
      * @returns The maximum value allowed.
      */
    def getMax(): Double = js.native
    
    /**
      * Gets the minimum value allowed.
      * @returns The minimum value allowed.
      */
    def getMin(): Double = js.native
    
    /**
      * Gets the attribute's configured precision.
      * @returns The total number of allowed decimal places.
      */
    def getPrecision(): Double = js.native
    
    /**
      * Sets the number of digits allowed to the right of the decimal point.
      * @param precision Number of digits allowed to the right of the decimal point.
      * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/attributes/setPrecision External Link: setPrecision (Client API reference)}
      */
    def setPrecision(precision: Double): Unit = js.native
  }
  
  /**
    * Interface an OptionSet attribute.
    * @see {@link EnumAttribute}
    */
  @js.native
  trait OptionSetAttribute[T /* <: Double */]
    extends StObject
       with EnumAttribute[T] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_OptionSetAttribute: ItemCollection[OptionSetControl] = js.native
    
    /**
      * Gets the option matching a label.
      * @param label The label of the option desired.
      * @returns The option.
      */
    def getOption(label: String): OptionSetValue = js.native
    /**
      * Gets the option matching a value.
      * @param value The enumeration value of the option desired.
      * @returns The option.
      */
    def getOption(value: Double): OptionSetValue = js.native
    
    /**
      * Gets all of the options.
      * @returns An array of options.
      */
    def getOptions(): js.Array[OptionSetValue] = js.native
    
    /**
      * Gets selected option.
      * @returns The selected option.
      */
    def getSelectedOption(): OptionSetValue = js.native
    
    /**
      * Gets the label of the currently selected option.
      * @returns The current value's label.
      */
    def getText(): String = js.native
    
    def setValue(value: Double): Unit = js.native
  }
  
  /**
    * OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
    * @see {@link XrmEnum.OptionSetAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.language
    - typingsJapgolly.xrm.xrmStrings.timezone
  */
  trait OptionSetAttributeFormat extends StObject
  object OptionSetAttributeFormat {
    
    inline def language: typingsJapgolly.xrm.xrmStrings.language = "language".asInstanceOf[typingsJapgolly.xrm.xrmStrings.language]
    
    inline def timezone: typingsJapgolly.xrm.xrmStrings.timezone = "timezone".asInstanceOf[typingsJapgolly.xrm.xrmStrings.timezone]
  }
  
  /**
    * Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
    * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.none
    - typingsJapgolly.xrm.xrmStrings.recommended
    - typingsJapgolly.xrm.xrmStrings.required
  */
  trait RequirementLevel extends StObject
  object RequirementLevel {
    
    inline def none: typingsJapgolly.xrm.xrmStrings.none = "none".asInstanceOf[typingsJapgolly.xrm.xrmStrings.none]
    
    inline def recommended: typingsJapgolly.xrm.xrmStrings.recommended = "recommended".asInstanceOf[typingsJapgolly.xrm.xrmStrings.recommended]
    
    inline def required: typingsJapgolly.xrm.xrmStrings.required = "required".asInstanceOf[typingsJapgolly.xrm.xrmStrings.required]
  }
  
  /**
    * Interface for a String attribute.
    * @see {@link Attribute}
    */
  @js.native
  trait StringAttribute
    extends StObject
       with Attribute[String] {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_StringAttribute: ItemCollection[StringControl] = js.native
    
    /**
      * Gets maximum length allowed.
      * @returns The maximum length allowed.
      * @remarks The email form's "Description" attribute does not have the this method.
      */
    def getMaxLength(): Double = js.native
  }
  
  /**
    * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
    * @see {@link XrmEnum.StringAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.email
    - typingsJapgolly.xrm.xrmStrings.phone
    - typingsJapgolly.xrm.xrmStrings.text
    - typingsJapgolly.xrm.xrmStrings.textarea
    - typingsJapgolly.xrm.xrmStrings.tickersymbol
    - typingsJapgolly.xrm.xrmStrings.url
  */
  trait StringAttributeFormat extends StObject
  object StringAttributeFormat {
    
    inline def email: typingsJapgolly.xrm.xrmStrings.email = "email".asInstanceOf[typingsJapgolly.xrm.xrmStrings.email]
    
    inline def phone: typingsJapgolly.xrm.xrmStrings.phone = "phone".asInstanceOf[typingsJapgolly.xrm.xrmStrings.phone]
    
    inline def text: typingsJapgolly.xrm.xrmStrings.text = "text".asInstanceOf[typingsJapgolly.xrm.xrmStrings.text]
    
    inline def textarea: typingsJapgolly.xrm.xrmStrings.textarea = "textarea".asInstanceOf[typingsJapgolly.xrm.xrmStrings.textarea]
    
    inline def tickersymbol: typingsJapgolly.xrm.xrmStrings.tickersymbol = "tickersymbol".asInstanceOf[typingsJapgolly.xrm.xrmStrings.tickersymbol]
    
    inline def url: typingsJapgolly.xrm.xrmStrings.url = "url".asInstanceOf[typingsJapgolly.xrm.xrmStrings.url]
  }
}
