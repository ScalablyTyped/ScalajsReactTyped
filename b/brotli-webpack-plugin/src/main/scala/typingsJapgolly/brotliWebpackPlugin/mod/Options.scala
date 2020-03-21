package typingsJapgolly.brotliWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The target asset name. Defaults to `'[path].br[query]'`.
    *
    * - `[file]` is replaced with the original asset file name.
    * - `[fileWithoutExt]` is replaced with the file name minus its extension, e.g. the `style` of `style.css`.
    * - `[ext]` is replaced with the file name extension, e.g. the `css` of `style.css`.
    * - `[path]` is replaced with the path of the original asset.
    * - `[query]` is replaced with the query.
    */
  var asset: js.UndefOr[String] = js.undefined
  /**
    * Remove original files that were compressed with brotli. Default: `false`.
    */
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined
  /**
    * Only assets that compress better that this ratio are processed. Defaults to `0.8`.
    */
  var minRatio: js.UndefOr[Double] = js.undefined
  /**
    * All assets matching this RegExp are processed. Defaults to every asset.
    */
  var test: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Only assets bigger than this size (in bytes) are processed. Defaults to `0`.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    asset: String = null,
    deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined,
    minRatio: Int | Double = null,
    test: js.RegExp = null,
    threshold: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

