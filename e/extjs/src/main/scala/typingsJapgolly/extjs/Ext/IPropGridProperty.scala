package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IErrors
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.data.proxy.IProxy
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropGridProperty extends IModel {
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IPropGridProperty: js.UndefOr[IMixedCollection] = js.undefined
}

object IPropGridProperty {
  @scala.inline
  def apply(
    COMMIT: java.lang.String = null,
    EDIT: java.lang.String = null,
    REJECT: java.lang.String = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    associations: Array = null,
    beginEdit: js.UndefOr[Callback] = js.undefined,
    belongsTo: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cancelEdit: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    clientIdProperty: java.lang.String = null,
    commit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Callback = null,
    config: js.Any = null,
    copy: /* id */ js.UndefOr[java.lang.String] => CallbackTo[IPropGridProperty] = null,
    defaultProxyType: java.lang.String = null,
    destroy: /* options */ js.UndefOr[js.Any] => CallbackTo[IPropGridProperty] = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    endEdit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Callback = null,
    extend: java.lang.String = null,
    fields: IMixedCollection = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    get: /* fieldName */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getAssociatedData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getChanges: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getData: /* includeAssociated */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getProxy: js.UndefOr[CallbackTo[IProxy]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hasMany: js.Any = null,
    idProperty: js.Any = null,
    idgen: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IPropGridProperty] = null,
    isModel: js.UndefOr[Boolean] = js.undefined,
    isModified: /* fieldName */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    join: /* store */ js.UndefOr[IStore] => Callback = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    persistenceProperty: java.lang.String = null,
    phantom: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: /* silent */ js.UndefOr[Boolean] => Callback = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    save: /* options */ js.UndefOr[js.Any] => CallbackTo[IPropGridProperty] = null,
    self: IClass = null,
    set: (/* fieldName */ js.UndefOr[js.Any], /* newValue */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    setDirty: js.UndefOr[Callback] = js.undefined,
    setId: /* id */ js.UndefOr[js.Any] => Callback = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => CallbackTo[IProxy] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    store: IStore = null,
    stores: Array = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    unjoin: /* store */ js.UndefOr[IStore] => Callback = null,
    uses: Array = null,
    validate: js.UndefOr[CallbackTo[IErrors]] = js.undefined,
    validations: Array = null
  ): IPropGridProperty = {
    val __obj = js.Dynamic.literal()
    if (COMMIT != null) __obj.updateDynamic("COMMIT")(COMMIT.asInstanceOf[js.Any])
    if (EDIT != null) __obj.updateDynamic("EDIT")(EDIT.asInstanceOf[js.Any])
    if (REJECT != null) __obj.updateDynamic("REJECT")(REJECT.asInstanceOf[js.Any])
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    beginEdit.foreach(p => __obj.updateDynamic("beginEdit")(p.toJsFn))
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    cancelEdit.foreach(p => __obj.updateDynamic("cancelEdit")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction2((t0: /* silent */ js.UndefOr[scala.Boolean], t1: /* modifiedFieldNames */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => commit(t0, t1).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => copy(t0).runNow()))
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => destroy(t0).runNow()))
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction2((t0: /* silent */ js.UndefOr[scala.Boolean], t1: /* modifiedFieldNames */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => endEdit(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => get(t0).runNow()))
    getAssociatedData.foreach(p => __obj.updateDynamic("getAssociatedData")(p.toJsFn))
    getChanges.foreach(p => __obj.updateDynamic("getChanges")(p.toJsFn))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: /* includeAssociated */ js.UndefOr[scala.Boolean]) => getData(t0).runNow()))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany.asInstanceOf[js.Any])
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (idgen != null) __obj.updateDynamic("idgen")(idgen.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isModel)) __obj.updateDynamic("isModel")(isModel.asInstanceOf[js.Any])
    if (isModified != null) __obj.updateDynamic("isModified")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => isModified(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore]) => join(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (persistenceProperty != null) __obj.updateDynamic("persistenceProperty")(persistenceProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => reject(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => save(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* fieldName */ js.UndefOr[js.Any], t1: /* newValue */ js.UndefOr[js.Any]) => set(t0, t1).runNow()))
    setDirty.foreach(p => __obj.updateDynamic("setDirty")(p.toJsFn))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => setId(t0).runNow()))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[js.Any]) => setProxy(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (unjoin != null) __obj.updateDynamic("unjoin")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore]) => unjoin(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropGridProperty]
  }
}

