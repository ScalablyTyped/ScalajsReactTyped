package typingsJapgolly.extjs.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IController extends IObservable {
  /** [Method] Registers one or more references
  		* @param refs Object/Object[]
  		*/
  var addRef: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Method] Adds listeners to components selected via Ext ComponentQuery
  		* @param selectors String/Object If a String, the second argument is used as the listeners, otherwise an object of selectors -> listeners is assumed
  		* @param listeners Object Config for listeners.
  		*/
  var control: js.UndefOr[
    js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns instance of a Controller with the given id
  		* @param id String
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Returns a Model class with the given name
  		* @param name String
  		* @returns Ext.data.Model a model class.
  		*/
  var getModel: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IModel]] = js.undefined
  /** [Method] Returns instance of a Store with the given name
  		* @param name String
  		* @returns Ext.data.Store a store instance.
  		*/
  var getStore: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IStore]] = js.undefined
  /** [Method] Returns a View class with the given name
  		* @param name String
  		* @returns Ext.Base a view class.
  		*/
  var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], IBase]] = js.undefined
  /** [Method] Returns true if a reference is registered
  		* @param ref Object
  		* @returns Boolean
  		*/
  var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Method] A template method that is called when your application boots
  		* @param application Ext.app.Application
  		*/
  var init: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
  /** [Method] Adds listeners to different event sources also called event domains
  		* @param to Object Config object containing domains, selectors and listeners.
  		*/
  var listen: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String/String[]) */
  var models: js.UndefOr[js.Any] = js.undefined
  /** [Method] A template method like init but called after the viewport is created
  		* @param application Ext.app.Application
  		*/
  var onLaunch: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var refs: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String/String[]) */
  var stores: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]) */
  var views: js.UndefOr[js.Any] = js.undefined
}

object IController {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addRef: /* refs */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    application: IApplication = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    control: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getApplication: js.UndefOr[CallbackTo[IApplication]] = js.undefined,
    getController: /* id */ js.UndefOr[String] => CallbackTo[IController] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModel: /* name */ js.UndefOr[String] => CallbackTo[IModel] = null,
    getStore: /* name */ js.UndefOr[String] => CallbackTo[IStore] = null,
    getView: /* name */ js.UndefOr[String] => CallbackTo[IBase] = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hasRef: /* ref */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    init: /* application */ js.UndefOr[IApplication] => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IController] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    listen: /* to */ js.UndefOr[js.Any] => Callback = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onLaunch: /* application */ js.UndefOr[IApplication] => Callback = null,
    refs: Array = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stores: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    views: js.Any = null
  ): IController = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (addRef != null) __obj.updateDynamic("addRef")(js.Any.fromFunction1((t0: /* refs */ js.UndefOr[js.Any]) => addRef(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(js.Any.fromFunction2((t0: /* selectors */ js.UndefOr[js.Any], t1: /* listeners */ js.UndefOr[js.Any]) => control(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    getApplication.foreach(p => __obj.updateDynamic("getApplication")(p.toJsFn))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => getController(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getModel(t0).runNow()))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getStore(t0).runNow()))
    if (getView != null) __obj.updateDynamic("getView")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getView(t0).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (hasRef != null) __obj.updateDynamic("hasRef")(js.Any.fromFunction1((t0: /* ref */ js.UndefOr[js.Any]) => hasRef(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* application */ js.UndefOr[typingsJapgolly.extjs.Ext.app.IApplication]) => init(t0).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (listen != null) __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: /* to */ js.UndefOr[js.Any]) => listen(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1((t0: /* application */ js.UndefOr[typingsJapgolly.extjs.Ext.app.IApplication]) => onLaunch(t0).runNow()))
    if (refs != null) __obj.updateDynamic("refs")(refs.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IController]
  }
}

