package typingsJapgolly.webpack.mod.Options

import typingsJapgolly.webpack.mod.compilation.Chunk
import typingsJapgolly.webpack.webpackStrings.all
import typingsJapgolly.webpack.webpackStrings.async
import typingsJapgolly.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheGroupsOptions extends js.Object {
  /** Select chunks for determining cache group content (defaults to \"initial\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])] = js.undefined
  /** Ignore minimum size, minimum chunks and maximum requests and always create chunks for this cache group */
  var enforce: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of requests which are accepted for on-demand loading */
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  /** Maximum number of initial chunks which are accepted for an entry point */
  var maxInitialRequests: js.UndefOr[Double] = js.undefined
  /** Maximum size for the created chunk */
  var maxSize: js.UndefOr[Double] = js.undefined
  /** Minimum number of times a module has to be duplicated until it's considered for splitting */
  var minChunks: js.UndefOr[Double] = js.undefined
  /** Minimal size for the created chunk */
  var minSize: js.UndefOr[Double] = js.undefined
  /** Give chunks created a name (chunks with equal name are merged) */
  var name: js.UndefOr[Boolean | String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  /** Priority of this cache group */
  var priority: js.UndefOr[Double] = js.undefined
  /** Try to reuse existing chunk (with name) when it has matching modules */
  var reuseExistingChunk: js.UndefOr[Boolean] = js.undefined
  /** Assign modules to a cache group */
  var test: js.UndefOr[(js.Function1[/* repeated */ js.Any, Boolean]) | String | js.RegExp] = js.undefined
}

object CacheGroupsOptions {
  @scala.inline
  def apply(
    chunks: initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean]) = null,
    enforce: js.UndefOr[Boolean] = js.undefined,
    maxAsyncRequests: Int | Double = null,
    maxInitialRequests: Int | Double = null,
    maxSize: Int | Double = null,
    minChunks: Int | Double = null,
    minSize: Int | Double = null,
    name: Boolean | String | (js.Function1[/* repeated */ js.Any, _]) = null,
    priority: Int | Double = null,
    reuseExistingChunk: js.UndefOr[Boolean] = js.undefined,
    test: (js.Function1[/* repeated */ js.Any, Boolean]) | String | js.RegExp = null
  ): CacheGroupsOptions = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce.asInstanceOf[js.Any])
    if (maxAsyncRequests != null) __obj.updateDynamic("maxAsyncRequests")(maxAsyncRequests.asInstanceOf[js.Any])
    if (maxInitialRequests != null) __obj.updateDynamic("maxInitialRequests")(maxInitialRequests.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minChunks != null) __obj.updateDynamic("minChunks")(minChunks.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseExistingChunk)) __obj.updateDynamic("reuseExistingChunk")(reuseExistingChunk.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheGroupsOptions]
  }
}

