package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.CurrentRange
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

object sapUiCommonsResponsiveContainerMod {
  
  @JSImport("sap/ui/commons/ResponsiveContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ResponsiveContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveContainer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ResponsiveContainerSettings) = this()
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
    mSettings: ResponsiveContainerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ResponsiveContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ResponsiveContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ResponsiveContainer with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ResponsiveContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ResponsiveContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveContainer
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some range to the aggregation {@link #getRanges ranges}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRange(
      /**
      * The range to add; if empty, nothing is inserted
      */
    oRange: typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rangeSwitch rangeSwitch} event of this `sap.ui.commons.ResponsiveContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ResponsiveContainer` itself.
      *
      * The event is fired the width of the container reaches a new range.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRangeSwitch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRangeSwitch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ResponsiveContainer`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rangeSwitch rangeSwitch} event of this `sap.ui.commons.ResponsiveContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ResponsiveContainer` itself.
      *
      * The event is fired the width of the container reaches a new range.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRangeSwitch(
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
    def attachRangeSwitch(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ResponsiveContainer`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the ranges in the aggregation {@link #getRanges ranges}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRanges(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:rangeSwitch rangeSwitch} event of this `sap.ui.commons.ResponsiveContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRangeSwitch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRangeSwitch(
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
      * Fires event {@link #event:rangeSwitch rangeSwitch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRangeSwitch(): this.type = js.native
    def fireRangeSwitch(/**
      * Parameters to pass along with the event
      */
    mParameters: CurrentRange): this.type = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getDefaultContent defaultContent},
      * or `null`.
      */
    def getDefaultContent(): ID = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The width of the responsive container.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getRanges ranges}.
      *
      * The ranges defined for this container
      */
    def getRanges(): js.Array[typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the responsive container.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.ResponsiveContainerRange` in the aggregation {@link #getRanges
      * ranges}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRange(
      /**
      * The range whose index is looked for
      */
    oRange: typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default
    ): int = js.native
    
    /**
      * Inserts a range into the aggregation {@link #getRanges ranges}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRange(
      /**
      * The range to insert; if empty, nothing is inserted
      */
    oRange: typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default,
      /**
      * The `0`-based index the range should be inserted at; for a negative value of `iIndex`, the range is inserted
      * at position 0; for a value greater than the current size of the aggregation, the range is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRanges ranges}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRanges(): js.Array[typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default] = js.native
    
    def removeRange(/**
      * The range to remove or its index or id
      */
    vRange: String): typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default | Null = js.native
    /**
      * Removes a range from the aggregation {@link #getRanges ranges}.
      *
      * @returns The removed range or `null`
      */
    def removeRange(/**
      * The range to remove or its index or id
      */
    vRange: int): typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default | Null = js.native
    def removeRange(
      /**
      * The range to remove or its index or id
      */
    vRange: typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default
    ): typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default | Null = js.native
    
    def setDefaultContent(
      /**
      * ID of an element which becomes the new target of this defaultContent association; alternatively, an element
      * instance may be given
      */
    oDefaultContent: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getDefaultContent defaultContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultContent(
      /**
      * ID of an element which becomes the new target of this defaultContent association; alternatively, an element
      * instance may be given
      */
    oDefaultContent: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The width of the responsive container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the responsive container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ResponsiveContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The default content to show, in case the range does not provide content
      */
    var defaultContent: js.UndefOr[typingsJapgolly.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * The width of the responsive container.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired the width of the container reaches a new range.
      */
    var rangeSwitch: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * The ranges defined for this container
      */
    var ranges: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default] | typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the responsive container.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ResponsiveContainerSettings {
    
    inline def apply(): ResponsiveContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveContainerSettings]
    }
    
    extension [Self <: ResponsiveContainerSettings](x: Self) {
      
      inline def setDefaultContent(value: typingsJapgolly.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "defaultContent", value.asInstanceOf[js.Any])
      
      inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRangeSwitch(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "rangeSwitch", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setRangeSwitchUndefined: Self = StObject.set(x, "rangeSwitch", js.undefined)
      
      inline def setRanges(
        value: js.Array[typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default] | typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
