package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicParameters extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[typingsJapgolly.jose.mod.use] = js.undefined
}

object BasicParameters {
  @scala.inline
  def apply(alg: String = null, key_ops: js.Array[keyOperation] = null, kid: String = null, use: use = null): BasicParameters = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicParameters]
  }
}

