package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClientFactory extends js.Object {
  def createSyndicationClient(serverCredential: PasswordCredential): SyndicationClient
}

object ISyndicationClientFactory {
  @scala.inline
  def apply(createSyndicationClient: PasswordCredential => CallbackTo[SyndicationClient]): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationClient")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential) => createSyndicationClient(t0).runNow()))
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
}

