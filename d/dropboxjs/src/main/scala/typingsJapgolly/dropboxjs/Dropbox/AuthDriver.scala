package typingsJapgolly.dropboxjs.Dropbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthDriver extends StObject {
  
  def authType(): String
  
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit
  
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
  
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  
  def url(): String
}
object AuthDriver {
  
  inline def apply(
    authType: CallbackTo[String],
    doAuthorize: (String, String, Client, QueryParamsCallback) => Callback,
    getStateParam: (Client, js.Function1[/* state */ String, Unit]) => Callback,
    onAuthStepChange: (Client, js.Function0[Unit]) => Callback,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Callback,
    url: CallbackTo[String]
  ): AuthDriver = {
    val __obj = js.Dynamic.literal(authType = authType.toJsFn, doAuthorize = js.Any.fromFunction4((t0: String, t1: String, t2: Client, t3: QueryParamsCallback) => (doAuthorize(t0, t1, t2, t3)).runNow()), getStateParam = js.Any.fromFunction2((t0: Client, t1: js.Function1[/* state */ String, Unit]) => (getStateParam(t0, t1)).runNow()), onAuthStepChange = js.Any.fromFunction2((t0: Client, t1: js.Function0[Unit]) => (onAuthStepChange(t0, t1)).runNow()), resumeAuthorize = js.Any.fromFunction3((t0: String, t1: Client, t2: QueryParamsCallback) => (resumeAuthorize(t0, t1, t2)).runNow()), url = url.toJsFn)
    __obj.asInstanceOf[AuthDriver]
  }
  
  extension [Self <: AuthDriver](x: Self) {
    
    inline def setAuthType(value: CallbackTo[String]): Self = StObject.set(x, "authType", value.toJsFn)
    
    inline def setDoAuthorize(value: (String, String, Client, QueryParamsCallback) => Callback): Self = StObject.set(x, "doAuthorize", js.Any.fromFunction4((t0: String, t1: String, t2: Client, t3: QueryParamsCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetStateParam(value: (Client, js.Function1[/* state */ String, Unit]) => Callback): Self = StObject.set(x, "getStateParam", js.Any.fromFunction2((t0: Client, t1: js.Function1[/* state */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onAuthStepChange", js.Any.fromFunction2((t0: Client, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Callback): Self = StObject.set(x, "resumeAuthorize", js.Any.fromFunction3((t0: String, t1: Client, t2: QueryParamsCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUrl(value: CallbackTo[String]): Self = StObject.set(x, "url", value.toJsFn)
  }
  
  trait BrowserBase extends StObject {
    
    def authType(): String
    
    def locationStateParam(url: String): String
    
    def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
  }
  object BrowserBase {
    
    inline def apply(
      authType: CallbackTo[String],
      locationStateParam: String => String,
      onAuthStepChange: (Client, js.Function0[Unit]) => Callback
    ): BrowserBase = {
      val __obj = js.Dynamic.literal(authType = authType.toJsFn, locationStateParam = js.Any.fromFunction1(locationStateParam), onAuthStepChange = js.Any.fromFunction2((t0: Client, t1: js.Function0[Unit]) => (onAuthStepChange(t0, t1)).runNow()))
      __obj.asInstanceOf[BrowserBase]
    }
    
    extension [Self <: BrowserBase](x: Self) {
      
      inline def setAuthType(value: CallbackTo[String]): Self = StObject.set(x, "authType", value.toJsFn)
      
      inline def setLocationStateParam(value: String => String): Self = StObject.set(x, "locationStateParam", js.Any.fromFunction1(value))
      
      inline def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onAuthStepChange", js.Any.fromFunction2((t0: Client, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  type ChromeApp = IAuthDriver
  
  type ChromeExtension = IAuthDriver
  
  @js.native
  trait Cordova
    extends StObject
       with IAuthDriver {
    
    def url(): String = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @js.native
  trait IAuthDriver extends StObject {
    
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
    def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  }
  
  @js.native
  trait NodeServer
    extends StObject
       with IAuthDriver {
    
    def authType(): String = js.native
    
    def closeBrowser(response: Any): Unit = js.native
    
    def closeServer(): Unit = js.native
    
    def createApp(): Unit = js.native
    
    // TODO check request response types
    def doRequest(request: Any, response: Any): Unit = js.native
    
    def openBrowser(url: String): Unit = js.native
    
    def url(): String = js.native
  }
  
  @js.native
  trait Popup
    extends StObject
       with IAuthDriver {
    
    def url(): String = js.native
  }
  
  trait Redirect extends StObject {
    
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit
    
    def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
    
    def url(): String
  }
  object Redirect {
    
    inline def apply(
      doAuthorize: (String, String, Client) => Callback,
      resumeAuthorize: (String, Client, QueryParamsCallback) => Callback,
      url: CallbackTo[String]
    ): Redirect = {
      val __obj = js.Dynamic.literal(doAuthorize = js.Any.fromFunction3((t0: String, t1: String, t2: Client) => (doAuthorize(t0, t1, t2)).runNow()), resumeAuthorize = js.Any.fromFunction3((t0: String, t1: Client, t2: QueryParamsCallback) => (resumeAuthorize(t0, t1, t2)).runNow()), url = url.toJsFn)
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setDoAuthorize(value: (String, String, Client) => Callback): Self = StObject.set(x, "doAuthorize", js.Any.fromFunction3((t0: String, t1: String, t2: Client) => (value(t0, t1, t2)).runNow()))
      
      inline def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Callback): Self = StObject.set(x, "resumeAuthorize", js.Any.fromFunction3((t0: String, t1: Client, t2: QueryParamsCallback) => (value(t0, t1, t2)).runNow()))
      
      inline def setUrl(value: CallbackTo[String]): Self = StObject.set(x, "url", value.toJsFn)
    }
  }
}
