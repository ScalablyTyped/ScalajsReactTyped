package typingsJapgolly.senchaTouch.Ext.device.purchases

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.data.IErrors
import typingsJapgolly.senchaTouch.Ext.data.IModel
import typingsJapgolly.senchaTouch.Ext.data.IStore
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPurchase extends IModel {
  /** [Method] Attempts to mark this purchase as complete
  		* @param config Object
  		*/
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
}

object IPurchase {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    associations: Array = null,
    beginEdit: js.UndefOr[Callback] = js.undefined,
    belongsTo: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cancelEdit: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clientIdProperty: String = null,
    commit: /* silent */ js.UndefOr[Boolean] => Callback = null,
    complete: /* config */ js.UndefOr[js.Any] => Callback = null,
    config: js.Any = null,
    copy: /* id */ js.UndefOr[String] => CallbackTo[IPurchase] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dirty: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    endEdit: (/* silent */ js.UndefOr[Boolean], /* modifiedFieldNames */ js.UndefOr[Array]) => Callback = null,
    erase: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IPurchase] = null,
    extend: String = null,
    fields: js.Any = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    get: /* fieldName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getAssociatedData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAssociations: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getBelongsTo: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getChanges: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getClientIdProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getData: /* includeAssociated */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getFields: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getHasMany: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHasOne: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIdProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getIdentifier: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getIsErased: js.UndefOr[Callback] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getProxy: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUseCache: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getValidations: js.UndefOr[CallbackTo[Array]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasMany: js.Any = null,
    hasOne: js.Any = null,
    idProperty: String = null,
    identifier: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isModified: /* fieldName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    join: /* store */ js.UndefOr[IStore] => Callback = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    modified: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    phantom: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    proxy: js.Any = null,
    raw: js.Any = null,
    reject: /* silent */ js.UndefOr[Boolean] => Callback = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    save: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IPurchase] = null,
    self: IClass = null,
    set: (/* fieldName */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Callback = null,
    setAssociations: /* associations */ js.UndefOr[Array] => Callback = null,
    setBelongsTo: /* belongsTo */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setClientIdProperty: /* clientIdProperty */ js.UndefOr[String] => Callback = null,
    setConvertedData: /* data */ js.UndefOr[js.Any] => CallbackTo[IPurchase] = null,
    setData: /* rawData */ js.UndefOr[js.Any] => CallbackTo[IPurchase] = null,
    setDirty: js.UndefOr[Callback] = js.undefined,
    setFields: /* fields */ js.UndefOr[Array] => Callback = null,
    setHasMany: /* hasMany */ js.UndefOr[js.Any] => Callback = null,
    setHasOne: /* hasOne */ js.UndefOr[js.Any] => Callback = null,
    setId: /* id */ js.UndefOr[js.Any] => Callback = null,
    setIdProperty: /* idProperty */ js.UndefOr[String] => Callback = null,
    setIdentifier: /* identifier */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => Callback = null,
    setUseCache: /* useCache */ js.UndefOr[Boolean] => Callback = null,
    setValidations: /* validations */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stores: Array = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    toUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unjoin: /* store */ js.UndefOr[IStore] => Callback = null,
    useCache: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    validate: js.UndefOr[CallbackTo[IErrors]] = js.undefined,
    validations: Array = null
  ): IPurchase = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    beginEdit.foreach(p => __obj.updateDynamic("beginEdit")(p.toJsFn))
    if (belongsTo != null) __obj.updateDynamic("belongsTo")(belongsTo.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    cancelEdit.foreach(p => __obj.updateDynamic("cancelEdit")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => commit(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => copy(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction2((t0: /* silent */ js.UndefOr[scala.Boolean], t1: /* modifiedFieldNames */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => endEdit(t0, t1).runNow()))
    if (erase != null) __obj.updateDynamic("erase")(js.Any.fromFunction2((t0: /* options */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => erase(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => get(t0).runNow()))
    getAssociatedData.foreach(p => __obj.updateDynamic("getAssociatedData")(p.toJsFn))
    getAssociations.foreach(p => __obj.updateDynamic("getAssociations")(p.toJsFn))
    getBelongsTo.foreach(p => __obj.updateDynamic("getBelongsTo")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getChanges.foreach(p => __obj.updateDynamic("getChanges")(p.toJsFn))
    getClientIdProperty.foreach(p => __obj.updateDynamic("getClientIdProperty")(p.toJsFn))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: /* includeAssociated */ js.UndefOr[scala.Boolean]) => getData(t0).runNow()))
    getFields.foreach(p => __obj.updateDynamic("getFields")(p.toJsFn))
    getHasMany.foreach(p => __obj.updateDynamic("getHasMany")(p.toJsFn))
    getHasOne.foreach(p => __obj.updateDynamic("getHasOne")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    getIdProperty.foreach(p => __obj.updateDynamic("getIdProperty")(p.toJsFn))
    getIdentifier.foreach(p => __obj.updateDynamic("getIdentifier")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getIsErased.foreach(p => __obj.updateDynamic("getIsErased")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    getUseCache.foreach(p => __obj.updateDynamic("getUseCache")(p.toJsFn))
    getValidations.foreach(p => __obj.updateDynamic("getValidations")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasMany != null) __obj.updateDynamic("hasMany")(hasMany.asInstanceOf[js.Any])
    if (hasOne != null) __obj.updateDynamic("hasOne")(hasOne.asInstanceOf[js.Any])
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isModified != null) __obj.updateDynamic("isModified")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => isModified(t0).runNow()))
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IStore]) => join(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(phantom)) __obj.updateDynamic("phantom")(phantom.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => reject(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction2((t0: /* options */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => save(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* fieldName */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[js.Any]) => set(t0, t1).runNow()))
    if (setAssociations != null) __obj.updateDynamic("setAssociations")(js.Any.fromFunction1((t0: /* associations */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setAssociations(t0).runNow()))
    if (setBelongsTo != null) __obj.updateDynamic("setBelongsTo")(js.Any.fromFunction1((t0: /* belongsTo */ js.UndefOr[js.Any]) => setBelongsTo(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(js.Any.fromFunction1((t0: /* clientIdProperty */ js.UndefOr[java.lang.String]) => setClientIdProperty(t0).runNow()))
    if (setConvertedData != null) __obj.updateDynamic("setConvertedData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setConvertedData(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* rawData */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    setDirty.foreach(p => __obj.updateDynamic("setDirty")(p.toJsFn))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: /* fields */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFields(t0).runNow()))
    if (setHasMany != null) __obj.updateDynamic("setHasMany")(js.Any.fromFunction1((t0: /* hasMany */ js.UndefOr[js.Any]) => setHasMany(t0).runNow()))
    if (setHasOne != null) __obj.updateDynamic("setHasOne")(js.Any.fromFunction1((t0: /* hasOne */ js.UndefOr[js.Any]) => setHasOne(t0).runNow()))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => setId(t0).runNow()))
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(js.Any.fromFunction1((t0: /* idProperty */ js.UndefOr[java.lang.String]) => setIdProperty(t0).runNow()))
    if (setIdentifier != null) __obj.updateDynamic("setIdentifier")(js.Any.fromFunction1((t0: /* identifier */ js.UndefOr[js.Any]) => setIdentifier(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[js.Any]) => setProxy(t0).runNow()))
    if (setUseCache != null) __obj.updateDynamic("setUseCache")(js.Any.fromFunction1((t0: /* useCache */ js.UndefOr[scala.Boolean]) => setUseCache(t0).runNow()))
    if (setValidations != null) __obj.updateDynamic("setValidations")(js.Any.fromFunction1((t0: /* validations */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setValidations(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    toUrl.foreach(p => __obj.updateDynamic("toUrl")(p.toJsFn))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (unjoin != null) __obj.updateDynamic("unjoin")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IStore]) => unjoin(t0).runNow()))
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (validations != null) __obj.updateDynamic("validations")(validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPurchase]
  }
}

