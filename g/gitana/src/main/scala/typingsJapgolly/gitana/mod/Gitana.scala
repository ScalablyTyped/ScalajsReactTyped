package typingsJapgolly.gitana.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gitana extends StObject {
  
  def ajax(
    method: Any,
    url: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any
  
  def authenticate(settings: Any, authFailureHandler: Any): Any
  
  def base(): Unit
  
  def clearAuthentication(): Unit
  
  def defaultFailureCallback(http: Any): Unit
  
  def destroy(): Unit
  
  def getApplicationInfo(): Any
  
  def getAuthInfo(): Any
  
  def getFactory(): Any
  
  def getLocale(): Any
  
  def getStackInfo(): Any
  
  def gitanaDelete(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaDownload(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaGet(url: Any, params: Any, headers: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPatch(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPost(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPut(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaRequest(
    method: Any,
    url: Any,
    params: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any
  
  def gitanaUpload(url: Any, params: Any, contentType: Any, data: Any, successCallback: Any, failureCallback: Any): Any
  
  def refreshAuthentication(callback: Any): Unit
  
  def reloadAuthInfo(callback: Any): Unit
  
  def setLocale(locale: Any): Unit
}
object Gitana {
  
  inline def apply(
    ajax: (Any, Any, Any, Any, Any, Any, Any) => Any,
    authenticate: (Any, Any) => Any,
    base: Callback,
    clearAuthentication: Callback,
    defaultFailureCallback: Any => Callback,
    destroy: Callback,
    getApplicationInfo: CallbackTo[Any],
    getAuthInfo: CallbackTo[Any],
    getFactory: CallbackTo[Any],
    getLocale: CallbackTo[Any],
    getStackInfo: CallbackTo[Any],
    gitanaDelete: (Any, Any, Any, Any) => Any,
    gitanaDownload: (Any, Any, Any, Any) => Any,
    gitanaGet: (Any, Any, Any, Any, Any) => Any,
    gitanaPatch: (Any, Any, Any, Any, Any) => Any,
    gitanaPost: (Any, Any, Any, Any, Any) => Any,
    gitanaPut: (Any, Any, Any, Any, Any) => Any,
    gitanaRequest: (Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    gitanaUpload: (Any, Any, Any, Any, Any, Any) => Any,
    refreshAuthentication: Any => Callback,
    reloadAuthInfo: Any => Callback,
    setLocale: Any => Callback
  ): Gitana = {
    val __obj = js.Dynamic.literal(ajax = js.Any.fromFunction7(ajax), authenticate = js.Any.fromFunction2(authenticate), base = base.toJsFn, clearAuthentication = clearAuthentication.toJsFn, defaultFailureCallback = js.Any.fromFunction1((t0: Any) => defaultFailureCallback(t0).runNow()), destroy = destroy.toJsFn, getApplicationInfo = getApplicationInfo.toJsFn, getAuthInfo = getAuthInfo.toJsFn, getFactory = getFactory.toJsFn, getLocale = getLocale.toJsFn, getStackInfo = getStackInfo.toJsFn, gitanaDelete = js.Any.fromFunction4(gitanaDelete), gitanaDownload = js.Any.fromFunction4(gitanaDownload), gitanaGet = js.Any.fromFunction5(gitanaGet), gitanaPatch = js.Any.fromFunction5(gitanaPatch), gitanaPost = js.Any.fromFunction5(gitanaPost), gitanaPut = js.Any.fromFunction5(gitanaPut), gitanaRequest = js.Any.fromFunction8(gitanaRequest), gitanaUpload = js.Any.fromFunction6(gitanaUpload), refreshAuthentication = js.Any.fromFunction1((t0: Any) => refreshAuthentication(t0).runNow()), reloadAuthInfo = js.Any.fromFunction1((t0: Any) => reloadAuthInfo(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Any) => setLocale(t0).runNow()))
    __obj.asInstanceOf[Gitana]
  }
  
  extension [Self <: Gitana](x: Self) {
    
    inline def setAjax(value: (Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "ajax", js.Any.fromFunction7(value))
    
    inline def setAuthenticate(value: (Any, Any) => Any): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    inline def setBase(value: Callback): Self = StObject.set(x, "base", value.toJsFn)
    
    inline def setClearAuthentication(value: Callback): Self = StObject.set(x, "clearAuthentication", value.toJsFn)
    
    inline def setDefaultFailureCallback(value: Any => Callback): Self = StObject.set(x, "defaultFailureCallback", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetApplicationInfo(value: CallbackTo[Any]): Self = StObject.set(x, "getApplicationInfo", value.toJsFn)
    
    inline def setGetAuthInfo(value: CallbackTo[Any]): Self = StObject.set(x, "getAuthInfo", value.toJsFn)
    
    inline def setGetFactory(value: CallbackTo[Any]): Self = StObject.set(x, "getFactory", value.toJsFn)
    
    inline def setGetLocale(value: CallbackTo[Any]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetStackInfo(value: CallbackTo[Any]): Self = StObject.set(x, "getStackInfo", value.toJsFn)
    
    inline def setGitanaDelete(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaDelete", js.Any.fromFunction4(value))
    
    inline def setGitanaDownload(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaDownload", js.Any.fromFunction4(value))
    
    inline def setGitanaGet(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaGet", js.Any.fromFunction5(value))
    
    inline def setGitanaPatch(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPatch", js.Any.fromFunction5(value))
    
    inline def setGitanaPost(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPost", js.Any.fromFunction5(value))
    
    inline def setGitanaPut(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPut", js.Any.fromFunction5(value))
    
    inline def setGitanaRequest(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaRequest", js.Any.fromFunction8(value))
    
    inline def setGitanaUpload(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaUpload", js.Any.fromFunction6(value))
    
    inline def setRefreshAuthentication(value: Any => Callback): Self = StObject.set(x, "refreshAuthentication", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setReloadAuthInfo(value: Any => Callback): Self = StObject.set(x, "reloadAuthInfo", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLocale(value: Any => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
