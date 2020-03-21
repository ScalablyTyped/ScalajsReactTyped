package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import typingsJapgolly.winrt.AnonContext
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
class HotspotAuthenticationContext () extends IHotspotAuthenticationContext {
  /* CompleteClass */
  override var authenticationUrl: Uri = js.native
  /* CompleteClass */
  override var networkAdapter: NetworkAdapter = js.native
  /* CompleteClass */
  override var redirectMessageUrl: Uri = js.native
  /* CompleteClass */
  override var redirectMessageXml: XmlDocument = js.native
  /* CompleteClass */
  override var wirelessNetworkId: scala.scalajs.js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override def abortAuthentication(markAsManual: Boolean): Unit = js.native
  /* CompleteClass */
  override def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
  /* CompleteClass */
  override def skipAuthentication(): Unit = js.native
  /* CompleteClass */
  override def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
object HotspotAuthenticationContext extends js.Object {
  def tryGetAuthenticationContext(evenToken: String): AnonContext = js.native
}

