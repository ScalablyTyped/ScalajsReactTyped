package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.ItemChanged
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreElementMod.ElementSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.URI
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTabContainerItemMod {
  
  @JSImport("sap/m/TabContainerItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TabContainerItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TabContainerItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TabContainerItemSettings) = this()
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
    mSettings: TabContainerItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TabContainerItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TabContainerItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TabContainerItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, TabContainerItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TabContainerItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TabContainerItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TabContainerItem
    extends typingsJapgolly.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.TabContainerItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainerItem` itself.
      *
      * Sends information that some of the properties have changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainerItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.TabContainerItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainerItem` itself.
      *
      * Sends information that some of the properties have changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPropertyChanged(
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
    def attachItemPropertyChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainerItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.TabContainerItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemPropertyChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemPropertyChanged(
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
      * Fires event {@link #event:itemPropertyChanged itemPropertyChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemPropertyChanged(): this.type = js.native
    def fireItemPropertyChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemChanged): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Gets current value of property {@link #getAdditionalText additionalText}.
      *
      * Determines additional text to be displayed for the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `additionalText`
      */
    def getAdditionalText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content displayed for this item.
      */
    def getContent(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as graphical element within the `TabContainerItem`. It can be an image
      * or an icon from the icon font.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Gets current value of property {@link #getIconTooltip iconTooltip}.
      *
      * Determines the tooltip text of the `TabContainerItem`'s icon.
      *
      * @returns Value of property `iconTooltip`
      */
    def getIconTooltip(): String = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Determines the name of the item. Can be used as input for subsequent actions.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getModified modified}.
      *
      * Shows if a control is edited (default is false). Items that are marked as modified have a * symbol to
      * indicate that they haven't been saved.
      *
      * Default value is `false`.
      *
      * @returns Value of property `modified`
      */
    def getModified(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Determines the text to be displayed for the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typingsJapgolly.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Sets a new value for property {@link #getAdditionalText additionalText}.
      *
      * Determines additional text to be displayed for the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalText(): this.type = js.native
    def setAdditionalText(/**
      * New value for property `additionalText`
      */
    sAdditionalText: String): this.type = js.native
    
    /**
      * Property setter for the icon
      *
      * @returns `this` to allow method chaining
      */
    def setIcon(/**
      * new value of the Icon property
      */
    sIcon: URI): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Sets a new value for property {@link #getIconTooltip iconTooltip}.
      *
      * Determines the tooltip text of the `TabContainerItem`'s icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconTooltip(): this.type = js.native
    def setIconTooltip(/**
      * New value for property `iconTooltip`
      */
    sIconTooltip: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Determines the name of the item. Can be used as input for subsequent actions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(): this.type = js.native
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getModified modified}.
      *
      * Shows if a control is edited (default is false). Items that are marked as modified have a * symbol to
      * indicate that they haven't been saved.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModified(): this.type = js.native
    def setModified(/**
      * New value for property `modified`
      */
    bModified: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Determines the text to be displayed for the item.
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
    
    def setProperty(
      /**
      * Property name to be set
      */
    sName: String,
      /**
      * Property value to be set
      */
    vValue: String,
      /**
      * Whether invalidation to be suppressed
      */
    bSuppressInvalidation: Boolean
    ): this.type = js.native
    def setProperty(
      /**
      * Property name to be set
      */
    sName: String,
      /**
      * Property value to be set
      */
    vValue: js.Object,
      /**
      * Whether invalidation to be suppressed
      */
    bSuppressInvalidation: Boolean
    ): this.type = js.native
    /**
      * Overwrites the method in order to suppress invalidation for some properties.
      *
      * @returns This instance for chaining
      */
    def setProperty(
      /**
      * Property name to be set
      */
    sName: String,
      /**
      * Property value to be set
      */
    vValue: Boolean,
      /**
      * Whether invalidation to be suppressed
      */
    bSuppressInvalidation: Boolean
    ): this.type = js.native
  }
  
  trait TabContainerItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Determines additional text to be displayed for the item.
      */
    var additionalText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The content displayed for this item.
      */
    var content: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Defines the icon to be displayed as graphical element within the `TabContainerItem`. It can be an image
      * or an icon from the icon font.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.63)
      *
      * Determines the tooltip text of the `TabContainerItem`'s icon.
      */
    var iconTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sends information that some of the properties have changed.
      */
    var itemPropertyChanged: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Determines the name of the item. Can be used as input for subsequent actions.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Shows if a control is edited (default is false). Items that are marked as modified have a * symbol to
      * indicate that they haven't been saved.
      */
    var modified: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the text to be displayed for the item.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TabContainerItemSettings {
    
    inline def apply(): TabContainerItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainerItemSettings]
    }
    
    extension [Self <: TabContainerItemSettings](x: Self) {
      
      inline def setAdditionalText(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setContent(
        value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typingsJapgolly.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconTooltip", value.asInstanceOf[js.Any])
      
      inline def setIconTooltipUndefined: Self = StObject.set(x, "iconTooltip", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemPropertyChanged(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "itemPropertyChanged", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setItemPropertyChangedUndefined: Self = StObject.set(x, "itemPropertyChanged", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModified(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
