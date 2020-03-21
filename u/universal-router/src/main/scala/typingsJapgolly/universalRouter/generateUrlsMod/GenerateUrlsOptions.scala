package typingsJapgolly.universalRouter.generateUrlsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pathToRegexp.mod.Key
import typingsJapgolly.pathToRegexp.mod.ParseOptions
import typingsJapgolly.pathToRegexp.mod.PathFunctionOptions
import typingsJapgolly.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateUrlsOptions
  extends PathFunctionOptions
     with TokensToFunctionOptions
     with ParseOptions {
  var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ Params, String]] = js.undefined
}

object GenerateUrlsOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    encode: (/* value */ String, /* token */ Key) => CallbackTo[String] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    stringifyQueryParams: /* params */ Params => CallbackTo[String] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): GenerateUrlsOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* token */ typingsJapgolly.pathToRegexp.mod.Key) => encode(t0, t1).runNow()))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (stringifyQueryParams != null) __obj.updateDynamic("stringifyQueryParams")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.universalRouter.generateUrlsMod.Params) => stringifyQueryParams(t0).runNow()))
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateUrlsOptions]
  }
}

