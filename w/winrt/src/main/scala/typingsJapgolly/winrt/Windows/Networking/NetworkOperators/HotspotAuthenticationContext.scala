package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotspotAuthenticationContext
  extends StObject
     with IHotspotAuthenticationContext
object HotspotAuthenticationContext {
  
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
  ): HotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1((t0: Boolean) => abortAuthentication(t0).runNow()), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (issueCredentials(t0, t1, t2, t3)).runNow()), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = skipAuthentication.toJsFn, triggerAttentionRequired = js.Any.fromFunction2((t0: String, t1: String) => (triggerAttentionRequired(t0, t1)).runNow()), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationContext]
  }
}
