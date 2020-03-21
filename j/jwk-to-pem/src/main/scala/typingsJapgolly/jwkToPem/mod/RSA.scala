package typingsJapgolly.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSA extends JWK {
  var d: js.UndefOr[String] = js.undefined
  var dp: js.UndefOr[String] = js.undefined
  var dq: js.UndefOr[String] = js.undefined
  var e: String
  var kty: typingsJapgolly.jwkToPem.jwkToPemStrings.RSA
  var n: String
  var p: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var qi: js.UndefOr[String] = js.undefined
}

object RSA {
  @scala.inline
  def apply(
    e: String,
    kty: typingsJapgolly.jwkToPem.jwkToPemStrings.RSA,
    n: String,
    d: String = null,
    dp: String = null,
    dq: String = null,
    p: String = null,
    q: String = null,
    qi: String = null
  ): RSA = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (dq != null) __obj.updateDynamic("dq")(dq.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qi != null) __obj.updateDynamic("qi")(qi.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSA]
  }
}

