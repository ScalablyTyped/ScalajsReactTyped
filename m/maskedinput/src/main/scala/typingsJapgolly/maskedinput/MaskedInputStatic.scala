package typingsJapgolly.maskedinput

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputStatic extends js.Object {
  var defaults: MaskedInputDefaults
  def format(value: String, options: MaskedInputStaticDefaults): Boolean
  def isValid(value: String, options: MaskedInputStaticDefaults): Boolean
}

object MaskedInputStatic {
  @scala.inline
  def apply(
    defaults: MaskedInputDefaults,
    format: (String, MaskedInputStaticDefaults) => CallbackTo[Boolean],
    isValid: (String, MaskedInputStaticDefaults) => CallbackTo[Boolean]
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.maskedinput.MaskedInputStaticDefaults) => format(t0, t1).runNow()))
    __obj.updateDynamic("isValid")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.maskedinput.MaskedInputStaticDefaults) => isValid(t0, t1).runNow()))
    __obj.asInstanceOf[MaskedInputStatic]
  }
}

