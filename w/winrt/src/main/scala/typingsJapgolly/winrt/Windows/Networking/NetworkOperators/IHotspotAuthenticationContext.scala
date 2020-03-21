package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContext extends js.Object {
  var authenticationUrl: Uri
  var networkAdapter: NetworkAdapter
  var redirectMessageUrl: Uri
  var redirectMessageXml: XmlDocument
  var wirelessNetworkId: scala.scalajs.js.typedarray.Uint8Array
  def abortAuthentication(markAsManual: Boolean): Unit
  def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit
  def skipAuthentication(): Unit
  def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit
}

object IHotspotAuthenticationContext {
  @scala.inline
  def apply(
    abortAuthentication: Boolean => Callback,
    authenticationUrl: Uri,
    issueCredentials: (String, String, String, Boolean) => Callback,
    networkAdapter: NetworkAdapter,
    redirectMessageUrl: Uri,
    redirectMessageXml: XmlDocument,
    skipAuthentication: Callback,
    triggerAttentionRequired: (String, String) => Callback,
    wirelessNetworkId: scala.scalajs.js.typedarray.Uint8Array
  ): IHotspotAuthenticationContext = {
    val __obj = js.Dynamic.literal(authenticationUrl = authenticationUrl.asInstanceOf[js.Any], networkAdapter = networkAdapter.asInstanceOf[js.Any], redirectMessageUrl = redirectMessageUrl.asInstanceOf[js.Any], redirectMessageXml = redirectMessageXml.asInstanceOf[js.Any], wirelessNetworkId = wirelessNetworkId.asInstanceOf[js.Any])
    __obj.updateDynamic("abortAuthentication")(js.Any.fromFunction1((t0: scala.Boolean) => abortAuthentication(t0).runNow()))
    __obj.updateDynamic("issueCredentials")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Boolean) => issueCredentials(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("skipAuthentication")(skipAuthentication.toJsFn)
    __obj.updateDynamic("triggerAttentionRequired")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => triggerAttentionRequired(t0, t1).runNow()))
    __obj.asInstanceOf[IHotspotAuthenticationContext]
  }
}

