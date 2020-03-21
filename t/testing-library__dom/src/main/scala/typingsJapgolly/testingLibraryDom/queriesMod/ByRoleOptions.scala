package typingsJapgolly.testingLibraryDom.queriesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByRoleOptions extends MatcherOptions {
  /**
    * If true includes elements in the query set that are usually excluded from
    * the accessibility tree. `role="none"` or `role="presentation"` are included
    * in either case.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Includes every role used in the `role` attribute
    * For example *ByRole('progressbar', {queryFallbacks: true})` will find <div role="meter progresbar">`.
    */
  var queryFallbacks: js.UndefOr[Boolean] = js.undefined
}

object ByRoleOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    normalizer: /* text */ String => CallbackTo[String] = null,
    queryFallbacks: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): ByRoleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => normalizer(t0).runNow()))
    if (!js.isUndefined(queryFallbacks)) __obj.updateDynamic("queryFallbacks")(queryFallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByRoleOptions]
  }
}

