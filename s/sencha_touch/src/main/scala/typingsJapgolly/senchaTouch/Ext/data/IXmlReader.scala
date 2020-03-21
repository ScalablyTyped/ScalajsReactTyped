package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlReader
  extends typingsJapgolly.senchaTouch.Ext.data.reader.IReader {
  /** [Method] Normalizes the data object
  		* @param data Object The raw data object.
  		* @returns Object Returns the documentElement property of the data object if present, or the same object if not.
  		*/
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
}

object IXmlReader {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clientIdProperty: String = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getClientIdProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getData: /* data */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIdProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getImplicitIncludes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMessageProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getModel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRecord: js.UndefOr[CallbackTo[String]] = js.undefined,
    getResponseData: /* response */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getRootProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSuccessProperty: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTotalProperty: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    idProperty: String = null,
    implicitIncludes: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    listeners: js.Any = null,
    messageProperty: String = null,
    metaData: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    rawData: js.Any = null,
    read: /* response */ js.UndefOr[js.Any] => CallbackTo[IResultSet] = null,
    readRecords: /* data */ js.UndefOr[js.Any] => CallbackTo[IResultSet] = null,
    record: String = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    root: String = null,
    rootProperty: String = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setClientIdProperty: /* clientIdProperty */ js.UndefOr[String] => Callback = null,
    setIdProperty: /* idProperty */ js.UndefOr[String] => Callback = null,
    setImplicitIncludes: /* implicitIncludes */ js.UndefOr[Boolean] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMessageProperty: /* messageProperty */ js.UndefOr[String] => Callback = null,
    setModel: /* model */ js.UndefOr[js.Any] => Callback = null,
    setRecord: /* record */ js.UndefOr[String] => Callback = null,
    setRootProperty: /* rootProperty */ js.UndefOr[String] => Callback = null,
    setSuccessProperty: /* successProperty */ js.UndefOr[String] => Callback = null,
    setTotalProperty: /* totalProperty */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    successProperty: String = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    totalProperty: String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IXmlReader = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getClientIdProperty.foreach(p => __obj.updateDynamic("getClientIdProperty")(p.toJsFn))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => getData(t0).runNow()))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    getIdProperty.foreach(p => __obj.updateDynamic("getIdProperty")(p.toJsFn))
    getImplicitIncludes.foreach(p => __obj.updateDynamic("getImplicitIncludes")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMessageProperty.foreach(p => __obj.updateDynamic("getMessageProperty")(p.toJsFn))
    getModel.foreach(p => __obj.updateDynamic("getModel")(p.toJsFn))
    getRecord.foreach(p => __obj.updateDynamic("getRecord")(p.toJsFn))
    if (getResponseData != null) __obj.updateDynamic("getResponseData")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[js.Any]) => getResponseData(t0).runNow()))
    getRootProperty.foreach(p => __obj.updateDynamic("getRootProperty")(p.toJsFn))
    getSuccessProperty.foreach(p => __obj.updateDynamic("getSuccessProperty")(p.toJsFn))
    getTotalProperty.foreach(p => __obj.updateDynamic("getTotalProperty")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitIncludes)) __obj.updateDynamic("implicitIncludes")(implicitIncludes.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (messageProperty != null) __obj.updateDynamic("messageProperty")(messageProperty.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (rawData != null) __obj.updateDynamic("rawData")(rawData.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[js.Any]) => read(t0).runNow()))
    if (readRecords != null) __obj.updateDynamic("readRecords")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => readRecords(t0).runNow()))
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(js.Any.fromFunction1((t0: /* clientIdProperty */ js.UndefOr[java.lang.String]) => setClientIdProperty(t0).runNow()))
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(js.Any.fromFunction1((t0: /* idProperty */ js.UndefOr[java.lang.String]) => setIdProperty(t0).runNow()))
    if (setImplicitIncludes != null) __obj.updateDynamic("setImplicitIncludes")(js.Any.fromFunction1((t0: /* implicitIncludes */ js.UndefOr[scala.Boolean]) => setImplicitIncludes(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMessageProperty != null) __obj.updateDynamic("setMessageProperty")(js.Any.fromFunction1((t0: /* messageProperty */ js.UndefOr[java.lang.String]) => setMessageProperty(t0).runNow()))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[js.Any]) => setModel(t0).runNow()))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[java.lang.String]) => setRecord(t0).runNow()))
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(js.Any.fromFunction1((t0: /* rootProperty */ js.UndefOr[java.lang.String]) => setRootProperty(t0).runNow()))
    if (setSuccessProperty != null) __obj.updateDynamic("setSuccessProperty")(js.Any.fromFunction1((t0: /* successProperty */ js.UndefOr[java.lang.String]) => setSuccessProperty(t0).runNow()))
    if (setTotalProperty != null) __obj.updateDynamic("setTotalProperty")(js.Any.fromFunction1((t0: /* totalProperty */ js.UndefOr[java.lang.String]) => setTotalProperty(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (successProperty != null) __obj.updateDynamic("successProperty")(successProperty.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (totalProperty != null) __obj.updateDynamic("totalProperty")(totalProperty.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlReader]
  }
}

