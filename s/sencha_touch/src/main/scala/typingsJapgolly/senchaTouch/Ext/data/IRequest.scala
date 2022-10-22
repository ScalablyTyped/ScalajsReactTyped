package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRequest
  extends StObject
     with IBase {
  
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
  var getArgs: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of callback
    * @returns Object
    */
  var getCallback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of callbackKey
    * @returns String
    */
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of directFn
    * @returns Object
    */
  var getDirectFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of headers
    * @returns Object
    */
  var getHeaders: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of jsonData
    * @returns Object
    */
  var getJsonData: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getParams: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getRecords: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getXmlData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var jsonData: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.data.JsonP) */
  var jsonp: js.UndefOr[IJsonP] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.data.Operation) */
  var operation: js.UndefOr[IOperation] = js.undefined
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[Any] = js.undefined
  
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
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of callback
    * @param callback Object The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of callbackKey
    * @param callbackKey String The new value.
    */
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of directFn
    * @param directFn Object The new value.
    */
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of headers
    * @param headers Object The new value.
    */
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of jsonData
    * @param jsonData Object The new value.
    */
  var setJsonData: js.UndefOr[js.Function1[/* jsonData */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setXmlData: js.UndefOr[js.Function1[/* xmlData */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var xmlData: js.UndefOr[Any] = js.undefined
}
object IRequest {
  
  inline def apply(): IRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequest]
  }
  
  extension [Self <: IRequest](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
    
    inline def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
    
    inline def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
    
    inline def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
    
    inline def setGetAction(value: CallbackTo[String]): Self = StObject.set(x, "getAction", value.toJsFn)
    
    inline def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
    
    inline def setGetArgs(value: CallbackTo[Any]): Self = StObject.set(x, "getArgs", value.toJsFn)
    
    inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
    
    inline def setGetCallback(value: CallbackTo[Any]): Self = StObject.set(x, "getCallback", value.toJsFn)
    
    inline def setGetCallbackKey(value: CallbackTo[String]): Self = StObject.set(x, "getCallbackKey", value.toJsFn)
    
    inline def setGetCallbackKeyUndefined: Self = StObject.set(x, "getCallbackKey", js.undefined)
    
    inline def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
    
    inline def setGetDirectFn(value: CallbackTo[Any]): Self = StObject.set(x, "getDirectFn", value.toJsFn)
    
    inline def setGetDirectFnUndefined: Self = StObject.set(x, "getDirectFn", js.undefined)
    
    inline def setGetDisableCaching(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDisableCaching", value.toJsFn)
    
    inline def setGetDisableCachingUndefined: Self = StObject.set(x, "getDisableCaching", js.undefined)
    
    inline def setGetHeaders(value: CallbackTo[Any]): Self = StObject.set(x, "getHeaders", value.toJsFn)
    
    inline def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
    
    inline def setGetJsonData(value: CallbackTo[Any]): Self = StObject.set(x, "getJsonData", value.toJsFn)
    
    inline def setGetJsonDataUndefined: Self = StObject.set(x, "getJsonData", js.undefined)
    
    inline def setGetMethod(value: CallbackTo[String]): Self = StObject.set(x, "getMethod", value.toJsFn)
    
    inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    inline def setGetOperation(value: CallbackTo[IOperation]): Self = StObject.set(x, "getOperation", value.toJsFn)
    
    inline def setGetOperationUndefined: Self = StObject.set(x, "getOperation", js.undefined)
    
    inline def setGetParams(value: CallbackTo[Any]): Self = StObject.set(x, "getParams", value.toJsFn)
    
    inline def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
    
    inline def setGetPassword(value: CallbackTo[String]): Self = StObject.set(x, "getPassword", value.toJsFn)
    
    inline def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
    
    inline def setGetProxy(value: CallbackTo[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy]): Self = StObject.set(x, "getProxy", value.toJsFn)
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setGetRecords(value: CallbackTo[Any]): Self = StObject.set(x, "getRecords", value.toJsFn)
    
    inline def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    inline def setGetScope(value: CallbackTo[Any]): Self = StObject.set(x, "getScope", value.toJsFn)
    
    inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    inline def setGetTimeout(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeout", value.toJsFn)
    
    inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setGetUseDefaultXhrHeader(value: CallbackTo[Any]): Self = StObject.set(x, "getUseDefaultXhrHeader", value.toJsFn)
    
    inline def setGetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "getUseDefaultXhrHeader", js.undefined)
    
    inline def setGetUsername(value: CallbackTo[String]): Self = StObject.set(x, "getUsername", value.toJsFn)
    
    inline def setGetUsernameUndefined: Self = StObject.set(x, "getUsername", js.undefined)
    
    inline def setGetWithCredentials(value: CallbackTo[Boolean]): Self = StObject.set(x, "getWithCredentials", value.toJsFn)
    
    inline def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
    
    inline def setGetXmlData(value: CallbackTo[Any]): Self = StObject.set(x, "getXmlData", value.toJsFn)
    
    inline def setGetXmlDataUndefined: Self = StObject.set(x, "getXmlData", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJsonData(value: Any): Self = StObject.set(x, "jsonData", value.asInstanceOf[js.Any])
    
    inline def setJsonDataUndefined: Self = StObject.set(x, "jsonData", js.undefined)
    
    inline def setJsonp(value: IJsonP): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOperation(value: IOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProxy(value: typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSetAction(value: /* action */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAction", js.Any.fromFunction1((t0: /* action */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
    
    inline def setSetArgs(value: /* args */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setArgs", js.Any.fromFunction1((t0: /* args */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
    
    inline def setSetCallback(value: /* callback */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setCallback", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setCallbackKey", js.Any.fromFunction1((t0: /* callbackKey */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetCallbackKeyUndefined: Self = StObject.set(x, "setCallbackKey", js.undefined)
    
    inline def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
    
    inline def setSetDirectFn(value: /* directFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDirectFn", js.Any.fromFunction1((t0: /* directFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDirectFnUndefined: Self = StObject.set(x, "setDirectFn", js.undefined)
    
    inline def setSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDisableCaching", js.Any.fromFunction1((t0: /* disableCaching */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetDisableCachingUndefined: Self = StObject.set(x, "setDisableCaching", js.undefined)
    
    inline def setSetHeaders(value: /* headers */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1((t0: /* headers */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    inline def setSetJsonData(value: /* jsonData */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setJsonData", js.Any.fromFunction1((t0: /* jsonData */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetJsonDataUndefined: Self = StObject.set(x, "setJsonData", js.undefined)
    
    inline def setSetMethod(value: /* method */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setMethod", js.Any.fromFunction1((t0: /* method */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetMethodUndefined: Self = StObject.set(x, "setMethod", js.undefined)
    
    inline def setSetOperation(value: /* operation */ js.UndefOr[IOperation] => Callback): Self = StObject.set(x, "setOperation", js.Any.fromFunction1((t0: /* operation */ js.UndefOr[IOperation]) => value(t0).runNow()))
    
    inline def setSetOperationUndefined: Self = StObject.set(x, "setOperation", js.undefined)
    
    inline def setSetParams(value: /* params */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setParams", js.Any.fromFunction1((t0: /* params */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    inline def setSetPassword(value: /* password */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPassword", js.Any.fromFunction1((t0: /* password */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy] => Callback): Self = StObject.set(x, "setProxy", js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy]) => value(t0).runNow()))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setSetRecords(value: /* records */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setRecords", js.Any.fromFunction1((t0: /* records */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScope", js.Any.fromFunction1((t0: /* scope */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setUrl", js.Any.fromFunction1((t0: /* url */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1((t0: /* useDefaultXhrHeader */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "setUseDefaultXhrHeader", js.undefined)
    
    inline def setSetUsername(value: /* username */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setUsername", js.Any.fromFunction1((t0: /* username */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetUsernameUndefined: Self = StObject.set(x, "setUsername", js.undefined)
    
    inline def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1((t0: /* withCredentials */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
    
    inline def setSetXmlData(value: /* xmlData */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setXmlData", js.Any.fromFunction1((t0: /* xmlData */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetXmlDataUndefined: Self = StObject.set(x, "setXmlData", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    inline def setXmlData(value: Any): Self = StObject.set(x, "xmlData", value.asInstanceOf[js.Any])
    
    inline def setXmlDataUndefined: Self = StObject.set(x, "xmlData", js.undefined)
  }
}
