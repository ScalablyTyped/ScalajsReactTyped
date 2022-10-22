package typingsJapgolly.openui5

import typingsJapgolly.openui5.anon.Data
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelBindingMod {
  
  @JSImport("sap/ui/model/Binding", JSImport.Default)
  @js.native
  open class default protected () extends Binding {
    /**
      * Constructor for Binding class.
      */
    def this(
      /**
      * The model
      */
    oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      /**
      * The path
      */
    sPath: String,
      /**
      * The context object
      */
    oContext: typingsJapgolly.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * The model
      */
    oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      /**
      * The path
      */
    sPath: String,
      /**
      * The context object
      */
    oContext: typingsJapgolly.openui5.sapUiModelContextMod.default,
      /**
      * Additional, implementation-specific parameters
      */
    mParameters: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/Binding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.Binding with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, Binding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Binding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.Binding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Binding
    extends typingsJapgolly.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:AggregatedDataStateChange AggregatedDataStateChange}
      * event of this `sap.ui.model.Binding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachAggregatedDataStateChange(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachAggregatedDataStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches the `fnFunction` event handler to the {@link #event:change change} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachChange(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataReceived dataReceived} event of this `sap.ui.model.Binding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachDataReceived(/**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachDataReceived(
      /**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataRequested dataRequested} event of this `sap.ui.model.Binding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachDataRequested(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachDataRequested(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches the `fnFunction` event handler to the {@link #event:DataStateChange DataStateChange} event of
      * thi `sap.ui.model.Binding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachDataStateChange(/**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachDataStateChange(
      /**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attach multiple events.
      *
      * @returns A reference to itself
      */
    def attachEvents(/**
      * Events to attach to this binding
      */
    oEvents: Record[String, js.Function]): Binding = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:refresh refresh} event of this `sap.ui.model.Binding`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Binding` itself.
      */
    def attachRefresh(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachRefresh(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to this `sap.ui.model.Binding` itself
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:AggregatedDataStateChange AggregatedDataStateChange}
      * event of this `sap.ui.model.Binding`.
      */
    def detachAggregatedDataStateChange(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachAggregatedDataStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.model.Binding`.
      */
    def detachChange(/**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachChange(
      /**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:dataReceived dataReceived} event of this `sap.ui.model.Binding`.
      */
    def detachDataReceived(/**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachDataReceived(
      /**
      * Function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:dataRequested dataRequested} event of this
      * `sap.ui.model.Binding`.
      */
    def detachDataRequested(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachDataRequested(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:DataStateChange DataStateChange} event of
      * this `sap.ui.model.Binding`.
      */
    def detachDataStateChange(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachDataStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detach multiple events.
      *
      * @returns A reference to itself
      */
    def detachEvents(/**
      * Events to detach from this binding
      */
    oEvents: Record[String, js.Function]): Binding = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:refresh refresh} event of this `sap.ui.model.Binding`.
      */
    def detachRefresh(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachRefresh(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function.
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Fires event {@link #event:dataReceived dataReceived} to attached listeners.
      *
      * This event may also be fired when an error occurred.
      */
    def fireDataReceived(/**
      * Parameters to pass along with the event
      */
    oParameters: Data): Unit = js.native
    
    /**
      * Fires event {@link #event:dataRequested dataRequested} to attached listeners.
      */
    def fireDataRequested(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): Unit = js.native
    
    /**
      * Returns the model context in which this binding will be resolved.
      *
      * If the binding path is absolute, the context is not relevant.
      *
      * @returns Context object
      */
    def getContext(): typingsJapgolly.openui5.sapUiModelContextMod.default = js.native
    
    /**
      * @SINCE 1.82.0
      *
      * Whether this binding does not propagate model messages to the control. By default, all bindings propagate
      * messages. If a binding wants to support this feature, it has to override {@link #supportsIgnoreMessages},
      * which returns `true`.
      *
      * For example, a binding for a currency code is used in a composite binding for rendering the proper number
      * of decimals, but the currency code is not displayed in the attached control. In that case, messages for
      * the currency code shall not be displayed at that control, only messages for the amount.
      *
      * @returns Whether this binding does not propagate model messages to the control; returns `undefined` if
      * the corresponding binding parameter is not set, which means that model messages are propagated to the
      * control
      */
    def getIgnoreMessages(): js.UndefOr[Boolean] = js.native
    
    /**
      * Returns the model to which this binding belongs.
      *
      * @returns Model to which this binding belongs
      */
    def getModel(): typingsJapgolly.openui5.sapUiModelModelMod.default = js.native
    
    /**
      * Returns the model path to which this binding binds.
      *
      * Might be a relative or absolute path. If it is relative, it will be resolved relative to the context
      * as returned by {@link #getContext}.
      *
      * @returns Binding path
      */
    def getPath(): String = js.native
    
    /**
      * @SINCE 1.88.0
      *
      * Provides the resolved path for this binding's path and context and returns it, or `undefined` if the
      * binding is not resolved or has no model.
      *
      * @returns The resolved path
      */
    def getResolvedPath(): js.UndefOr[String] = js.native
    
    /**
      * Initialize the binding. The message should be called when creating a binding. The default implementation
      * calls checkUpdate(true).
      */
    def initialize(): Unit = js.native
    
    /**
      * Returns whether the binding is initial, which means it did not get an initial value yet.
      *
      * @returns Whether the binding is initial
      */
    def isInitial(): Boolean = js.native
    
    /**
      * Returns whether the binding is relative, which means its path does not start with a slash.
      *
      * @returns Whether the binding is relative
      */
    def isRelative(): Boolean = js.native
    
    /**
      * @SINCE 1.79.0
      *
      * Returns whether the binding is resolved, which means the binding's path is absolute or the binding has
      * a model context.
      * See:
      * 	#getContext
      * 	#getPath
      * 	#isRelative
      *
      * @returns Whether the binding is resolved
      */
    def isResolved(): Boolean = js.native
    
    /**
      * Returns true if the binding is suspended or false if not.
      *
      * @returns Whether the binding is suspended
      */
    def isSuspended(): Boolean = js.native
    
    /**
      * Refreshes the binding, check whether the model data has been changed and fire change event if this is
      * the case. For server side models this should refetch the data from the server. To update a control, even
      * if no data has been changed, e.g. to reset a control after failed validation, please use the parameter
      * `bForceUpdate`.
      */
    def refresh(): Unit = js.native
    def refresh(/**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean): Unit = js.native
    
    /**
      * Resumes the binding update. Change events will be fired again.
      *
      * When the binding is resumed, a change event will be fired immediately if the data has changed while the
      * binding was suspended. For server-side models, a request to the server will be triggered if a refresh
      * was requested while the binding was suspended.
      */
    def resume(): Unit = js.native
    
    /**
      * @SINCE 1.82.0
      *
      * Sets the indicator whether this binding does not propagate model messages to the control.
      * See:
      * 	#getIgnoreMessages
      * 	#supportsIgnoreMessages
      */
    def setIgnoreMessages(
      /**
      * Whether this binding does not propagate model messages to the control
      */
    bIgnoreMessages: Boolean
    ): Unit = js.native
    
    /**
      * @SINCE 1.82.0
      *
      * Whether this binding supports the feature of not propagating model messages to the control. The default
      * implementation returns `false`.
      * See:
      * 	#getIgnoreMessages
      * 	#setIgnoreMessages
      *
      * @returns `false`; subclasses that support this feature need to override this function and need to return
      * `true`
      */
    def supportsIgnoreMessages(): Boolean = js.native
    
    /**
      * Suspends the binding update. No change events will be fired.
      *
      * A refresh call with bForceUpdate set to true will also update the binding and fire a change in suspended
      * mode. Special operations on bindings, which require updates to work properly (as paging or filtering
      * in list bindings) will also update and cause a change event although the binding is suspended.
      */
    def suspend(): Unit = js.native
    
    /**
      * Determines if the binding should be updated by comparing the current model against a specified model.
      *
      * @returns Whether this binding should be updated
      */
    def updateRequired(/**
      * The model instance to compare against
      */
    oModel: js.Object): Boolean = js.native
  }
}
