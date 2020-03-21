package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordVault extends js.Object {
  def add(credential: PasswordCredential): Unit
  def findAllByResource(resource: String): IVectorView[PasswordCredential]
  def findAllByUserName(userName: String): IVectorView[PasswordCredential]
  def remove(credential: PasswordCredential): Unit
  def retrieve(resource: String, userName: String): PasswordCredential
  def retrieveAll(): IVectorView[PasswordCredential]
}

object IPasswordVault {
  @scala.inline
  def apply(
    add: PasswordCredential => Callback,
    findAllByResource: String => CallbackTo[IVectorView[PasswordCredential]],
    findAllByUserName: String => CallbackTo[IVectorView[PasswordCredential]],
    remove: PasswordCredential => Callback,
    retrieve: (String, String) => CallbackTo[PasswordCredential],
    retrieveAll: CallbackTo[IVectorView[PasswordCredential]]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential) => add(t0).runNow()))
    __obj.updateDynamic("findAllByResource")(js.Any.fromFunction1((t0: java.lang.String) => findAllByResource(t0).runNow()))
    __obj.updateDynamic("findAllByUserName")(js.Any.fromFunction1((t0: java.lang.String) => findAllByUserName(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential) => remove(t0).runNow()))
    __obj.updateDynamic("retrieve")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => retrieve(t0, t1).runNow()))
    __obj.updateDynamic("retrieveAll")(retrieveAll.toJsFn)
    __obj.asInstanceOf[IPasswordVault]
  }
}

