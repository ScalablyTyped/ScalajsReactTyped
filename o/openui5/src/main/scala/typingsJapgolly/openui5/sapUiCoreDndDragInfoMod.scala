package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreDndDragDropBaseMod.DragDropBaseSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.dnd.IDragInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDndDragInfoMod {
  
  @JSImport("sap/ui/core/dnd/DragInfo", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DragInfo.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DragInfo {
    def this(/**
      * Initial settings for the DragInfo
      */
    mSettings: DragInfoSettings) = this()
    def this(/**
      * ID for the new DragInfo, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new DragInfo, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the DragInfo
      */
    mSettings: DragInfoSettings
    ) = this()
    def this(
      /**
      * ID for the new DragInfo, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the DragInfo
      */
    mSettings: DragInfoSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_dnd_IDragInfo: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/dnd/DragInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.dnd.DragInfo with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.dnd.DragDropBase.extend}.
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
    oClassInfo: ClassInfo[T, DragInfo]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DragInfo],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.dnd.DragInfo.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DragInfo
    extends typingsJapgolly.openui5.sapUiCoreDndDragDropBaseMod.default
       with IDragInfo {
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:dragEnd dragEnd} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DragInfo` itself.
      *
      * This event is fired when a drag operation is being ended.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragEnd(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDragEnd(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DragInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:dragEnd dragEnd} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DragInfo` itself.
      *
      * This event is fired when a drag operation is being ended.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragEnd(
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
    def attachDragEnd(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DragInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dragStart dragStart} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DragInfo` itself.
      *
      * This event is fired when the user starts dragging an element.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDragStart(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DragInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dragStart dragStart} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.dnd.DragInfo` itself.
      *
      * This event is fired when the user starts dragging an element.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDragStart(
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
    def attachDragStart(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.dnd.DragInfo` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:dragEnd dragEnd} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDragEnd(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDragEnd(
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
      * Detaches event handler `fnFunction` from the {@link #event:dragStart dragStart} event of this `sap.ui.core.dnd.DragInfo`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDragStart(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDragStart(
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
      * @SINCE 1.56
      *
      * Fires event {@link #event:dragEnd dragEnd} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDragEnd(): this.type = js.native
    def fireDragEnd(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:dragStart dragStart} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireDragStart(): Boolean = js.native
    def fireDragStart(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSourceAggregation sourceAggregation}.
      *
      * The name of the aggregation from which all children can be dragged. If undefined, the control itself
      * can be dragged.
      *
      * @returns Value of property `sourceAggregation`
      */
    def getSourceAggregation(): String = js.native
    
    /**
      * Sets a new value for property {@link #getSourceAggregation sourceAggregation}.
      *
      * The name of the aggregation from which all children can be dragged. If undefined, the control itself
      * can be dragged.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSourceAggregation(): this.type = js.native
    def setSourceAggregation(/**
      * New value for property `sourceAggregation`
      */
    sSourceAggregation: String): this.type = js.native
  }
  
  trait DragInfoSettings
    extends StObject
       with DragDropBaseSettings {
    
    /**
      * @SINCE 1.56
      *
      * This event is fired when a drag operation is being ended.
      */
    var dragEnd: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * This event is fired when the user starts dragging an element.
      */
    var dragStart: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * The name of the aggregation from which all children can be dragged. If undefined, the control itself
      * can be dragged.
      */
    var sourceAggregation: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DragInfoSettings {
    
    inline def apply(): DragInfoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragInfoSettings]
    }
    
    extension [Self <: DragInfoSettings](x: Self) {
      
      inline def setDragEnd(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      inline def setDragStart(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setSourceAggregation(value: String | PropertyBindingInfo): Self = StObject.set(x, "sourceAggregation", value.asInstanceOf[js.Any])
      
      inline def setSourceAggregationUndefined: Self = StObject.set(x, "sourceAggregation", js.undefined)
    }
  }
}
