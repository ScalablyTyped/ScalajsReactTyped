package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHotspotAuthenticationContext extends StObject {
  
  def abortAuthentication(markAsManual: Boolean): Unit
  
  var authenticationUrl: Uri
  
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit
  
  var networkAdapter: NetworkAdapter
  
  var redirectMessageUrl: Uri
  
  var redirectMessageXml: XmlDocument
  
  def skipAuthentication(): Unit
  
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit
  
  var wirelessNetworkId: js.typedarray.Uint8Array
}
object IHotspotAuthenticationContext {
  
  inline def apply(
    abortAuthentication: Boolean => Callback,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Callback,
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: Callback,
    triggerAttentionRequired: (String, String) => Callback,
    wirelessNetworkId: js.typedarray.Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1((t0: Boolean) => abortAuthentication(t0).runNow()), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (issueCredentials(t0, t1, t2, t3)).runNow()), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = skipAuthentication.toJsFn, triggerAttentionRequired = js.Any.fromFunction2((t0: String, t1: String) => (triggerAttentionRequired(t0, t1)).runNow()), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
  
  extension [Self <: IHotspotAuthenticationContext](x: Self) {
    
    inline def setAbortAuthentication(value: Boolean => Callback): Self = StObject.set(x, "abortAuthentication", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setAuthenticationUrl(value: Uri): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    inline def setIssueCredentials(value: (String, String, String, Boolean) => Callback): Self = StObject.set(x, "issueCredentials", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageUrl(value: Uri): Self = StObject.set(x, "redirectMessageUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageXml(value: XmlDocument): Self = StObject.set(x, "redirectMessageXml", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthentication(value: Callback): Self = StObject.set(x, "skipAuthentication", value.toJsFn)
    
    inline def setTriggerAttentionRequired(value: (String, String) => Callback): Self = StObject.set(x, "triggerAttentionRequired", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setWirelessNetworkId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "wirelessNetworkId", value.asInstanceOf[js.Any])
  }
}
