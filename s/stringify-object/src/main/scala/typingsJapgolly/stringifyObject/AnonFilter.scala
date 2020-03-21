package typingsJapgolly.stringifyObject

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[js.Function2[/* o */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var inlineCharacterLimit: js.UndefOr[Double] = js.undefined
  var singleQuotes: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ Double | String | js.Symbol, 
      /* value */ String, 
      String
    ]
  ] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(
    filter: (/* o */ js.Any, /* prop */ String | js.Symbol) => CallbackTo[Boolean] = null,
    indent: String = null,
    inlineCharacterLimit: Int | Double = null,
    singleQuotes: js.UndefOr[Boolean] = js.undefined,
    transform: (/* val */ js.Array[js.Any] | js.Object, /* i */ Double | String | js.Symbol, /* value */ String) => CallbackTo[String] = null
  ): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* o */ js.Any, t1: /* prop */ java.lang.String | js.Symbol) => filter(t0, t1).runNow()))
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (inlineCharacterLimit != null) __obj.updateDynamic("inlineCharacterLimit")(inlineCharacterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(singleQuotes)) __obj.updateDynamic("singleQuotes")(singleQuotes.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3((t0: /* val */ js.Array[js.Any] | js.Object, t1: /* i */ scala.Double | java.lang.String | js.Symbol, t2: /* value */ java.lang.String) => transform(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonFilter]
  }
}

