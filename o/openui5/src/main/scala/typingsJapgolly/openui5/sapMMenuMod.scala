package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.`14`
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.Dock
import typingsJapgolly.openui5.sapUiCoreLibraryMod.IContextMenu
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMenuMod {
  
  @JSImport("sap/m/Menu", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Menu.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Menu {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MenuSettings) = this()
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
    mSettings: MenuSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Menu with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Menu]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Menu],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Menu.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Menu
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default
       with IContextMenu {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typingsJapgolly.openui5.sapMMenuItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.m.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Menu` itself.
      *
      * Fired when the menu is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.m.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Menu` itself.
      *
      * Fired when the menu is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
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
    def attachClosed(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelected itemSelected} event of this `sap.m.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Menu` itself.
      *
      * Fired when a `MenuItem` is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelected itemSelected} event of this `sap.m.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Menu` itself.
      *
      * Fired when a `MenuItem` is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelected(
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
    def attachItemSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Closes the `Menu`.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.m.Menu`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClosed(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemSelected itemSelected} event of this `sap.m.Menu`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelected(
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
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:itemSelected itemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelected(): this.type = js.native
    def fireItemSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: `14`): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items contained within this control.
      */
    def getItems(): js.Array[typingsJapgolly.openui5.sapMMenuItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the `Menu` title.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.m.MenuItem` in the aggregation {@link #getItems items}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typingsJapgolly.openui5.sapMMenuItemMod.default
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
    oItem: typingsJapgolly.openui5.sapMMenuItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the `Menu` next to the given control.
      */
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Unit,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Unit,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and "at" is RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    sOffset: String
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Unit,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Dock
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Unit,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Dock,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and "at" is RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    sOffset: String
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Dock
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Dock,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Unit,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and "at" is RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    sOffset: String
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Dock,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Dock
    ): Unit = js.native
    def openBy(
      /**
      * The control that defines the position for the menu
      */
    oControl: js.Object,
      /**
      * Whether the menu is opened with a shortcut or not
      */
    bWithKeyboard: Boolean,
      /**
      * The reference docking location of the `Menu` for positioning the menu on the screen
      */
    sDockMy: Dock,
      /**
      * The `oControl` reference docking location for positioning the menu on the screen
      */
    sDockAt: Dock,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and "at" is RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    sOffset: String
    ): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typingsJapgolly.openui5.sapMMenuItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typingsJapgolly.openui5.sapMMenuItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typingsJapgolly.openui5.sapMMenuItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typingsJapgolly.openui5.sapMMenuItemMod.default
    ): typingsJapgolly.openui5.sapMMenuItemMod.default | Null = js.native
    
    /**
      * Sets the title of the `Menu`.
      *
      * @returns `this` to allow method chaining
      */
    def setTitle(/**
      * The new title of the `Menu`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait MenuSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the menu is closed.
      */
    var closed: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Fired when a `MenuItem` is selected.
      */
    var itemSelected: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Defines the items contained within this control.
      */
    var items: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapMMenuItemMod.default] | typingsJapgolly.openui5.sapMMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `Menu` title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object MenuSettings {
    
    inline def apply(): MenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuSettings]
    }
    
    extension [Self <: MenuSettings](x: Self) {
      
      inline def setClosed(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "closed", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setItemSelected(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "itemSelected", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setItemSelectedUndefined: Self = StObject.set(x, "itemSelected", js.undefined)
      
      inline def setItems(
        value: js.Array[typingsJapgolly.openui5.sapMMenuItemMod.default] | typingsJapgolly.openui5.sapMMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typingsJapgolly.openui5.sapMMenuItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
