package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElementLoader
  extends StObject
     with IObservable {
  
  /** [Method] Aborts the active load request */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var ajaxOptions: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Function) */
  var callback: js.UndefOr[Any] = js.undefined
  
  /** [Method] Destroys the loader  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var failure: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the target of this loader
    * @returns Ext.Component The target or null if none exists.
    */
  var getTarget: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Checks whether the loader is automatically refreshing
    * @returns Boolean True if the loader is automatically refreshing
    */
  var isAutoRefreshing: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isLoader: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Loads new data from the server
    * @param options Object The options for the request. They can be any configuration option that can be specified for the class, with the exception of the target option. Note that any options passed to the method will override any class defaults.
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean/String) */
  var loadMask: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets an Ext Element as the target of this loader
    * @param target String/HTMLElement/Ext.Element The element or its ID.
    */
  var setTarget: js.UndefOr[js.Function1[/* target */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Automatically refreshes the content over a specified period
    * @param interval Number The interval to refresh in ms.
    * @param options Object The options to pass to the load method. See load
    */
  var startAutoRefresh: js.UndefOr[
    js.Function2[/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Clears any auto refresh  */
  var stopAutoRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var success: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object IElementLoader {
  
  inline def apply(): IElementLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementLoader]
  }
  
  extension [Self <: IElementLoader](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setAjaxOptions(value: Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    inline def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    inline def setAutoLoad(value: Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setBaseParams(value: Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
    
    inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setFailure(value: Any): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setGetTarget(value: CallbackTo[IComponent]): Self = StObject.set(x, "getTarget", value.toJsFn)
    
    inline def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    inline def setIsAutoRefreshing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutoRefreshing", value.toJsFn)
    
    inline def setIsAutoRefreshingUndefined: Self = StObject.set(x, "isAutoRefreshing", js.undefined)
    
    inline def setIsLoader(value: Boolean): Self = StObject.set(x, "isLoader", value.asInstanceOf[js.Any])
    
    inline def setIsLoaderUndefined: Self = StObject.set(x, "isLoader", js.undefined)
    
    inline def setLoad(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setLoadMask(value: Any): Self = StObject.set(x, "loadMask", value.asInstanceOf[js.Any])
    
    inline def setLoadMaskUndefined: Self = StObject.set(x, "loadMask", js.undefined)
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRenderer(value: Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setSetTarget(value: /* target */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTarget", js.Any.fromFunction1((t0: /* target */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetTargetUndefined: Self = StObject.set(x, "setTarget", js.undefined)
    
    inline def setStartAutoRefresh(value: (/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "startAutoRefresh", js.Any.fromFunction2((t0: /* interval */ js.UndefOr[Double], t1: /* options */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setStartAutoRefreshUndefined: Self = StObject.set(x, "startAutoRefresh", js.undefined)
    
    inline def setStopAutoRefresh(value: Callback): Self = StObject.set(x, "stopAutoRefresh", value.toJsFn)
    
    inline def setStopAutoRefreshUndefined: Self = StObject.set(x, "stopAutoRefresh", js.undefined)
    
    inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
