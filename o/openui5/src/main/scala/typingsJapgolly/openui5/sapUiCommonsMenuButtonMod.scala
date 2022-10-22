package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.ItemId
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCommonsButtonMod.ButtonSettings
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMenuButtonMod {
  
  @JSImport("sap/ui/commons/MenuButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MenuButton.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MenuButton {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MenuButtonSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: MenuButtonSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MenuButtonSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/MenuButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.MenuButton with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.Button.extend}.
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
    oClassInfo: ClassInfo[T, MenuButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MenuButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.MenuButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MenuButton
    extends typingsJapgolly.openui5.sapUiCommonsButtonMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelected itemSelected} event of this `sap.ui.commons.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MenuButton` itself.
      *
      * Event that is fired when a menu item is selected by the user
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelected itemSelected} event of this `sap.ui.commons.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MenuButton` itself.
      *
      * Event that is fired when a menu item is selected by the user
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MenuButton` itself.
      *
      * Event is fired when an item from the menu was selected.
      * See:
      * 	sap.ui.commons.MenuButton#attachItemSelected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.MenuButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.MenuButton` itself.
      *
      * Event is fired when an item from the menu was selected.
      * See:
      * 	sap.ui.commons.MenuButton#attachItemSelected
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
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.MenuButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the menu in the aggregation named `menu`.
      *
      * @returns `this` to allow method chaining
      */
    def destroyMenu(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemSelected itemSelected} event of this `sap.ui.commons.MenuButton`.
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
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.commons.MenuButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      * See:
      * 	sap.ui.commons.MenuButton#detachItemSelected
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachPress(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:itemSelected itemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelected(): this.type = js.native
    def fireItemSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemId): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDockButton dockButton}.
      *
      * The position / edge (see sap.ui.core.Popup.Dock) of the button where the menu is docked. Default is 'begin
      * bottom'.
      *
      * @returns Value of property `dockButton`
      */
    def getDockButton(): String = js.native
    
    /**
      * Gets current value of property {@link #getDockMenu dockMenu}.
      *
      * The position / edge (see sap.ui.core.Popup.Dock) of the menu which is docked to the button. Default is
      * 'begin top'.
      *
      * @returns Value of property `dockMenu`
      */
    def getDockMenu(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getMenu menu}.
      *
      * Menu that shall be opened when the button is clicked
      */
    def getMenu(): typingsJapgolly.openui5.sapUiUnifiedMenuMod.default = js.native
    
    /**
      * Sets a new value for property {@link #getDockButton dockButton}.
      *
      * The position / edge (see sap.ui.core.Popup.Dock) of the button where the menu is docked. Default is 'begin
      * bottom'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDockButton(): this.type = js.native
    def setDockButton(/**
      * New value for property `dockButton`
      */
    sDockButton: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDockMenu dockMenu}.
      *
      * The position / edge (see sap.ui.core.Popup.Dock) of the menu which is docked to the button. Default is
      * 'begin top'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDockMenu(): this.type = js.native
    def setDockMenu(/**
      * New value for property `dockMenu`
      */
    sDockMenu: String): this.type = js.native
    
    /**
      * Setter for the aggregated `menu`.
      *
      * @returns `this` to allow method chaining
      */
    def setMenu(
      /**
      * The menu to be set to the menu aggregation
      */
    oMenu: typingsJapgolly.openui5.sapUiUnifiedMenuMod.default
    ): this.type = js.native
  }
  
  trait MenuButtonSettings
    extends StObject
       with ButtonSettings {
    
    /**
      * The position / edge (see sap.ui.core.Popup.Dock) of the button where the menu is docked. Default is 'begin
      * bottom'.
      */
    var dockButton: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The position / edge (see sap.ui.core.Popup.Dock) of the menu which is docked to the button. Default is
      * 'begin top'.
      */
    var dockMenu: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event that is fired when a menu item is selected by the user
      */
    var itemSelected: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * Menu that shall be opened when the button is clicked
      */
    var menu: js.UndefOr[typingsJapgolly.openui5.sapUiUnifiedMenuMod.default] = js.undefined
  }
  object MenuButtonSettings {
    
    inline def apply(): MenuButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuButtonSettings]
    }
    
    extension [Self <: MenuButtonSettings](x: Self) {
      
      inline def setDockButton(value: String | PropertyBindingInfo): Self = StObject.set(x, "dockButton", value.asInstanceOf[js.Any])
      
      inline def setDockButtonUndefined: Self = StObject.set(x, "dockButton", js.undefined)
      
      inline def setDockMenu(value: String | PropertyBindingInfo): Self = StObject.set(x, "dockMenu", value.asInstanceOf[js.Any])
      
      inline def setDockMenuUndefined: Self = StObject.set(x, "dockMenu", js.undefined)
      
      inline def setItemSelected(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "itemSelected", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setItemSelectedUndefined: Self = StObject.set(x, "itemSelected", js.undefined)
      
      inline def setMenu(value: typingsJapgolly.openui5.sapUiUnifiedMenuMod.default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
}
