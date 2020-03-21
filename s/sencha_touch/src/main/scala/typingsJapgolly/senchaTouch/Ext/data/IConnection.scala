package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnection extends IObservable {
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  var getAsync: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  var getAutoAbort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of defaultHeaders
  		* @returns Object
  		*/
  var getDefaultHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultPostHeader
  		* @returns String
  		*/
  var getDefaultPostHeader: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of defaultXhrHeader
  		* @returns String
  		*/
  var getDefaultXhrHeader: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disableCachingParam
  		* @returns String
  		*/
  var getDisableCachingParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  var getUseDefaultHeader: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  var parseStatus: js.UndefOr[
    js.Function2[/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest], _]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options.
  		* @param scope Object The scope to execute in.
  		* @returns Object The params for the request.
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload.
  		* @param url String The url to post to.
  		* @param params String Any extra parameters to pass.
  		* @param options Object The initial options.
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined
}

object IConnection {
  @scala.inline
  def apply(
    abort: /* request */ js.UndefOr[js.Any] => Callback = null,
    abortAll: js.UndefOr[Callback] = js.undefined,
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
    config: js.Any = null,
    defaultHeaders: js.Any = null,
    defaultXhrHeader: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disableCaching: js.UndefOr[Boolean] = js.undefined,
    disableCachingParam: String = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    extraParams: js.Any = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getAsync: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoAbort: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultHeaders: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultPostHeader: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDefaultXhrHeader: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDisableCaching: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDisableCachingParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getExtraParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMethod: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPassword: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    getUseDefaultHeader: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseDefaultXhrHeader: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUsername: js.UndefOr[CallbackTo[String]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isLoading: /* request */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    listeners: js.Any = null,
    method: String = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    parseStatus: (/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest]) => CallbackTo[js.Any] = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    request: /* options */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setAsync: /* async */ js.UndefOr[Boolean] => Callback = null,
    setAutoAbort: /* autoAbort */ js.UndefOr[Boolean] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setDefaultHeaders: /* defaultHeaders */ js.UndefOr[js.Any] => Callback = null,
    setDefaultPostHeader: /* defaultPostHeader */ js.UndefOr[String] => Callback = null,
    setDefaultXhrHeader: /* defaultXhrHeader */ js.UndefOr[String] => Callback = null,
    setDisableCaching: /* disableCaching */ js.UndefOr[Boolean] => Callback = null,
    setDisableCachingParam: /* disableCachingParam */ js.UndefOr[String] => Callback = null,
    setExtraParams: /* extraParams */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMethod: /* method */ js.UndefOr[String] => Callback = null,
    setOptions: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    setPassword: /* password */ js.UndefOr[String] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    setUseDefaultHeader: /* useDefaultHeader */ js.UndefOr[Boolean] => Callback = null,
    setUseDefaultXhrHeader: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Callback = null,
    setUsername: /* username */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    timeout: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    upload: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Callback = null,
    url: String = null,
    useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IConnection = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[js.Any]) => abort(t0).runNow()))
    abortAll.foreach(p => __obj.updateDynamic("abortAll")(p.toJsFn))
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
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders.asInstanceOf[js.Any])
    if (defaultXhrHeader != null) __obj.updateDynamic("defaultXhrHeader")(defaultXhrHeader.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching.asInstanceOf[js.Any])
    if (disableCachingParam != null) __obj.updateDynamic("disableCachingParam")(disableCachingParam.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getAsync.foreach(p => __obj.updateDynamic("getAsync")(p.toJsFn))
    getAutoAbort.foreach(p => __obj.updateDynamic("getAutoAbort")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getDefaultHeaders.foreach(p => __obj.updateDynamic("getDefaultHeaders")(p.toJsFn))
    getDefaultPostHeader.foreach(p => __obj.updateDynamic("getDefaultPostHeader")(p.toJsFn))
    getDefaultXhrHeader.foreach(p => __obj.updateDynamic("getDefaultXhrHeader")(p.toJsFn))
    getDisableCaching.foreach(p => __obj.updateDynamic("getDisableCaching")(p.toJsFn))
    getDisableCachingParam.foreach(p => __obj.updateDynamic("getDisableCachingParam")(p.toJsFn))
    getExtraParams.foreach(p => __obj.updateDynamic("getExtraParams")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getMethod.foreach(p => __obj.updateDynamic("getMethod")(p.toJsFn))
    getPassword.foreach(p => __obj.updateDynamic("getPassword")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    getUseDefaultHeader.foreach(p => __obj.updateDynamic("getUseDefaultHeader")(p.toJsFn))
    getUseDefaultXhrHeader.foreach(p => __obj.updateDynamic("getUseDefaultXhrHeader")(p.toJsFn))
    getUsername.foreach(p => __obj.updateDynamic("getUsername")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[js.Any]) => isLoading(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (parseStatus != null) __obj.updateDynamic("parseStatus")(js.Any.fromFunction2((t0: /* status */ js.UndefOr[scala.Double], t1: /* xhr */ js.UndefOr[org.scalajs.dom.raw.XMLHttpRequest]) => parseStatus(t0, t1).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => request(t0).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAsync != null) __obj.updateDynamic("setAsync")(js.Any.fromFunction1((t0: /* async */ js.UndefOr[scala.Boolean]) => setAsync(t0).runNow()))
    if (setAutoAbort != null) __obj.updateDynamic("setAutoAbort")(js.Any.fromFunction1((t0: /* autoAbort */ js.UndefOr[scala.Boolean]) => setAutoAbort(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setDefaultHeaders != null) __obj.updateDynamic("setDefaultHeaders")(js.Any.fromFunction1((t0: /* defaultHeaders */ js.UndefOr[js.Any]) => setDefaultHeaders(t0).runNow()))
    if (setDefaultPostHeader != null) __obj.updateDynamic("setDefaultPostHeader")(js.Any.fromFunction1((t0: /* defaultPostHeader */ js.UndefOr[java.lang.String]) => setDefaultPostHeader(t0).runNow()))
    if (setDefaultXhrHeader != null) __obj.updateDynamic("setDefaultXhrHeader")(js.Any.fromFunction1((t0: /* defaultXhrHeader */ js.UndefOr[java.lang.String]) => setDefaultXhrHeader(t0).runNow()))
    if (setDisableCaching != null) __obj.updateDynamic("setDisableCaching")(js.Any.fromFunction1((t0: /* disableCaching */ js.UndefOr[scala.Boolean]) => setDisableCaching(t0).runNow()))
    if (setDisableCachingParam != null) __obj.updateDynamic("setDisableCachingParam")(js.Any.fromFunction1((t0: /* disableCachingParam */ js.UndefOr[java.lang.String]) => setDisableCachingParam(t0).runNow()))
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(js.Any.fromFunction1((t0: /* extraParams */ js.UndefOr[js.Any]) => setExtraParams(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1((t0: /* method */ js.UndefOr[java.lang.String]) => setMethod(t0).runNow()))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction2((t0: /* options */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => setOptions(t0, t1).runNow()))
    if (setPassword != null) __obj.updateDynamic("setPassword")(js.Any.fromFunction1((t0: /* password */ js.UndefOr[java.lang.String]) => setPassword(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (setUseDefaultHeader != null) __obj.updateDynamic("setUseDefaultHeader")(js.Any.fromFunction1((t0: /* useDefaultHeader */ js.UndefOr[scala.Boolean]) => setUseDefaultHeader(t0).runNow()))
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(js.Any.fromFunction1((t0: /* useDefaultXhrHeader */ js.UndefOr[scala.Boolean]) => setUseDefaultXhrHeader(t0).runNow()))
    if (setUsername != null) __obj.updateDynamic("setUsername")(js.Any.fromFunction1((t0: /* username */ js.UndefOr[java.lang.String]) => setUsername(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (upload != null) __obj.updateDynamic("upload")(js.Any.fromFunction4((t0: /* form */ js.UndefOr[js.Any], t1: /* url */ js.UndefOr[java.lang.String], t2: /* params */ js.UndefOr[java.lang.String], t3: /* options */ js.UndefOr[js.Any]) => upload(t0, t1, t2, t3).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefaultXhrHeader)) __obj.updateDynamic("useDefaultXhrHeader")(useDefaultXhrHeader.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnection]
  }
}

