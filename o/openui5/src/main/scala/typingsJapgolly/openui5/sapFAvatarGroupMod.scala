package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.AvatarsDisplayed
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapFLibraryMod.AvatarGroupType
import typingsJapgolly.openui5.sapMAvatarSizeMod.AvatarSize
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.AbsoluteCSSSize
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFAvatarGroupMod {
  
  @JSImport("sap/f/AvatarGroup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `AvatarGroup`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AvatarGroup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupSettings) = this()
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
    mSettings: AvatarGroupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/AvatarGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.AvatarGroup with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, AvatarGroup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AvatarGroup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.AvatarGroup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AvatarGroup
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typingsJapgolly.openui5.sapFAvatarGroupItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.AvatarGroup` itself.
      *
      * Fired when the user clicks or taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.AvatarGroup` itself.
      *
      * Fired when the user clicks or taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.f.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.f.AvatarGroup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: AvatarsDisplayed): this.type = js.native
    
    /**
      * @SINCE 1.103
      *
      * Gets current value of property {@link #getAvatarCustomDisplaySize avatarCustomDisplaySize}.
      *
      * Specifies a custom display size for each avatar.
      *
      * **Notes:**
      * 	 - Supports only `px` and code>rem values.
      * 	 - It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      *
      * Default value is `"3rem"`.
      *
      * @returns Value of property `avatarCustomDisplaySize`
      */
    def getAvatarCustomDisplaySize(): AbsoluteCSSSize = js.native
    
    /**
      * @SINCE 1.103
      *
      * Gets current value of property {@link #getAvatarCustomFontSize avatarCustomFontSize}.
      *
      * Specifies a custom font size for each avatar.
      *
      * **Note:** It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      *
      * Default value is `"1.125rem"`.
      *
      * @returns Value of property `avatarCustomFontSize`
      */
    def getAvatarCustomFontSize(): AbsoluteCSSSize = js.native
    
    /**
      * Gets current value of property {@link #getAvatarDisplaySize avatarDisplaySize}.
      *
      * Defines the display size of each avatar.
      *
      * Default value is `S`.
      *
      * @returns Value of property `avatarDisplaySize`
      */
    def getAvatarDisplaySize(): AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getGroupType groupType}.
      *
      * Defines the mode of the `AvatarGroup`.
      *
      * Default value is `Group`.
      *
      * @returns Value of property `groupType`
      */
    def getGroupType(): AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The `AvatarGroupItems` contained by the control.
      */
    def getItems(): js.Array[typingsJapgolly.openui5.sapFAvatarGroupItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.f.AvatarGroupItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typingsJapgolly.openui5.sapFAvatarGroupItemMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typingsJapgolly.openui5.sapFAvatarGroupItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typingsJapgolly.openui5.sapFAvatarGroupItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typingsJapgolly.openui5.sapFAvatarGroupItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typingsJapgolly.openui5.sapFAvatarGroupItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typingsJapgolly.openui5.sapFAvatarGroupItemMod.default
    ): typingsJapgolly.openui5.sapFAvatarGroupItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.103
      *
      * Sets a new value for property {@link #getAvatarCustomDisplaySize avatarCustomDisplaySize}.
      *
      * Specifies a custom display size for each avatar.
      *
      * **Notes:**
      * 	 - Supports only `px` and code>rem values.
      * 	 - It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"3rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAvatarCustomDisplaySize(): this.type = js.native
    def setAvatarCustomDisplaySize(
      /**
      * New value for property `avatarCustomDisplaySize`
      */
    sAvatarCustomDisplaySize: AbsoluteCSSSize
    ): this.type = js.native
    
    /**
      * @SINCE 1.103
      *
      * Sets a new value for property {@link #getAvatarCustomFontSize avatarCustomFontSize}.
      *
      * Specifies a custom font size for each avatar.
      *
      * **Note:** It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"1.125rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAvatarCustomFontSize(): this.type = js.native
    def setAvatarCustomFontSize(/**
      * New value for property `avatarCustomFontSize`
      */
    sAvatarCustomFontSize: AbsoluteCSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAvatarDisplaySize avatarDisplaySize}.
      *
      * Defines the display size of each avatar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `S`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAvatarDisplaySize(): this.type = js.native
    def setAvatarDisplaySize(
      /**
      * New value for property `avatarDisplaySize`
      */
    sAvatarDisplaySize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String
    ): this.type = js.native
    def setAvatarDisplaySize(/**
      * New value for property `avatarDisplaySize`
      */
    sAvatarDisplaySize: AvatarSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupType groupType}.
      *
      * Defines the mode of the `AvatarGroup`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Group`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupType(): this.type = js.native
    def setGroupType(
      /**
      * New value for property `groupType`
      */
    sGroupType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String
    ): this.type = js.native
    def setGroupType(/**
      * New value for property `groupType`
      */
    sGroupType: AvatarGroupType): this.type = js.native
  }
  
  trait AvatarGroupSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.103
      *
      * Specifies a custom display size for each avatar.
      *
      * **Notes:**
      * 	 - Supports only `px` and code>rem values.
      * 	 - It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      */
    var avatarCustomDisplaySize: js.UndefOr[
        AbsoluteCSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.103
      *
      * Specifies a custom font size for each avatar.
      *
      * **Note:** It takes effect only if the `avatarDisplaySize` property is set to `Custom`.
      */
    var avatarCustomFontSize: js.UndefOr[
        AbsoluteCSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the display size of each avatar.
      */
    var avatarDisplaySize: js.UndefOr[
        AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the mode of the `AvatarGroup`.
      */
    var groupType: js.UndefOr[
        AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The `AvatarGroupItems` contained by the control.
      */
    var items: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapFAvatarGroupItemMod.default] | typingsJapgolly.openui5.sapFAvatarGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user clicks or taps on the control.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
  }
  object AvatarGroupSettings {
    
    inline def apply(): AvatarGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarGroupSettings]
    }
    
    extension [Self <: AvatarGroupSettings](x: Self) {
      
      inline def setAvatarCustomDisplaySize(value: AbsoluteCSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "avatarCustomDisplaySize", value.asInstanceOf[js.Any])
      
      inline def setAvatarCustomDisplaySizeUndefined: Self = StObject.set(x, "avatarCustomDisplaySize", js.undefined)
      
      inline def setAvatarCustomFontSize(value: AbsoluteCSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "avatarCustomFontSize", value.asInstanceOf[js.Any])
      
      inline def setAvatarCustomFontSizeUndefined: Self = StObject.set(x, "avatarCustomFontSize", js.undefined)
      
      inline def setAvatarDisplaySize(
        value: AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "avatarDisplaySize", value.asInstanceOf[js.Any])
      
      inline def setAvatarDisplaySizeUndefined: Self = StObject.set(x, "avatarDisplaySize", js.undefined)
      
      inline def setGroupType(
        value: AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
      
      inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
      
      inline def setItems(
        value: js.Array[typingsJapgolly.openui5.sapFAvatarGroupItemMod.default] | typingsJapgolly.openui5.sapFAvatarGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typingsJapgolly.openui5.sapFAvatarGroupItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPress(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "press", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
    }
  }
}
