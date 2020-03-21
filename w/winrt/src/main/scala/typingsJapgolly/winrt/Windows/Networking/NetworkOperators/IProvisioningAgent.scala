package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgent extends js.Object {
  def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): ProvisionedProfile
  def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[ProvisionFromXmlDocumentResults]
}

object IProvisioningAgent {
  @scala.inline
  def apply(
    getProvisionedProfile: (ProfileMediaType, String) => CallbackTo[ProvisionedProfile],
    provisionFromXmlDocumentAsync: String => CallbackTo[IAsyncOperation[ProvisionFromXmlDocumentResults]]
  ): IProvisioningAgent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProvisionedProfile")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileMediaType, t1: java.lang.String) => getProvisionedProfile(t0, t1).runNow()))
    __obj.updateDynamic("provisionFromXmlDocumentAsync")(js.Any.fromFunction1((t0: java.lang.String) => provisionFromXmlDocumentAsync(t0).runNow()))
    __obj.asInstanceOf[IProvisioningAgent]
  }
}

