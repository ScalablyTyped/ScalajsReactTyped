package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the authentication context that contains details of the current authentication attempt and provides methods to perform the authentication. */
trait HotspotAuthenticationContext extends StObject {
  
  /**
    * Aborts the current authentication attempt and disconnects the WLAN interface from the hotspot.
    * @param markAsManual If true, Windows disables the auto-connect property for the corresponding WLAN profile and avoids future auto-connects to this hotspot. Otherwise, false.
    */
  def abortAuthentication(markAsManual: Boolean): Unit
  
  /** Gets the HTTPS URL specified in the Wireless Internet Service Provider roaming (WISPr) redirect message. */
  var authenticationUrl: Uri
  
  /**
    * Provides credentials to Windows for hotspot authentication
    * @param userName The UserName parameter of the Wireless Internet Service Provider roaming (WISPr) authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param password The Password parameter of the WISPr authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param extraParameters Additional parameters to be appended to the authentication string. IssueCredentials appends this parameter after an "&" character to the HTTP POST string as is without any encoding. This can be used to add multiple parameters. The default for this parameter is an empty string.
    * @param markAsManualConnectOnFailure If true, an application permanently disables the auto-connect property on a connection. If authentication fails, the connection will be disconnected and not retried in the current user session. Otherwise, false.
    */
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit
  
  /**
    * Asynchronously provides credentials to Windows for hotspot authentication Windows does not cache these credentials and another authentication event will be raised when the system connects to the same hotspot again.
    * @param userName The UserName parameter of the Wireless Internet Service Provider roaming (WISPr) authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param password The Password parameter of the WISPr authentication protocol. IssueCredentials performs URL encoding before submitting the value to the server. If this string is empty, the corresponding authentication parameter is skipped.
    * @param extraParameters Additional parameters to be appended to the authentication string. IssueCredentials appends this parameter after an "&" character to the HTTP POST string as is without any encoding. This can be used to add multiple parameters. The default for this parameter is an empty string.
    * @param markAsManualConnectOnFailure If true, an application permanently disables the auto-connect property on a connection. If authentication fails, the connection will be disconnected and not retried in the current user session. Otherwise, false.
    * @return Results of the Hotspot authentication request.
    */
  def issueCredentialsAsync(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult]
  
  /** Gets the network interface that is connected to the WLAN access point of the hotspot. */
  var networkAdapter: NetworkAdapter
  
  /** Gets the URL of the web page where the Wireless Internet Service Provider roaming (WISPr) redirect message was found. */
  var redirectMessageUrl: Uri
  
  /** Gets the XML blob of the Wireless Internet Service Provider roaming (WISPr) redirect message of the hotspot. */
  var redirectMessageXml: XmlDocument
  
  /** Skips Wireless Internet Service Provider roaming (WISPr) Windows authentication. */
  def skipAuthentication(): Unit
  
  /**
    * Called by a background task handler to launch the foreground application when there is an authentication attempt to complete.
    * @param packageRelativeApplicationId The foreground application ID within its application package. The application must belong to the same package as the background task handler.
    * @param applicationParameters Optional command line parameters that are passed to the application at launch.
    */
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit
  
  /** Gets the SSID of the WLAN access point of the hotspot. */
  var wirelessNetworkId: Double
}
object HotspotAuthenticationContext {
  
  inline def apply(
    abortAuthentication: Boolean => Callback,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Callback,
    issueCredentialsAsync: (String, String, String, Boolean) => IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult],
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: Callback,
    triggerAttentionRequired: (String, String) => Callback,
    wirelessNetworkId: Double
  ): HotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(abortAuthentication = js.Any.fromFunction1((t0: Boolean) => abortAuthentication(t0).runNow()), authenticationUrl = authenticationUrl.asInstanceOf[js.Any], issueCredentials = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (issueCredentials(t0, t1, t2, t3)).runNow()), issueCredentialsAsync = js.Any.fromFunction4(issueCredentialsAsync), networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], skipAuthentication = skipAuthentication.toJsFn, triggerAttentionRequired = js.Any.fromFunction2((t0: String, t1: String) => (triggerAttentionRequired(t0, t1)).runNow()), wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationContext]
  }
  
  extension [Self <: HotspotAuthenticationContext](x: Self) {
    
    inline def setAbortAuthentication(value: Boolean => Callback): Self = StObject.set(x, "abortAuthentication", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setAuthenticationUrl(value: Uri): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    inline def setIssueCredentials(value: (String, String, String, Boolean) => Callback): Self = StObject.set(x, "issueCredentials", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setIssueCredentialsAsync(
      value: (String, String, String, Boolean) => IPromiseWithIAsyncOperation[HotspotCredentialsAuthenticationResult]
    ): Self = StObject.set(x, "issueCredentialsAsync", js.Any.fromFunction4(value))
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageUrl(value: Uri): Self = StObject.set(x, "redirectMessageUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectMessageXml(value: XmlDocument): Self = StObject.set(x, "redirectMessageXml", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthentication(value: Callback): Self = StObject.set(x, "skipAuthentication", value.toJsFn)
    
    inline def setTriggerAttentionRequired(value: (String, String) => Callback): Self = StObject.set(x, "triggerAttentionRequired", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setWirelessNetworkId(value: Double): Self = StObject.set(x, "wirelessNetworkId", value.asInstanceOf[js.Any])
  }
}
