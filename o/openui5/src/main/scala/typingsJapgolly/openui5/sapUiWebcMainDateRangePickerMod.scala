package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.Valid
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.CSSSize
import typingsJapgolly.openui5.sapUiCoreLibraryMod.ID
import typingsJapgolly.openui5.sapUiCoreLibraryMod.IFormContent
import typingsJapgolly.openui5.sapUiCoreLibraryMod.ValueState
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainDateRangePickerMod {
  
  @JSImport("sap/ui/webc/main/DateRangePicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DateRangePicker`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DateRangePicker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DateRangePickerSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: DateRangePickerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DateRangePickerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/DateRangePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.DateRangePicker with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateRangePicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateRangePicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.DateRangePicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait DateRangePicker
    extends typingsJapgolly.openui5.sapUiWebcCommonWebComponentMod.default
       with IFormContent {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.DateRangePicker` itself.
      *
      * Fired when the input operation has finished by pressing Enter or on focusout.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.DateRangePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.DateRangePicker` itself.
      *
      * Fired when the input operation has finished by pressing Enter or on focusout.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.DateRangePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.DateRangePicker` itself.
      *
      * Fired when the value of the component is changed at each key stroke.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.DateRangePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.DateRangePicker` itself.
      *
      * Fired when the value of the component is changed at each key stroke.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInput(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.DateRangePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the picker.
      */
    def closePicker(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:input input} event of this `sap.ui.webc.main.DateRangePicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachInput(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachInput(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:change change} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireChange(): Boolean = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Valid): Boolean = js.native
    
    /**
      * Fires event {@link #event:input input} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireInput(): Boolean = js.native
    def fireInput(/**
      * Parameters to pass along with the event
      */
    mParameters: Valid): Boolean = js.native
    
    /**
      * Formats a Java Script date object into a string representing a locale date according to the `formatPattern`
      * property of the DatePicker instance
      */
    def formatValue(/**
      * A Java Script date object to be formatted as string
      */
    date: js.Object): Unit = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the aria-label attribute for the component.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Returns the **Note:** The getter method is inherited and not supported. If called it will return an empty
      * value.
      */
    def getDateValue(): Unit = js.native
    
    /**
      * Returns the **Note:** The getter method is inherited and not supported. If called it will return an empty
      * value.
      */
    def getDateValueUTC(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getDelimiter delimiter}.
      *
      * Determines the symbol which separates the dates. If not supplied, the default time interval delimiter
      * for the current locale will be used.
      *
      * @returns Value of property `delimiter`
      */
    def getDelimiter(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Returns the end date of the currently selected range as JavaScript Date instance.
      */
    def getEndDateValue(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getFormatPattern formatPattern}.
      *
      * Determines the format, displayed in the input field.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `formatPattern`
      */
    def getFormatPattern(): String = js.native
    
    /**
      * Gets current value of property {@link #getHideWeekNumbers hideWeekNumbers}.
      *
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideWeekNumbers`
      */
    def getHideWeekNumbers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxDate maxDate}.
      *
      * Determines the maximum date available for selection.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): String = js.native
    
    /**
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Determines the minimum date available for selection.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): String = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint, intended to aid the user with data entry when the component has no value.
      *
      *
      *
      *  **Note:** When no placeholder is set, the format pattern is displayed as a placeholder. Passing an empty
      * string as the value of this property will make the component appear empty - without placeholder or format
      * pattern.
      *
      * Default value is `undefined`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets current value of property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      *
      * @returns Value of property `primaryCalendarType`
      */
    def getPrimaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getReadonly readonly}.
      *
      * Determines whether the component is displayed as read-only.
      *
      * Default value is `false`.
      *
      * @returns Value of property `readonly`
      */
    def getReadonly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getRequired required}.
      *
      * Defines whether the component is required.
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      *
      * Default value is `undefined`.
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Returns the start date of the currently selected range as JavaScript Date instance.
      */
    def getStartDateValue(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines a formatted date value.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `valueStateMessage`
      */
    def getValueStateMessage(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks if a date is between the minimum and maximum date.
      */
    def isInValidRange(/**
      * A value to be checked
      */
    value: String): Unit = js.native
    
    /**
      * Checks if the picker is open.
      */
    def isOpen(): Unit = js.native
    
    /**
      * Checks if a value is valid against the current date format of the DatePicker.
      */
    def isValid(/**
      * A value to be tested against the current date format
      */
    value: String): Unit = js.native
    
    /**
      * Opens the picker.
      */
    def openPicker(): Unit = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the aria-label attribute for the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDelimiter delimiter}.
      *
      * Determines the symbol which separates the dates. If not supplied, the default time interval delimiter
      * for the current locale will be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelimiter(/**
      * New value for property `delimiter`
      */
    sDelimiter: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFormatPattern formatPattern}.
      *
      * Determines the format, displayed in the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatPattern(): this.type = js.native
    def setFormatPattern(/**
      * New value for property `formatPattern`
      */
    sFormatPattern: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideWeekNumbers hideWeekNumbers}.
      *
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideWeekNumbers(): this.type = js.native
    def setHideWeekNumbers(/**
      * New value for property `hideWeekNumbers`
      */
    bHideWeekNumbers: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxDate maxDate}.
      *
      * Determines the maximum date available for selection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxDate(): this.type = js.native
    def setMaxDate(/**
      * New value for property `maxDate`
      */
    sMaxDate: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinDate minDate}.
      *
      * Determines the minimum date available for selection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinDate(): this.type = js.native
    def setMinDate(/**
      * New value for property `minDate`
      */
    sMinDate: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint, intended to aid the user with data entry when the component has no value.
      *
      *
      *
      *  **Note:** When no placeholder is set, the format pattern is displayed as a placeholder. Passing an empty
      * string as the value of this property will make the component appear empty - without placeholder or format
      * pattern.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `undefined`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    def setPrimaryCalendarType(
      /**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrimaryCalendarType(/**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getReadonly readonly}.
      *
      * Determines whether the component is displayed as read-only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReadonly(): this.type = js.native
    def setReadonly(/**
      * New value for property `readonly`
      */
    bReadonly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRequired required}.
      *
      * Defines whether the component is required.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `undefined`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryCalendarType(): this.type = js.native
    def setSecondaryCalendarType(
      /**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    def setSecondaryCalendarType(/**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Defines a formatted date value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateMessage(): this.type = js.native
    def setValueStateMessage(/**
      * New value for property `valueStateMessage`
      */
    sValueStateMessage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait DateRangePickerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the aria-label attribute for the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Fired when the input operation has finished by pressing Enter or on focusout.
      */
    var change: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Determines the symbol which separates the dates. If not supplied, the default time interval delimiter
      * for the current locale will be used.
      */
    var delimiter: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the format, displayed in the input field.
      */
    var formatPattern: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      */
    var hideWeekNumbers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value of the component is changed at each key stroke.
      */
    var input: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Determines the maximum date available for selection.
      */
    var maxDate: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the minimum date available for selection.
      */
    var minDate: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines a short hint, intended to aid the user with data entry when the component has no value.
      *
      *
      *
      *  **Note:** When no placeholder is set, the format pattern is displayed as a placeholder. Passing an empty
      * string as the value of this property will make the component appear empty - without placeholder or format
      * pattern.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      */
    var primaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the component is displayed as read-only.
      */
    var readonly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the component is required.
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines a formatted date value.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      */
    var valueStateMessage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DateRangePickerSettings {
    
    inline def apply(): DateRangePickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangePickerSettings]
    }
    
    extension [Self <: DateRangePickerSettings](x: Self) {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typingsJapgolly.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDelimiter(value: String | PropertyBindingInfo): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormatPattern(value: String | PropertyBindingInfo): Self = StObject.set(x, "formatPattern", value.asInstanceOf[js.Any])
      
      inline def setFormatPatternUndefined: Self = StObject.set(x, "formatPattern", js.undefined)
      
      inline def setHideWeekNumbers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setHideWeekNumbersUndefined: Self = StObject.set(x, "hideWeekNumbers", js.undefined)
      
      inline def setInput(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "input", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMaxDate(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | PropertyBindingInfo): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrimaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setPrimaryCalendarTypeUndefined: Self = StObject.set(x, "primaryCalendarType", js.undefined)
      
      inline def setReadonly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessage(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateMessage", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessageUndefined: Self = StObject.set(x, "valueStateMessage", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
