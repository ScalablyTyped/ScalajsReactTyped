package typingsJapgolly.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2VerifyOptions extends js.Object {
  var encoded: String | scala.scalajs.js.typedarray.Uint8Array
  var pass: String
  var `type`: js.UndefOr[ArgonType] = js.undefined
}

object Argon2VerifyOptions {
  @scala.inline
  def apply(encoded: String | scala.scalajs.js.typedarray.Uint8Array, pass: String, `type`: ArgonType = null): Argon2VerifyOptions = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2VerifyOptions]
  }
}

