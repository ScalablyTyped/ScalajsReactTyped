package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.ValidationError
import typingsJapgolly.expressValidator.expressValidatorStrings._error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends ValidationError {
  var location: js.UndefOr[scala.Nothing] = js.undefined
  var msg: js.Any
  var nestedErrors: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
  ]
  var param: _error
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonLocation {
  @scala.inline
  def apply(
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    param: _error,
    location: js.UndefOr[scala.Nothing] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}

