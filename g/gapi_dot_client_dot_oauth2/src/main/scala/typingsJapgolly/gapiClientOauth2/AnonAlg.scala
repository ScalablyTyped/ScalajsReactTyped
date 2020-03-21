package typingsJapgolly.gapiClientOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlg extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var e: js.UndefOr[String] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var kty: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[String] = js.undefined
}

object AnonAlg {
  @scala.inline
  def apply(
    alg: String = null,
    e: String = null,
    kid: String = null,
    kty: String = null,
    n: String = null,
    use: String = null
  ): AnonAlg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlg]
  }
}

