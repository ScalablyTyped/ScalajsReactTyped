package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialProvider extends js.Object {
  var handle: Double
  def deleteCredential(credentialId: String): Thenable[Boolean]
  def readCredential(credentialId: String): Thenable[Credential]
  def saveCredential(credentialId: String, password: String): Thenable[Boolean]
}

object CredentialProvider {
  @scala.inline
  def apply(
    deleteCredential: String => CallbackTo[Thenable[Boolean]],
    handle: Double,
    readCredential: String => CallbackTo[Thenable[Credential]],
    saveCredential: (String, String) => CallbackTo[Thenable[Boolean]]
  ): CredentialProvider = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.updateDynamic("deleteCredential")(js.Any.fromFunction1((t0: java.lang.String) => deleteCredential(t0).runNow()))
    __obj.updateDynamic("readCredential")(js.Any.fromFunction1((t0: java.lang.String) => readCredential(t0).runNow()))
    __obj.updateDynamic("saveCredential")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => saveCredential(t0, t1).runNow()))
    __obj.asInstanceOf[CredentialProvider]
  }
}

