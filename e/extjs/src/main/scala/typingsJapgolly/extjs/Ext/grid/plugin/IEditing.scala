package typingsJapgolly.extjs.Ext.grid.plugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IAbstractPlugin
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined listeners, hasListeners, isObservable, addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un */ trait IEditing extends IAbstractPlugin {
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
  		*/
  var addEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Appends an event handler to this object
  		* @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var addListener: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
  		* @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		* @param options Object If the ename parameter was an event name, this is the addListener options.
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var addManagedListener: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Cancels any active edit that is in progress  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var clicksToEdit: js.UndefOr[Double] = js.undefined
  /** [Method] Completes the edit if there is an active edit in progress  */
  var completeEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.undefined
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param eventNames String/String[] The event name to bubble, or an Array of event names.
  		*/
  var enableBubble: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean returns false if any of the handlers return false otherwise it returns true.
  		*/
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
  /** [Method] Fires the specified event with the passed parameter list
  		* @param eventName String The name of the event to fire.
  		* @param args Object[] An array of parameters which are passed to handlers.
  		* @returns Boolean returns false if any of the handlers return false otherwise it returns true.
  		*/
  var fireEventArgs: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Array], Boolean]] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
  		* @param eventName String The name of the event to check for
  		* @returns Boolean true if the event is being listened for or bubbles, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[js.UndefOr[String], Boolean]] = js.undefined
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shorthand for addManagedListener
  		* @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		* @param options Object If the ename parameter was an event name, this is the addListener options.
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var mon: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Shorthand for removeManagedListener
  		* @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		*/
  var mun: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Shorthand for addListener
  		* @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
  		* @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
  		*/
  var on: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param origin Object The Observable whose events this object is to relay.
  		* @param events String[] Array of event names to relay.
  		* @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
  		* @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
  		*/
  var relayEvents: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String], _]] = js.undefined
  /** [Method] Removes an event handler
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var removeListener: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes listeners that were added by the mon method
  		* @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
  		* @param ename Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the ename parameter was an event name, this is the handler function.
  		* @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
  		*/
  var removeManagedListener: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Resumes firing of the named event s
  		* @param eventName String... Multiple event names to resume.
  		*/
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record in Store.
  		* @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Suspends firing of the named event s
  		* @param eventName String... Multiple event names to suspend.
  		*/
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Suspends the firing of all events
  		* @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
  		*/
  var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[String] = js.undefined
  /** [Method] Shorthand for removeListener
  		* @param eventName String The type of event the handler was associated with.
  		* @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
  		*/
  var un: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
}

object IEditing {
  @scala.inline
  def apply(
    addEvents: js.UndefOr[js.Any] => Callback = null,
    addListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cancelEdit: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    clicksToEdit: Int | Double = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Callback = null,
    completeEdit: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disable: js.UndefOr[Callback] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    enableBubble: js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (js.UndefOr[String], js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    hasListener: js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    init: /* client */ js.UndefOr[IComponent] => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IEditing] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    on: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    pluginId: String = null,
    relayEvents: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startEdit: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => Callback = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: js.UndefOr[Boolean] => Callback = null,
    triggerEvent: String = null,
    un: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IEditing = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any], t4: js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    cancelEdit.foreach(p => __obj.updateDynamic("cancelEdit")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (clicksToEdit != null) __obj.updateDynamic("clicksToEdit")(clicksToEdit.asInstanceOf[js.Any])
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1((t0: /* overrideCfg */ js.UndefOr[js.Any]) => clonePlugin(t0).runNow()))
    completeEdit.foreach(p => __obj.updateDynamic("completeEdit")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    getCmp.foreach(p => __obj.updateDynamic("getCmp")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* client */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => init(t0).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any], t4: js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: js.UndefOr[js.Any], t1: js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setCmp(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[js.Any], t1: /* columnHeader */ js.UndefOr[js.Any]) => startEdit(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditing]
  }
}

