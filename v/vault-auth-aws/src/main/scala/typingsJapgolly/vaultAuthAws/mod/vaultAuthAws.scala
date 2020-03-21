package typingsJapgolly.vaultAuthAws.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vaultAuthAws extends js.Object {
  def authenticate(): js.Promise[_]
  def getOptions(creds: Creds): Options
}

object vaultAuthAws {
  @scala.inline
  def apply(authenticate: CallbackTo[js.Promise[js.Any]], getOptions: Creds => CallbackTo[Options]): vaultAuthAws = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(authenticate.toJsFn)
    __obj.updateDynamic("getOptions")(js.Any.fromFunction1((t0: typingsJapgolly.vaultAuthAws.mod.Creds) => getOptions(t0).runNow()))
    __obj.asInstanceOf[vaultAuthAws]
  }
}

