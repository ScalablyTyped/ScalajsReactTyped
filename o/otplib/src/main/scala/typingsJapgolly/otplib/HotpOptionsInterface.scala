package typingsJapgolly.otplib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotpOptionsInterface extends HmacOptions {
  var createHmacSecret: js.UndefOr[typingsJapgolly.otplib.createHmacSecret] = js.undefined
  var crypto: js.UndefOr[js.Any] = js.undefined
  var digits: js.UndefOr[Double] = js.undefined
}

object HotpOptionsInterface {
  @scala.inline
  def apply(
    algorithm: String = null,
    createHmacSecret: (/* secret */ String, /* options */ HmacOptions) => CallbackTo[Buffer] = null,
    crypto: js.Any = null,
    digits: Int | Double = null,
    encoding: String = null
  ): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (createHmacSecret != null) __obj.updateDynamic("createHmacSecret")(js.Any.fromFunction2((t0: /* secret */ java.lang.String, t1: /* options */ typingsJapgolly.otplib.HmacOptions) => createHmacSecret(t0, t1).runNow()))
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpOptionsInterface]
  }
}

