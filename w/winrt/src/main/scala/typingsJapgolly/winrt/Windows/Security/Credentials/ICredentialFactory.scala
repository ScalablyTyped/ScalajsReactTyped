package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialFactory extends js.Object {
  def createPasswordCredential(resource: String, userName: String, password: String): PasswordCredential
}

object ICredentialFactory {
  @scala.inline
  def apply(createPasswordCredential: (String, String, String) => CallbackTo[PasswordCredential]): ICredentialFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPasswordCredential")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => createPasswordCredential(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ICredentialFactory]
  }
}

