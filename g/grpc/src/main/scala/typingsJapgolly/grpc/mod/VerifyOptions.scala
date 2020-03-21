package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  /**
    * If set, this callback will be invoked after the usual hostname verification
    * has been performed on the peer certificate.
    */
  var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    checkServerIdentity: (/* hostname */ String, /* cert */ Certificate) => CallbackTo[js.UndefOr[js.Error]] = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2((t0: /* hostname */ java.lang.String, t1: /* cert */ typingsJapgolly.grpc.mod.Certificate) => checkServerIdentity(t0, t1).runNow()))
    __obj.asInstanceOf[VerifyOptions]
  }
}

