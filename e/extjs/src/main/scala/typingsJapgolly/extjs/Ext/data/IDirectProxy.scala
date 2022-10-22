package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectProxy
  extends StObject
     with IServer {
  
  /** [Method] inherit docs
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
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
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
    
    inline def setParamOrder(value: Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    inline def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    inline def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    inline def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
  }
}
