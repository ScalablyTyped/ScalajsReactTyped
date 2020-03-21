package typingsJapgolly.swaggerExpressValidator.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNullable: js.UndefOr[Boolean] = js.undefined
  var requestValidationFn: js.UndefOr[
    js.Function3[/* req */ Request_[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any, Unit]
  ] = js.undefined
  var responseValidationFn: js.UndefOr[
    js.Function3[/* req */ Request_[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any, Unit]
  ] = js.undefined
  var schema: String
  var validateRequest: js.UndefOr[Boolean] = js.undefined
  var validateResponse: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    schema: String,
    allowNullable: js.UndefOr[Boolean] = js.undefined,
    requestValidationFn: (/* req */ Request_[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any) => Callback = null,
    responseValidationFn: (/* req */ Request_[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any) => Callback = null,
    validateRequest: js.UndefOr[Boolean] = js.undefined,
    validateResponse: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNullable)) __obj.updateDynamic("allowNullable")(allowNullable.asInstanceOf[js.Any])
    if (requestValidationFn != null) __obj.updateDynamic("requestValidationFn")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* data */ js.Any, t2: /* errors */ js.Any) => requestValidationFn(t0, t1, t2).runNow()))
    if (responseValidationFn != null) __obj.updateDynamic("responseValidationFn")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* data */ js.Any, t2: /* errors */ js.Any) => responseValidationFn(t0, t1, t2).runNow()))
    if (!js.isUndefined(validateRequest)) __obj.updateDynamic("validateRequest")(validateRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

