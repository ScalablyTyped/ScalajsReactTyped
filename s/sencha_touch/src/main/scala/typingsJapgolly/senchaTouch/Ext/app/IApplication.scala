package typingsJapgolly.senchaTouch.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[String] = js.undefined
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.app.Profile) */
  var currentProfile: js.UndefOr[IProfile] = js.undefined
  /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
  		* @param action Ext.app.Action The action to dispatch.
  		* @param addToHistory Boolean Sets the browser's url to the action's url.
  		*/
  var dispatch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Returns the value of appFolder
  		* @returns String
  		*/
  var getAppFolder: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the Controller instance for the given controller name
  		* @param name String The name of the Controller.
  		* @param profileName String Optional profile name. If passed, this is the same as calling getController('profileName.controllerName').
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String], IController]
  ] = js.undefined
  /** [Method] Returns the value of controllers
  		* @returns Array
  		*/
  var getControllers: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of currentProfile
  		* @returns Ext.app.Profile
  		*/
  var getCurrentProfile: js.UndefOr[js.Function0[IProfile]] = js.undefined
  /** [Method] Returns the value of history
  		* @returns Ext.app.History
  		*/
  var getHistory: js.UndefOr[js.Function0[IHistory]] = js.undefined
  /** [Method] Returns the value of launch
  		* @returns Function
  		*/
  var getLaunch: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of profiles
  		* @returns Array
  		*/
  var getProfiles: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of requires
  		* @returns String[]
  		*/
  var getRequires: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of router
  		* @returns Ext.app.Router
  		*/
  var getRouter: js.UndefOr[js.Function0[IRouter]] = js.undefined
  /** [Method] Returns the value of themeVariation
  		* @returns String/Function
  		*/
  var getThemeVariation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of themeVariationPrefix
  		* @returns String
  		*/
  var getThemeVariationPrefix: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of themeVariationTransitionCls
  		* @returns String
  		*/
  var getThemeVariationTransitionCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Boolean) */
  var glossOnIcon: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.app.History) */
  var history: js.UndefOr[IHistory] = js.undefined
  /** [Config Option] (String/Object) */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var isIconPrecomposed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var phoneIcon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var phoneStartupScreen: js.UndefOr[String] = js.undefined
  /** [Config Option] (Array) */
  var profiles: js.UndefOr[Array] = js.undefined
  /** [Method] Redirects the browser to the given url
  		* @param url String/Ext.data.Model The String url to redirect to.
  		*/
  @JSName("redirectTo")
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[IRouter] = js.undefined
  /** [Method] Sets the value of appFolder
  		* @param appFolder String The new value.
  		*/
  var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of currentProfile
  		* @param currentProfile Ext.app.Profile The new value.
  		*/
  var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], Unit]] = js.undefined
  /** [Method] Sets the value of history
  		* @param history Ext.app.History The new value.
  		*/
  var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], Unit]] = js.undefined
  /** [Method] Sets the value of launch
  		* @param launch Function The new value.
  		*/
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of profiles
  		* @param profiles Array The new value.
  		*/
  var setProfiles: js.UndefOr[js.Function1[/* profiles */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of requires
  		* @param requires String[] The new value.
  		*/
  var setRequires: js.UndefOr[js.Function1[/* requires */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of router
  		* @param router Ext.app.Router The new value.
  		*/
  var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[IRouter], Unit]] = js.undefined
  /** [Method] Sets the value of themeVariation
  		* @param themeVariation String/Function The new value.
  		*/
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of themeVariationPrefix
  		* @param themeVariationPrefix String The new value.
  		*/
  var setThemeVariationPrefix: js.UndefOr[js.Function1[/* themeVariationPrefix */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of themeVariationTransitionCls
  		* @param themeVariationTransitionCls String The new value.
  		*/
  var setThemeVariationTransitionCls: js.UndefOr[js.Function1[/* themeVariationTransitionCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var startupImage: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var statusBarStyle: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var tabletIcon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var tabletStartupScreen: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Function) */
  var themeVariation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var themeVariationPrefix: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var themeVariationTransitionCls: js.UndefOr[String] = js.undefined
}

object IApplication {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appFolder: String = null,
    application: IApplication = null,
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    control: js.Any = null,
    controllers: Array = null,
    currentProfile: IProfile = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dispatch: (/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean]) => Callback = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getAppFolder: js.UndefOr[CallbackTo[String]] = js.undefined,
    getApplication: js.UndefOr[CallbackTo[IApplication]] = js.undefined,
    getBefore: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getControl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getController: (/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String]) => CallbackTo[IController] = null,
    getControllers: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getCurrentProfile: js.UndefOr[CallbackTo[IProfile]] = js.undefined,
    getHistory: js.UndefOr[CallbackTo[IHistory]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLaunch: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModel: /* modelName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModels: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getProfiles: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRefs: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRequires: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRouter: js.UndefOr[CallbackTo[IRouter]] = js.undefined,
    getRoutes: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStores: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getThemeVariation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getThemeVariationPrefix: js.UndefOr[CallbackTo[String]] = js.undefined,
    getThemeVariationTransitionCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getViews: js.UndefOr[CallbackTo[Array]] = js.undefined,
    glossOnIcon: js.UndefOr[Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    history: IHistory = null,
    icon: js.Any = null,
    inheritableStatics: js.Any = null,
    init: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isIconPrecomposed: js.UndefOr[Boolean] = js.undefined,
    launch: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: Array = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    name: String = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    phoneIcon: String = null,
    phoneStartupScreen: String = null,
    platformConfig: js.Any = null,
    profiles: Array = null,
    redirectTo: /* url */ js.UndefOr[js.Any] => Callback = null,
    refs: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    router: IRouter = null,
    routes: js.Any = null,
    self: IClass = null,
    setAppFolder: /* appFolder */ js.UndefOr[String] => Callback = null,
    setApplication: /* application */ js.UndefOr[IApplication] => Callback = null,
    setBefore: /* before */ js.UndefOr[js.Any] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setControl: /* control */ js.UndefOr[js.Any] => Callback = null,
    setControllers: /* controllers */ js.UndefOr[Array] => Callback = null,
    setCurrentProfile: /* currentProfile */ js.UndefOr[IProfile] => Callback = null,
    setHistory: /* history */ js.UndefOr[IHistory] => Callback = null,
    setLaunch: /* launch */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setModels: /* models */ js.UndefOr[Array] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setProfiles: /* profiles */ js.UndefOr[Array] => Callback = null,
    setRefs: /* refs */ js.UndefOr[js.Any] => Callback = null,
    setRequires: /* requires */ js.UndefOr[Array] => Callback = null,
    setRouter: /* router */ js.UndefOr[IRouter] => Callback = null,
    setRoutes: /* routes */ js.UndefOr[js.Any] => Callback = null,
    setStores: /* stores */ js.UndefOr[Array] => Callback = null,
    setThemeVariation: /* themeVariation */ js.UndefOr[js.Any] => Callback = null,
    setThemeVariationPrefix: /* themeVariationPrefix */ js.UndefOr[String] => Callback = null,
    setThemeVariationTransitionCls: /* themeVariationTransitionCls */ js.UndefOr[String] => Callback = null,
    setViews: /* views */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startupImage: js.Any = null,
    statics: js.Any = null,
    statusBarStyle: String = null,
    stores: Array = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    tabletIcon: String = null,
    tabletStartupScreen: String = null,
    themeVariation: js.Any = null,
    themeVariationPrefix: String = null,
    themeVariationTransitionCls: String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    views: Array = null
  ): IApplication = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appFolder != null) __obj.updateDynamic("appFolder")(appFolder.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (controllers != null) __obj.updateDynamic("controllers")(controllers.asInstanceOf[js.Any])
    if (currentProfile != null) __obj.updateDynamic("currentProfile")(currentProfile.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IAction], t1: /* addToHistory */ js.UndefOr[scala.Boolean]) => dispatch(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getAppFolder.foreach(p => __obj.updateDynamic("getAppFolder")(p.toJsFn))
    getApplication.foreach(p => __obj.updateDynamic("getApplication")(p.toJsFn))
    getBefore.foreach(p => __obj.updateDynamic("getBefore")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getControl.foreach(p => __obj.updateDynamic("getControl")(p.toJsFn))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* profileName */ js.UndefOr[java.lang.String]) => getController(t0, t1).runNow()))
    getControllers.foreach(p => __obj.updateDynamic("getControllers")(p.toJsFn))
    getCurrentProfile.foreach(p => __obj.updateDynamic("getCurrentProfile")(p.toJsFn))
    getHistory.foreach(p => __obj.updateDynamic("getHistory")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLaunch.foreach(p => __obj.updateDynamic("getLaunch")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction1((t0: /* modelName */ js.UndefOr[java.lang.String]) => getModel(t0).runNow()))
    getModels.foreach(p => __obj.updateDynamic("getModels")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getProfiles.foreach(p => __obj.updateDynamic("getProfiles")(p.toJsFn))
    getRefs.foreach(p => __obj.updateDynamic("getRefs")(p.toJsFn))
    getRequires.foreach(p => __obj.updateDynamic("getRequires")(p.toJsFn))
    getRouter.foreach(p => __obj.updateDynamic("getRouter")(p.toJsFn))
    getRoutes.foreach(p => __obj.updateDynamic("getRoutes")(p.toJsFn))
    getStores.foreach(p => __obj.updateDynamic("getStores")(p.toJsFn))
    getThemeVariation.foreach(p => __obj.updateDynamic("getThemeVariation")(p.toJsFn))
    getThemeVariationPrefix.foreach(p => __obj.updateDynamic("getThemeVariationPrefix")(p.toJsFn))
    getThemeVariationTransitionCls.foreach(p => __obj.updateDynamic("getThemeVariationTransitionCls")(p.toJsFn))
    getViews.foreach(p => __obj.updateDynamic("getViews")(p.toJsFn))
    if (!js.isUndefined(glossOnIcon)) __obj.updateDynamic("glossOnIcon")(glossOnIcon.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isIconPrecomposed)) __obj.updateDynamic("isIconPrecomposed")(isIconPrecomposed.asInstanceOf[js.Any])
    if (launch != null) __obj.updateDynamic("launch")(launch.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (phoneIcon != null) __obj.updateDynamic("phoneIcon")(phoneIcon.asInstanceOf[js.Any])
    if (phoneStartupScreen != null) __obj.updateDynamic("phoneStartupScreen")(phoneStartupScreen.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[js.Any]) => redirectTo(t0).runNow()))
    if (refs != null) __obj.updateDynamic("refs")(refs.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAppFolder != null) __obj.updateDynamic("setAppFolder")(js.Any.fromFunction1((t0: /* appFolder */ js.UndefOr[java.lang.String]) => setAppFolder(t0).runNow()))
    if (setApplication != null) __obj.updateDynamic("setApplication")(js.Any.fromFunction1((t0: /* application */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IApplication]) => setApplication(t0).runNow()))
    if (setBefore != null) __obj.updateDynamic("setBefore")(js.Any.fromFunction1((t0: /* before */ js.UndefOr[js.Any]) => setBefore(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setControl != null) __obj.updateDynamic("setControl")(js.Any.fromFunction1((t0: /* control */ js.UndefOr[js.Any]) => setControl(t0).runNow()))
    if (setControllers != null) __obj.updateDynamic("setControllers")(js.Any.fromFunction1((t0: /* controllers */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setControllers(t0).runNow()))
    if (setCurrentProfile != null) __obj.updateDynamic("setCurrentProfile")(js.Any.fromFunction1((t0: /* currentProfile */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IProfile]) => setCurrentProfile(t0).runNow()))
    if (setHistory != null) __obj.updateDynamic("setHistory")(js.Any.fromFunction1((t0: /* history */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IHistory]) => setHistory(t0).runNow()))
    if (setLaunch != null) __obj.updateDynamic("setLaunch")(js.Any.fromFunction1((t0: /* launch */ js.UndefOr[js.Any]) => setLaunch(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setModels != null) __obj.updateDynamic("setModels")(js.Any.fromFunction1((t0: /* models */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setModels(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setProfiles != null) __obj.updateDynamic("setProfiles")(js.Any.fromFunction1((t0: /* profiles */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setProfiles(t0).runNow()))
    if (setRefs != null) __obj.updateDynamic("setRefs")(js.Any.fromFunction1((t0: /* refs */ js.UndefOr[js.Any]) => setRefs(t0).runNow()))
    if (setRequires != null) __obj.updateDynamic("setRequires")(js.Any.fromFunction1((t0: /* requires */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setRequires(t0).runNow()))
    if (setRouter != null) __obj.updateDynamic("setRouter")(js.Any.fromFunction1((t0: /* router */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IRouter]) => setRouter(t0).runNow()))
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(js.Any.fromFunction1((t0: /* routes */ js.UndefOr[js.Any]) => setRoutes(t0).runNow()))
    if (setStores != null) __obj.updateDynamic("setStores")(js.Any.fromFunction1((t0: /* stores */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setStores(t0).runNow()))
    if (setThemeVariation != null) __obj.updateDynamic("setThemeVariation")(js.Any.fromFunction1((t0: /* themeVariation */ js.UndefOr[js.Any]) => setThemeVariation(t0).runNow()))
    if (setThemeVariationPrefix != null) __obj.updateDynamic("setThemeVariationPrefix")(js.Any.fromFunction1((t0: /* themeVariationPrefix */ js.UndefOr[java.lang.String]) => setThemeVariationPrefix(t0).runNow()))
    if (setThemeVariationTransitionCls != null) __obj.updateDynamic("setThemeVariationTransitionCls")(js.Any.fromFunction1((t0: /* themeVariationTransitionCls */ js.UndefOr[java.lang.String]) => setThemeVariationTransitionCls(t0).runNow()))
    if (setViews != null) __obj.updateDynamic("setViews")(js.Any.fromFunction1((t0: /* views */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setViews(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (startupImage != null) __obj.updateDynamic("startupImage")(startupImage.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (statusBarStyle != null) __obj.updateDynamic("statusBarStyle")(statusBarStyle.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (tabletIcon != null) __obj.updateDynamic("tabletIcon")(tabletIcon.asInstanceOf[js.Any])
    if (tabletStartupScreen != null) __obj.updateDynamic("tabletStartupScreen")(tabletStartupScreen.asInstanceOf[js.Any])
    if (themeVariation != null) __obj.updateDynamic("themeVariation")(themeVariation.asInstanceOf[js.Any])
    if (themeVariationPrefix != null) __obj.updateDynamic("themeVariationPrefix")(themeVariationPrefix.asInstanceOf[js.Any])
    if (themeVariationTransitionCls != null) __obj.updateDynamic("themeVariationTransitionCls")(themeVariationTransitionCls.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplication]
  }
}

