package typingsJapgolly.extjs.Ext.data.proxy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IBatch
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.reader.IReader
import typingsJapgolly.extjs.Ext.data.writer.IWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebStorage extends IClient {
  /** [Property] (Object) */
  var cache: js.UndefOr[js.Any] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("create")
  var create_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] inherit
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("destroy")
  var destroy_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("read")
  var read_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Saves the given record in the Proxy
  		* @param record Ext.data.Model The model instance
  		* @param id String The id to save the record under (defaults to the value of the record's getId() function)
  		*/
  var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param operation Object
  		* @param callback Object
  		* @param scope Object
  		*/
  @JSName("update")
  var update_IWebStorage: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IWebStorage {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    batch: /* options */ js.UndefOr[js.Any] => CallbackTo[IBatch] = null,
    batchActions: js.UndefOr[Boolean] = js.undefined,
    batchOrder: String = null,
    cache: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    create: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    destroy: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModel: js.UndefOr[CallbackTo[IModel]] = js.undefined,
    getReader: js.UndefOr[CallbackTo[IReader]] = js.undefined,
    getWriter: js.UndefOr[CallbackTo[IWriter]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IWebStorage] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isProxy: js.UndefOr[Boolean] = js.undefined,
    isSynchronous: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    read: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    reader: js.Any = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setModel: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Callback = null,
    setReader: /* reader */ js.UndefOr[js.Any] => CallbackTo[IReader] = null,
    setRecord: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Callback = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => CallbackTo[IWriter] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    update: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    writer: js.Any = null
  ): IWebStorage = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => batch(t0).runNow()))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions.asInstanceOf[js.Any])
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => create(t0, t1, t2).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => destroy(t0, t1, t2).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getModel.foreach(p => __obj.updateDynamic("getModel")(p.toJsFn))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    getWriter.foreach(p => __obj.updateDynamic("getWriter")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isProxy)) __obj.updateDynamic("isProxy")(isProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(isSynchronous)) __obj.updateDynamic("isSynchronous")(isSynchronous.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => read(t0, t1, t2).runNow()))
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction2((t0: /* model */ js.UndefOr[js.Any], t1: /* setOnStore */ js.UndefOr[scala.Boolean]) => setModel(t0, t1).runNow()))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1((t0: /* reader */ js.UndefOr[js.Any]) => setReader(t0).runNow()))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* id */ js.UndefOr[java.lang.String]) => setRecord(t0, t1).runNow()))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1((t0: /* writer */ js.UndefOr[js.Any]) => setWriter(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => update(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebStorage]
  }
}

