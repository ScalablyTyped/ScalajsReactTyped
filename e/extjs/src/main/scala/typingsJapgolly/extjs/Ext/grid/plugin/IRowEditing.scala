package typingsJapgolly.extjs.Ext.grid.plugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditing extends IEditing {
  /** [Config Option] (Boolean) */
  var autoCancel: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var clicksToMoveEditor: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var errorSummary: js.UndefOr[Boolean] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		* @returns Boolean true if editing was started, false otherwise.
  		*/
  @JSName("startEdit")
  var startEdit_IRowEditing: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Boolean]
  ] = js.undefined
}

object IRowEditing {
  @scala.inline
  def apply(
    addEvents: js.UndefOr[js.Any] => Callback = null,
    addListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoCancel: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cancelEdit: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    clicksToEdit: Int | Double = null,
    clicksToMoveEditor: Int | Double = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Callback = null,
    completeEdit: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disable: js.UndefOr[Callback] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    enableBubble: js.UndefOr[js.Any] => Callback = null,
    errorSummary: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (js.UndefOr[String], js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    hasListener: js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    init: /* client */ js.UndefOr[IComponent] => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IRowEditing] = null,
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
    startEdit: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => CallbackTo[Boolean] = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: js.UndefOr[Boolean] => Callback = null,
    triggerEvent: String = null,
    un: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IRowEditing = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any], t3: js.UndefOr[js.Any], t4: js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCancel)) __obj.updateDynamic("autoCancel")(autoCancel.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    cancelEdit.foreach(p => __obj.updateDynamic("cancelEdit")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (clicksToEdit != null) __obj.updateDynamic("clicksToEdit")(clicksToEdit.asInstanceOf[js.Any])
    if (clicksToMoveEditor != null) __obj.updateDynamic("clicksToMoveEditor")(clicksToMoveEditor.asInstanceOf[js.Any])
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1((t0: /* overrideCfg */ js.UndefOr[js.Any]) => clonePlugin(t0).runNow()))
    completeEdit.foreach(p => __obj.updateDynamic("completeEdit")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (!js.isUndefined(errorSummary)) __obj.updateDynamic("errorSummary")(errorSummary.asInstanceOf[js.Any])
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
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* columnHeader */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => startEdit(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[js.Any], t2: js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowEditing]
  }
}

