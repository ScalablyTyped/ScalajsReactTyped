package typingsJapgolly.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyIdTokenOptions extends js.Object {
  var audience: String | js.Array[String]
  var idToken: String
  var maxExpiry: js.UndefOr[Double] = js.undefined
}

object VerifyIdTokenOptions {
  @scala.inline
  def apply(audience: String | js.Array[String], idToken: String, maxExpiry: Int | Double = null): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any])
    if (maxExpiry != null) __obj.updateDynamic("maxExpiry")(maxExpiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
}

