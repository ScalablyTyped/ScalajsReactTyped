package typingsJapgolly.winrt.Windows.Web.AtomPub

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClientFactory extends js.Object {
  def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient
}

object IAtomPubClientFactory {
  @scala.inline
  def apply(createAtomPubClientWithCredentials: PasswordCredential => CallbackTo[AtomPubClient]): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAtomPubClientWithCredentials")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential) => createAtomPubClientWithCredentials(t0).runNow()))
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
}

