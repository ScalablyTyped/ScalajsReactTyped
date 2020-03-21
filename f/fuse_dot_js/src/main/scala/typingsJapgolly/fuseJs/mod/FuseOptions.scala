package typingsJapgolly.fuseJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fuseJs.AnonName
import typingsJapgolly.fuseJs.AnonScore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuseOptions[T] extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var findAllMatches: js.UndefOr[Boolean] = js.undefined
  var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, _]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var includeMatches: js.UndefOr[Boolean] = js.undefined
  var includeScore: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[AnonName[T] | String]] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var matchAllTokens: js.UndefOr[Boolean] = js.undefined
  var maxPatternLength: js.UndefOr[Double] = js.undefined
  var minMatchCharLength: js.UndefOr[Double] = js.undefined
  var shouldSort: js.UndefOr[Boolean] = js.undefined
  var sortFn: js.UndefOr[js.Function2[/* a */ AnonScore, /* b */ AnonScore, Double]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var tokenSeparator: js.UndefOr[js.RegExp] = js.undefined
  var tokenize: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object FuseOptions {
  @scala.inline
  def apply[T](
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    findAllMatches: js.UndefOr[Boolean] = js.undefined,
    getFn: (/* obj */ js.Any, /* path */ String) => CallbackTo[js.Any] = null,
    id: String = null,
    includeMatches: js.UndefOr[Boolean] = js.undefined,
    includeScore: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[AnonName[T] | String] = null,
    location: Int | Double = null,
    matchAllTokens: js.UndefOr[Boolean] = js.undefined,
    maxPatternLength: Int | Double = null,
    minMatchCharLength: Int | Double = null,
    shouldSort: js.UndefOr[Boolean] = js.undefined,
    sortFn: (/* a */ AnonScore, /* b */ AnonScore) => CallbackTo[Double] = null,
    threshold: Int | Double = null,
    tokenSeparator: js.RegExp = null,
    tokenize: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): FuseOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(findAllMatches)) __obj.updateDynamic("findAllMatches")(findAllMatches.asInstanceOf[js.Any])
    if (getFn != null) __obj.updateDynamic("getFn")(js.Any.fromFunction2((t0: /* obj */ js.Any, t1: /* path */ java.lang.String) => getFn(t0, t1).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMatches)) __obj.updateDynamic("includeMatches")(includeMatches.asInstanceOf[js.Any])
    if (!js.isUndefined(includeScore)) __obj.updateDynamic("includeScore")(includeScore.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAllTokens)) __obj.updateDynamic("matchAllTokens")(matchAllTokens.asInstanceOf[js.Any])
    if (maxPatternLength != null) __obj.updateDynamic("maxPatternLength")(maxPatternLength.asInstanceOf[js.Any])
    if (minMatchCharLength != null) __obj.updateDynamic("minMatchCharLength")(minMatchCharLength.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldSort)) __obj.updateDynamic("shouldSort")(shouldSort.asInstanceOf[js.Any])
    if (sortFn != null) __obj.updateDynamic("sortFn")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.fuseJs.AnonScore, t1: /* b */ typingsJapgolly.fuseJs.AnonScore) => sortFn(t0, t1).runNow()))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tokenSeparator != null) __obj.updateDynamic("tokenSeparator")(tokenSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(tokenize)) __obj.updateDynamic("tokenize")(tokenize.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuseOptions[T]]
  }
}

