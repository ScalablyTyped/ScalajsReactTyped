package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequest extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callback
  		* @returns Object
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directFn
  		* @returns Object
  		*/
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of headers
  		* @returns Object
  		*/
  var getHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of jsonData
  		* @returns Object
  		*/
  var getJsonData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of operation
  		* @returns Ext.data.Operation
  		*/
  var getOperation: js.UndefOr[js.Function0[IOperation]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy]] = js.undefined
  /** [Method] Returns the value of records
  		* @returns Object
  		*/
  var getRecords: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Object
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of xmlData
  		* @returns Object
  		*/
  var getXmlData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.JsonP) */
  var jsonp: js.UndefOr[IJsonP] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.Operation) */
  var operation: js.UndefOr[IOperation] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directFn
  		* @param directFn Object The new value.
  		*/
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of headers
  		* @param headers Object The new value.
  		*/
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of jsonData
  		* @param jsonData Object The new value.
  		*/
  var setJsonData: js.UndefOr[js.Function1[/* jsonData */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of operation
  		* @param operation Ext.data.Operation The new value.
  		*/
  var setOperation: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy Ext.data.proxy.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy], Unit]
  ] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Object The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Object The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of xmlData
  		* @param xmlData Object The new value.
  		*/
  var setXmlData: js.UndefOr[js.Function1[/* xmlData */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.undefined
}

object IRequest {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callbackKey: String = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disableCaching: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    getAction: js.UndefOr[CallbackTo[String]] = js.undefined,
    getArgs: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCallback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCallbackKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDirectFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDisableCaching: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getHeaders: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getJsonData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMethod: js.UndefOr[CallbackTo[String]] = js.undefined,
    getOperation: js.UndefOr[CallbackTo[IOperation]] = js.undefined,
    getParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPassword: js.UndefOr[CallbackTo[String]] = js.undefined,
    getProxy: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy]] = js.undefined,
    getRecords: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    getUseDefaultXhrHeader: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUsername: js.UndefOr[CallbackTo[String]] = js.undefined,
    getWithCredentials: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getXmlData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    headers: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    jsonData: js.Any = null,
    jsonp: IJsonP = null,
    method: String = null,
    mixins: js.Any = null,
    operation: IOperation = null,
    params: js.Any = null,
    password: String = null,
    platformConfig: js.Any = null,
    proxy: typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Callback = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Callback = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Callback = null,
    setCallbackKey: /* callbackKey */ js.UndefOr[String] => Callback = null,
    setDirectFn: /* directFn */ js.UndefOr[js.Any] => Callback = null,
    setDisableCaching: /* disableCaching */ js.UndefOr[Boolean] => Callback = null,
    setHeaders: /* headers */ js.UndefOr[js.Any] => Callback = null,
    setJsonData: /* jsonData */ js.UndefOr[js.Any] => Callback = null,
    setMethod: /* method */ js.UndefOr[String] => Callback = null,
    setOperation: /* operation */ js.UndefOr[IOperation] => Callback = null,
    setParams: /* params */ js.UndefOr[js.Any] => Callback = null,
    setPassword: /* password */ js.UndefOr[String] => Callback = null,
    setProxy: /* proxy */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy] => Callback = null,
    setRecords: /* records */ js.UndefOr[js.Any] => Callback = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    setUseDefaultXhrHeader: /* useDefaultXhrHeader */ js.UndefOr[js.Any] => Callback = null,
    setUsername: /* username */ js.UndefOr[String] => Callback = null,
    setWithCredentials: /* withCredentials */ js.UndefOr[Boolean] => Callback = null,
    setXmlData: /* xmlData */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: String = null,
    username: String = null,
    uses: Array = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xmlData: js.Any = null
  ): IRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAction.foreach(p => __obj.updateDynamic("getAction")(p.toJsFn))
    getArgs.foreach(p => __obj.updateDynamic("getArgs")(p.toJsFn))
    getCallback.foreach(p => __obj.updateDynamic("getCallback")(p.toJsFn))
    getCallbackKey.foreach(p => __obj.updateDynamic("getCallbackKey")(p.toJsFn))
    getDirectFn.foreach(p => __obj.updateDynamic("getDirectFn")(p.toJsFn))
    getDisableCaching.foreach(p => __obj.updateDynamic("getDisableCaching")(p.toJsFn))
    getHeaders.foreach(p => __obj.updateDynamic("getHeaders")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getJsonData.foreach(p => __obj.updateDynamic("getJsonData")(p.toJsFn))
    getMethod.foreach(p => __obj.updateDynamic("getMethod")(p.toJsFn))
    getOperation.foreach(p => __obj.updateDynamic("getOperation")(p.toJsFn))
    getParams.foreach(p => __obj.updateDynamic("getParams")(p.toJsFn))
    getPassword.foreach(p => __obj.updateDynamic("getPassword")(p.toJsFn))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    getRecords.foreach(p => __obj.updateDynamic("getRecords")(p.toJsFn))
    getScope.foreach(p => __obj.updateDynamic("getScope")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    getUseDefaultXhrHeader.foreach(p => __obj.updateDynamic("getUseDefaultXhrHeader")(p.toJsFn))
    getUsername.foreach(p => __obj.updateDynamic("getUsername")(p.toJsFn))
    getWithCredentials.foreach(p => __obj.updateDynamic("getWithCredentials")(p.toJsFn))
    getXmlData.foreach(p => __obj.updateDynamic("getXmlData")(p.toJsFn))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (jsonData != null) __obj.updateDynamic("jsonData")(jsonData.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: /* action */ js.UndefOr[java.lang.String]) => setAction(t0).runNow()))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => setArgs(t0).runNow()))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Any]) => setCallback(t0).runNow()))
    if (setCallbackKey != null) __obj.updateDynamic("setCallbackKey")(js.Any.fromFunction1((t0: /* callbackKey */ js.UndefOr[java.lang.String]) => setCallbackKey(t0).runNow()))
    if (setDirectFn != null) __obj.updateDynamic("setDirectFn")(js.Any.fromFunction1((t0: /* directFn */ js.UndefOr[js.Any]) => setDirectFn(t0).runNow()))
    if (setDisableCaching != null) __obj.updateDynamic("setDisableCaching")(js.Any.fromFunction1((t0: /* disableCaching */ js.UndefOr[scala.Boolean]) => setDisableCaching(t0).runNow()))
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction1((t0: /* headers */ js.UndefOr[js.Any]) => setHeaders(t0).runNow()))
    if (setJsonData != null) __obj.updateDynamic("setJsonData")(js.Any.fromFunction1((t0: /* jsonData */ js.UndefOr[js.Any]) => setJsonData(t0).runNow()))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1((t0: /* method */ js.UndefOr[java.lang.String]) => setMethod(t0).runNow()))
    if (setOperation != null) __obj.updateDynamic("setOperation")(js.Any.fromFunction1((t0: /* operation */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IOperation]) => setOperation(t0).runNow()))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => setParams(t0).runNow()))
    if (setPassword != null) __obj.updateDynamic("setPassword")(js.Any.fromFunction1((t0: /* password */ js.UndefOr[java.lang.String]) => setPassword(t0).runNow()))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy]) => setProxy(t0).runNow()))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1((t0: /* records */ js.UndefOr[js.Any]) => setRecords(t0).runNow()))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1((t0: /* scope */ js.UndefOr[js.Any]) => setScope(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(js.Any.fromFunction1((t0: /* useDefaultXhrHeader */ js.UndefOr[js.Any]) => setUseDefaultXhrHeader(t0).runNow()))
    if (setUsername != null) __obj.updateDynamic("setUsername")(js.Any.fromFunction1((t0: /* username */ js.UndefOr[java.lang.String]) => setUsername(t0).runNow()))
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(js.Any.fromFunction1((t0: /* withCredentials */ js.UndefOr[scala.Boolean]) => setWithCredentials(t0).runNow()))
    if (setXmlData != null) __obj.updateDynamic("setXmlData")(js.Any.fromFunction1((t0: /* xmlData */ js.UndefOr[js.Any]) => setXmlData(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xmlData != null) __obj.updateDynamic("xmlData")(xmlData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequest]
  }
}

