package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.AddedTokens
import typingsJapgolly.openui5.anon.KeyCode
import typingsJapgolly.openui5.anon.RemovedTokens
import typingsJapgolly.openui5.anon.SuggestionObject
import typingsJapgolly.openui5.jQuery.Event
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.CSSSize
import typingsJapgolly.openui5.sapUiCoreLibraryMod.ID
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTokenizerMod {
  
  @JSImport("sap/m/Tokenizer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Tokenizer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/token/ Tokenizer}
    */
  open class default () extends Tokenizer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TokenizerSettings) = this()
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
    mSettings: TokenizerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TokenizerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Tokenizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Tokenizer with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Tokenizer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tokenizer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Tokenizer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Tokenizer
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
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
      * Adds some token to the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToken(
      /**
      * The token to add; if empty, nothing is inserted
      */
    oToken: typingsJapgolly.openui5.sapMTokenMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.81) - replaced by {@link MultiInput.prototype.addValidator}
      *
      * Function validates the given text and adds a new token if validation was successful.
      */
    def addValidateToken(/**
      * Parameter bag containing the following fields:
      */
    oParameters: SuggestionObject): Unit = js.native
    
    /**
      * @deprecated (since 1.81) - replaced by {@link MultiInput.prototype.addValidator}
      *
      * Function adds a validation callback called before any new token gets added to the tokens aggregation.
      */
    def addValidator(/**
      * The validation function
      */
    fValidator: js.Function): Unit = js.native
    
    /**
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenChange tokenChange} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenChange tokenChange} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenChange(
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
    def attachTokenChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.82
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenDelete tokenDelete} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when a token is deleted by clicking icon, pressing backspace or delete button.  Once the
      * event is fired, application is responsible for removing / destroying the token from the aggregation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.82
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenDelete tokenDelete} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when a token is deleted by clicking icon, pressing backspace or delete button.  Once the
      * event is fired, application is responsible for removing / destroying the token from the aggregation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenDelete(
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
    def attachTokenDelete(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.Tokenizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tokenizer` itself.
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenUpdate(
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
    def attachTokenUpdate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Tokenizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the tokens in the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTokens(): this.type = js.native
    
    /**
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Detaches event handler `fnFunction` from the {@link #event:tokenChange tokenChange} event of this `sap.m.Tokenizer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenChange(
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
      * @SINCE 1.82
      *
      * Detaches event handler `fnFunction` from the {@link #event:tokenDelete tokenDelete} event of this `sap.m.Tokenizer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenDelete(
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
      * @SINCE 1.46
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Detaches event handler `fnFunction` from the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.Tokenizer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenUpdate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenUpdate(
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
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Fires event {@link #event:tokenChange tokenChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTokenChange(): this.type = js.native
    def fireTokenChange(/**
      * Parameters to pass along with the event
      */
    mParameters: AddedTokens): this.type = js.native
    
    /**
      * @SINCE 1.82
      *
      * Fires event {@link #event:tokenDelete tokenDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTokenDelete(): this.type = js.native
    def fireTokenDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: KeyCode): this.type = js.native
    
    /**
      * @SINCE 1.46
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Fires event {@link #event:tokenUpdate tokenUpdate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireTokenUpdate(): Boolean = js.native
    def fireTokenUpdate(/**
      * Parameters to pass along with the event
      */
    mParameters: RemovedTokens): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * true if tokens shall be editable otherwise false
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * @SINCE 1.80
      *
      * Gets the count of hidden tokens that will be used for the n-More indicator. If the count is 0, there
      * is no n-More indicator shown.
      *
      * @returns The number of hidden tokens
      */
    def getHiddenTokensCount(): Double = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Defines the maximum width of the Tokenizer.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getRenderMode renderMode}.
      *
      * Defines the mode that the Tokenizer will use:
      * 	 - `sap.m.TokenizerRenderMode.Loose` mode shows all tokens, no matter the width of the Tokenizer
      * 	 - `sap.m.TokenizerRenderMode.Narrow` mode forces the Tokenizer to show only as much tokens as possible
      * 			in its width and add an n-More indicator
      *
      * Default value is `RenderMode.Loose`.
      *
      * @returns Value of property `renderMode`
      */
    def getRenderMode(): String = js.native
    
    /**
      * Function returns the internally used scroll delegate.
      *
      * @returns The scroll delegate
      */
    def getScrollDelegate(): typingsJapgolly.openui5.sapUiCoreDelegateScrollEnablementMod.default = js.native
    
    /**
      * Function returns the tokens' width.
      *
      * @returns The complete width of all tokens
      */
    def getScrollWidth(): Double = js.native
    
    /**
      * Function returns all currently selected tokens.
      *
      * @returns Array of selected tokens or empty array
      */
    def getSelectedTokens(): js.Array[typingsJapgolly.openui5.sapMTokenMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getTokens tokens}.
      *
      * the currently displayed tokens
      */
    def getTokens(): js.Array[typingsJapgolly.openui5.sapMTokenMod.default] = js.native
    
    /**
      * Gets the accessibility text aggregation id.
      *
      * @returns Returns the InvisibleText control id
      */
    def getTokensInfoId(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the Tokenizer.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks if the token is one and truncated.
      */
    def hasOneTruncatedToken(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.Token` in the aggregation {@link #getTokens tokens}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToken(
      /**
      * The token whose index is looked for
      */
    oToken: typingsJapgolly.openui5.sapMTokenMod.default
    ): int = js.native
    
    /**
      * Inserts a token into the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToken(
      /**
      * The token to insert; if empty, nothing is inserted
      */
    oToken: typingsJapgolly.openui5.sapMTokenMod.default,
      /**
      * The `0`-based index the token should be inserted at; for a negative value of `iIndex`, the token is inserted
      * at position 0; for a value greater than the current size of the aggregation, the token is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Handle the focus event on the control.
      */
    def onclick(/**
      * The occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTokens tokens}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTokens(): js.Array[typingsJapgolly.openui5.sapMTokenMod.default] = js.native
    
    /**
      * @deprecated (since 1.81) - replaced by {@link MultiInput.prototype.addValidator}
      *
      * Function removes all validation callbacks
      */
    def removeAllValidators(): Unit = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
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
    
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: String): typingsJapgolly.openui5.sapMTokenMod.default | Null = js.native
    /**
      * Removes a token from the aggregation {@link #getTokens tokens}.
      *
      * @returns The removed token or `null`
      */
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: int): typingsJapgolly.openui5.sapMTokenMod.default | Null = js.native
    def removeToken(
      /**
      * The token to remove or its index or id
      */
    vToken: typingsJapgolly.openui5.sapMTokenMod.default
    ): typingsJapgolly.openui5.sapMTokenMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.81) - replaced by {@link MultiInput.prototype.addValidator}
      *
      * Function removes a validation callback.
      */
    def removeValidator(/**
      * The validation function
      */
    fValidator: js.Function): Unit = js.native
    
    /**
      * Function scrolls the tokens to the end.
      */
    def scrollToEnd(): Unit = js.native
    
    /**
      * Function scrolls the tokens to the start.
      */
    def scrollToStart(): Unit = js.native
    
    /**
      * Function selects all tokens.
      *
      * @returns this instance for method chaining
      */
    def selectAllTokens(/**
      * [optional] true for selecting, false for deselecting
      */
    bSelect: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * true if tokens shall be editable otherwise false
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets the first token truncation.
      *
      * @returns `this` instance for method chaining
      */
    def setFirstTokenTruncated(/**
      * The value to set
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Defines the maximum width of the Tokenizer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Function sets the tokenizer's width in pixels.
      */
    def setPixelWidth(/**
      * The new width in pixels
      */
    nWidth: Double): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getRenderMode renderMode}.
      *
      * Defines the mode that the Tokenizer will use:
      * 	 - `sap.m.TokenizerRenderMode.Loose` mode shows all tokens, no matter the width of the Tokenizer
      * 	 - `sap.m.TokenizerRenderMode.Narrow` mode forces the Tokenizer to show only as much tokens as possible
      * 			in its width and add an n-More indicator
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `RenderMode.Loose`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRenderMode(): this.type = js.native
    def setRenderMode(/**
      * New value for property `renderMode`
      */
    sRenderMode: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the Tokenizer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait TokenizerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * true if tokens shall be editable otherwise false
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the maximum width of the Tokenizer.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the mode that the Tokenizer will use:
      * 	 - `sap.m.TokenizerRenderMode.Loose` mode shows all tokens, no matter the width of the Tokenizer
      * 	 - `sap.m.TokenizerRenderMode.Narrow` mode forces the Tokenizer to show only as much tokens as possible
      * 			in its width and add an n-More indicator
      */
    var renderMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      */
    var tokenChange: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.82
      *
      * Fired when a token is deleted by clicking icon, pressing backspace or delete button.  Once the
      * event is fired, application is responsible for removing / destroying the token from the aggregation.
      */
    var tokenDelete: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.46
      * @deprecated (since 1.82) - replaced by `tokenDelete` event.
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      */
    var tokenUpdate: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * the currently displayed tokens
      */
    var tokens: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapMTokenMod.default] | typingsJapgolly.openui5.sapMTokenMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the Tokenizer.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TokenizerSettings {
    
    inline def apply(): TokenizerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizerSettings]
    }
    
    extension [Self <: TokenizerSettings](x: Self) {
      
      inline def setAriaDescribedBy(value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typingsJapgolly.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typingsJapgolly.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setRenderMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setTokenChange(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "tokenChange", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setTokenChangeUndefined: Self = StObject.set(x, "tokenChange", js.undefined)
      
      inline def setTokenDelete(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "tokenDelete", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setTokenDeleteUndefined: Self = StObject.set(x, "tokenDelete", js.undefined)
      
      inline def setTokenUpdate(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "tokenUpdate", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setTokenUpdateUndefined: Self = StObject.set(x, "tokenUpdate", js.undefined)
      
      inline def setTokens(
        value: js.Array[typingsJapgolly.openui5.sapMTokenMod.default] | typingsJapgolly.openui5.sapMTokenMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: typingsJapgolly.openui5.sapMTokenMod.default*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
