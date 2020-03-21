package typingsJapgolly.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var deterministic: js.UndefOr[Boolean] = js.undefined
  var safeIntegers: js.UndefOr[Boolean] = js.undefined
  var varargs: js.UndefOr[Boolean] = js.undefined
}

object RegistrationOptions {
  @scala.inline
  def apply(
    deterministic: js.UndefOr[Boolean] = js.undefined,
    safeIntegers: js.UndefOr[Boolean] = js.undefined,
    varargs: js.UndefOr[Boolean] = js.undefined
  ): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deterministic)) __obj.updateDynamic("deterministic")(deterministic.asInstanceOf[js.Any])
    if (!js.isUndefined(safeIntegers)) __obj.updateDynamic("safeIntegers")(safeIntegers.asInstanceOf[js.Any])
    if (!js.isUndefined(varargs)) __obj.updateDynamic("varargs")(varargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationOptions]
  }
}

