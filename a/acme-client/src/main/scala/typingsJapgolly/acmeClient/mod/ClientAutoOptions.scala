package typingsJapgolly.acmeClient.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.acmeClient.rfc8555Mod.Challenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAutoOptions extends js.Object {
  var challengePriority: js.UndefOr[js.Array[String]] = js.undefined
  var csr: CsrBuffer | CsrString
  var email: js.UndefOr[String] = js.undefined
  var skipChallengeVerification: js.UndefOr[Boolean] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_]
  def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_]
}

object ClientAutoOptions {
  @scala.inline
  def apply(
    challengeCreateFn: (Authorization, Challenge, String) => CallbackTo[js.Promise[js.Any]],
    challengeRemoveFn: (Authorization, Challenge, String) => CallbackTo[js.Promise[js.Any]],
    csr: CsrBuffer | CsrString,
    challengePriority: js.Array[String] = null,
    email: String = null,
    skipChallengeVerification: js.UndefOr[Boolean] = js.undefined,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): ClientAutoOptions = {
    val __obj = js.Dynamic.literal(csr = csr.asInstanceOf[js.Any])
    __obj.updateDynamic("challengeCreateFn")(js.Any.fromFunction3((t0: typingsJapgolly.acmeClient.mod.Authorization, t1: typingsJapgolly.acmeClient.rfc8555Mod.Challenge, t2: java.lang.String) => challengeCreateFn(t0, t1, t2).runNow()))
    __obj.updateDynamic("challengeRemoveFn")(js.Any.fromFunction3((t0: typingsJapgolly.acmeClient.mod.Authorization, t1: typingsJapgolly.acmeClient.rfc8555Mod.Challenge, t2: java.lang.String) => challengeRemoveFn(t0, t1, t2).runNow()))
    if (challengePriority != null) __obj.updateDynamic("challengePriority")(challengePriority.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(skipChallengeVerification)) __obj.updateDynamic("skipChallengeVerification")(skipChallengeVerification.asInstanceOf[js.Any])
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAutoOptions]
  }
}

