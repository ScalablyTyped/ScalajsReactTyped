package typingsJapgolly.firebaseFirestore.apiCredentialsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsProvider extends js.Object {
  /** Requests a token for the current user. */
  def getToken(): js.Promise[Token | Null]
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  def invalidateToken(): Unit
  /** Removes the previously-set change listener. */
  def removeChangeListener(): Unit
  /**
    * Specifies a listener to be notified of credential changes
    * (sign-in / sign-out, token changes). It is immediately called once with the
    * initial user.
    */
  def setChangeListener(changeListener: CredentialChangeListener): Unit
}

object CredentialsProvider {
  @scala.inline
  def apply(
    getToken: CallbackTo[js.Promise[Token | Null]],
    invalidateToken: Callback,
    removeChangeListener: Callback,
    setChangeListener: CredentialChangeListener => Callback
  ): CredentialsProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getToken")(getToken.toJsFn)
    __obj.updateDynamic("invalidateToken")(invalidateToken.toJsFn)
    __obj.updateDynamic("removeChangeListener")(removeChangeListener.toJsFn)
    __obj.updateDynamic("setChangeListener")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.apiCredentialsMod.CredentialChangeListener) => setChangeListener(t0).runNow()))
    __obj.asInstanceOf[CredentialsProvider]
  }
}

