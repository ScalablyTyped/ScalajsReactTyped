package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.Alpha
import typingsJapgolly.openui5.anon.B
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode
import typingsJapgolly.openui5.sapUiUnifiedLibraryMod.ColorPickerMode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedColorPickerMod {
  
  @JSImport("sap/ui/unified/ColorPicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ColorPicker`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColorPicker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColorPickerSettings) = this()
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
    mSettings: ColorPickerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColorPickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/ColorPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.ColorPicker with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ColorPicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColorPicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.ColorPicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColorPicker
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.48.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.ColorPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPicker` itself.
      *
      * Fired when the value is changed by user action.
      *
      * **Note:** When the user action is mouse dragging, the `change` event fires on the mouseup event.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.48.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.ColorPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPicker` itself.
      *
      * Fired when the value is changed by user action.
      *
      * **Note:** When the user action is mouse dragging, the `change` event fires on the mouseup event.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPicker` itself.
      *
      * Fired when the value is changed during the mouse move.
      *
      * **Note:** When the user action is mouse move, the `liveChange` event is fired during the mousedown event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.48.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPicker` itself.
      *
      * Fired when the value is changed during the mouse move.
      *
      * **Note:** When the user action is mouse move, the `liveChange` event is fired during the mousedown event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.unified.ColorPicker`.
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
      * @SINCE 1.48.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * @SINCE 1.48.0
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Alpha): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Alpha): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Gets current value of property {@link #getColorString colorString}.
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      *
      * @returns Value of property `colorString`
      */
    def getColorString(): String = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getDisplayMode displayMode}.
      *
      * Determines the display mode of the `ColorPicker` among three types - Default, Large and Simplified
      *
      * Default value is `Default`.
      *
      * @returns Value of property `displayMode`
      */
    def getDisplayMode(): ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Determines the color representation mode the ColorPicker works with - Hue, Saturation, and Value (HSV)
      * or Hue, Saturation, and Lightness (HSL).
      *
      * **Note:** The `ColorPickerMode.HSV` is set by default. For color composing with alpha values, please
      * set the mode to `ColorPickerMode.HSL`
      *
      * Default value is `HSV`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Gets current RGB values.
      *
      * @returns Containing current RGB values
      */
    def getRGB(): B = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Checks the validity of the CSS color string.
      *
      * @returns If the passed string is a valid CSS color string
      */
    def isColor(/**
      * CSS color string to be validated
      */
    sColorString: String): Boolean = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Sets a new value for property {@link #getColorString colorString}.
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColorString(): this.type = js.native
    def setColorString(/**
      * New value for property `colorString`
      */
    sColorString: String): this.type = js.native
    
    def setDisplayMode(
      /**
      * control displayMode enum
      */
    sDisplayMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String
    ): Unit = js.native
    /**
      * Setter for `displayMode` property.
      */
    def setDisplayMode(/**
      * control displayMode enum
      */
    sDisplayMode: ColorPickerDisplayMode): Unit = js.native
    
    def setMode(
      /**
      * control mode enum
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String,
      /**
      * should control invalidation be suppressed
      */
    bSuppressInvalidate: Boolean
    ): Unit = js.native
    /**
      * Setter for `mode` property.
      */
    def setMode(
      /**
      * control mode enum
      */
    sMode: ColorPickerMode,
      /**
      * should control invalidation be suppressed
      */
    bSuppressInvalidate: Boolean
    ): Unit = js.native
  }
  
  trait ColorPickerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.48.0
      *
      * Fired when the value is changed by user action.
      *
      * **Note:** When the user action is mouse dragging, the `change` event fires on the mouseup event.
      */
    var change: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.48.0
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      */
    var colorString: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Determines the display mode of the `ColorPicker` among three types - Default, Large and Simplified
      */
    var displayMode: js.UndefOr[
        ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.48.0
      *
      * Fired when the value is changed during the mouse move.
      *
      * **Note:** When the user action is mouse move, the `liveChange` event is fired during the mousedown event.
      */
    var liveChange: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.48.0
      *
      * Determines the color representation mode the ColorPicker works with - Hue, Saturation, and Value (HSV)
      * or Hue, Saturation, and Lightness (HSL).
      *
      * **Note:** The `ColorPickerMode.HSV` is set by default. For color composing with alpha values, please
      * set the mode to `ColorPickerMode.HSL`
      */
    var mode: js.UndefOr[
        ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ColorPickerSettings {
    
    inline def apply(): ColorPickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerSettings]
    }
    
    extension [Self <: ColorPickerSettings](x: Self) {
      
      inline def setChange(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setColorString(value: String | PropertyBindingInfo): Self = StObject.set(x, "colorString", value.asInstanceOf[js.Any])
      
      inline def setColorStringUndefined: Self = StObject.set(x, "colorString", js.undefined)
      
      inline def setDisplayMode(
        value: ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "liveChange", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMode(
        value: ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
