package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.VerificationCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCodesCollection extends js.Object {
  // Generate new backup verification codes for the user.
  def generate(userKey: String): Unit
  // Invalidate the current backup verification codes for the user.
  def invalidate(userKey: String): Unit
  // Returns the current set of valid backup verification codes for the specified user.
  def list(userKey: String): VerificationCodes
}

object VerificationCodesCollection {
  @scala.inline
  def apply(
    generate: String => Callback,
    invalidate: String => Callback,
    list: String => CallbackTo[VerificationCodes]
  ): VerificationCodesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: java.lang.String) => generate(t0).runNow()))
    __obj.updateDynamic("invalidate")(js.Any.fromFunction1((t0: java.lang.String) => invalidate(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[VerificationCodesCollection]
  }
}

