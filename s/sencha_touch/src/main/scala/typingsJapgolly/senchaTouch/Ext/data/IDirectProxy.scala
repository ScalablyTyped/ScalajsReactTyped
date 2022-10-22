package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectProxy
  extends StObject
     with IServer {
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @returns String The url
    */
  @JSName("buildUrl")
  var buildUrl_IDirectProxy: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("doRequest")
  var doRequest_IDirectProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of directFn
    * @returns Function/String
    */
  var getDirectFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of paramOrder
    * @returns String/String[]
    */
  var getParamOrder: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of paramsAsHash
    * @returns Boolean
    */
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the value of directFn
    * @param directFn Function/String The new value.
    */
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of paramOrder
    * @param paramOrder String/String[] The new value.
    */
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of paramsAsHash
    * @param paramsAsHash Boolean The new value.
    */
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.undefined
}
object IDirectProxy {
  
  inline def apply(): IDirectProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectProxy]
  }
  
  extension [Self <: IDirectProxy](x: Self) {
    
    inline def setBuildUrl(value: CallbackTo[String]): Self = StObject.set(x, "buildUrl", value.toJsFn)
    
    inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    inline def setDirectFn(value: Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
    
    inline def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
    
    inline def setDoRequest(
      value: (/* operation */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3((t0: /* operation */ js.UndefOr[Any], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    inline def setGetDirectFn(value: CallbackTo[Any]): Self = StObject.set(x, "getDirectFn", value.toJsFn)
    
    inline def setGetDirectFnUndefined: Self = StObject.set(x, "getDirectFn", js.undefined)
    
    inline def setGetParamOrder(value: CallbackTo[Any]): Self = StObject.set(x, "getParamOrder", value.toJsFn)
    
    inline def setGetParamOrderUndefined: Self = StObject.set(x, "getParamOrder", js.undefined)
    
    inline def setGetParamsAsHash(value: CallbackTo[Boolean]): Self = StObject.set(x, "getParamsAsHash", value.toJsFn)
    
    inline def setGetParamsAsHashUndefined: Self = StObject.set(x, "getParamsAsHash", js.undefined)
    
    inline def setParamOrder(value: Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    inline def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    inline def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    inline def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    
    inline def setSetDirectFn(value: /* directFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDirectFn", js.Any.fromFunction1((t0: /* directFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDirectFnUndefined: Self = StObject.set(x, "setDirectFn", js.undefined)
    
    inline def setSetParamOrder(value: /* paramOrder */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setParamOrder", js.Any.fromFunction1((t0: /* paramOrder */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetParamOrderUndefined: Self = StObject.set(x, "setParamOrder", js.undefined)
    
    inline def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setParamsAsHash", js.Any.fromFunction1((t0: /* paramsAsHash */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetParamsAsHashUndefined: Self = StObject.set(x, "setParamsAsHash", js.undefined)
  }
}
