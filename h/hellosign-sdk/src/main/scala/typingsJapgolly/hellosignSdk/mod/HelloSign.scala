package typingsJapgolly.hellosignSdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelloSign extends StObject {
  
  def _setApiField(key: String, value: Any): Unit
  
  var account: AccountModule
  
  var apiApp: ApiAppModule
  
  var embedded: EmbeddedModule
  
  def getApiField(key: String): Any
  
  def isDev(): Boolean
  
  var oauth: OAuthModule
  
  var reports: ReportsModule
  
  def setApiKey(key: String): Unit
  
  def setClientId(clientId: String): Unit
  
  def setClientSecret(clientSecret: String): Unit
  
  def setHost(host: String, port: String, protocol: String): Unit
  
  def setOauthToken(oauthToken: String): Unit
  
  def setPort(port: String): Unit
  
  def setProtocol(protocol: String): Unit
  
  def setTimeout(timeout: Double): Unit
  
  def setUserPassAuth(username: String, password: String): Unit
  
  var signatureRequest: SignatureRequestModule
  
  var team: TeamModule
  
  var template: TemplateModule
  
  var unclaimedDraft: UnclaimedDraftModule
}
object HelloSign {
  
  inline def apply(
    _setApiField: (String, Any) => Callback,
    account: AccountModule,
    apiApp: ApiAppModule,
    embedded: EmbeddedModule,
    getApiField: String => Any,
    isDev: CallbackTo[Boolean],
    oauth: OAuthModule,
    reports: ReportsModule,
    setApiKey: String => Callback,
    setClientId: String => Callback,
    setClientSecret: String => Callback,
    setHost: (String, String, String) => Callback,
    setOauthToken: String => Callback,
    setPort: String => Callback,
    setProtocol: String => Callback,
    setTimeout: Double => Callback,
    setUserPassAuth: (String, String) => Callback,
    signatureRequest: SignatureRequestModule,
    team: TeamModule,
    template: TemplateModule,
    unclaimedDraft: UnclaimedDraftModule
  ): HelloSign = {
    val __obj = js.Dynamic.literal(_setApiField = js.Any.fromFunction2((t0: String, t1: Any) => (_setApiField(t0, t1)).runNow()), account = account.asInstanceOf[js.Any], apiApp = apiApp.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], getApiField = js.Any.fromFunction1(getApiField), isDev = isDev.toJsFn, oauth = oauth.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], setApiKey = js.Any.fromFunction1((t0: String) => setApiKey(t0).runNow()), setClientId = js.Any.fromFunction1((t0: String) => setClientId(t0).runNow()), setClientSecret = js.Any.fromFunction1((t0: String) => setClientSecret(t0).runNow()), setHost = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (setHost(t0, t1, t2)).runNow()), setOauthToken = js.Any.fromFunction1((t0: String) => setOauthToken(t0).runNow()), setPort = js.Any.fromFunction1((t0: String) => setPort(t0).runNow()), setProtocol = js.Any.fromFunction1((t0: String) => setProtocol(t0).runNow()), setTimeout = js.Any.fromFunction1((t0: Double) => setTimeout(t0).runNow()), setUserPassAuth = js.Any.fromFunction2((t0: String, t1: String) => (setUserPassAuth(t0, t1)).runNow()), signatureRequest = signatureRequest.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], unclaimedDraft = unclaimedDraft.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloSign]
  }
  
  extension [Self <: HelloSign](x: Self) {
    
    inline def setAccount(value: AccountModule): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setApiApp(value: ApiAppModule): Self = StObject.set(x, "apiApp", value.asInstanceOf[js.Any])
    
    inline def setEmbedded(value: EmbeddedModule): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    inline def setGetApiField(value: String => Any): Self = StObject.set(x, "getApiField", js.Any.fromFunction1(value))
    
    inline def setIsDev(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDev", value.toJsFn)
    
    inline def setOauth(value: OAuthModule): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setReports(value: ReportsModule): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setSetApiKey(value: String => Callback): Self = StObject.set(x, "setApiKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetClientId(value: String => Callback): Self = StObject.set(x, "setClientId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetClientSecret(value: String => Callback): Self = StObject.set(x, "setClientSecret", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetHost(value: (String, String, String) => Callback): Self = StObject.set(x, "setHost", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetOauthToken(value: String => Callback): Self = StObject.set(x, "setOauthToken", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPort(value: String => Callback): Self = StObject.set(x, "setPort", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetProtocol(value: String => Callback): Self = StObject.set(x, "setProtocol", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTimeout(value: Double => Callback): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetUserPassAuth(value: (String, String) => Callback): Self = StObject.set(x, "setUserPassAuth", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSignatureRequest(value: SignatureRequestModule): Self = StObject.set(x, "signatureRequest", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: TeamModule): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: TemplateModule): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setUnclaimedDraft(value: UnclaimedDraftModule): Self = StObject.set(x, "unclaimedDraft", value.asInstanceOf[js.Any])
    
    inline def set_setApiField(value: (String, Any) => Callback): Self = StObject.set(x, "_setApiField", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
