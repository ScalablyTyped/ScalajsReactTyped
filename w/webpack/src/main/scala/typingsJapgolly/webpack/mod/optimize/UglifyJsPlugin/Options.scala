package typingsJapgolly.webpack.mod.optimize.UglifyJsPlugin

import typingsJapgolly.uglifyJs.mod.CompressOptions
import typingsJapgolly.uglifyJs.mod.MangleOptions
import typingsJapgolly.uglifyJs.mod.MinifyOptions
import typingsJapgolly.uglifyJs.mod.OutputOptions
import typingsJapgolly.uglifyJs.mod.ParseOptions
import typingsJapgolly.uglifyJs.uglifyJsStrings.verbose
import typingsJapgolly.webpack.AnonCache
import typingsJapgolly.webpack.mod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends MinifyOptions {
  var beautify: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[Boolean | js.RegExp | CommentFilter] = js.undefined
  var exclude: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  var include: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  /** Parallelization can speedup your build significantly and is therefore highly recommended. */
  var parallel: js.UndefOr[Boolean | AnonCache] = js.undefined
  @JSName("sourceMap")
  var sourceMap_Options: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beautify: js.UndefOr[Boolean] = js.undefined,
    comments: Boolean | js.RegExp | CommentFilter = null,
    compress: Boolean | CompressOptions = null,
    exclude: Condition | js.Array[Condition] = null,
    ie8: js.UndefOr[Boolean] = js.undefined,
    include: Condition | js.Array[Condition] = null,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    mangle: Boolean | MangleOptions = null,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parallel: Boolean | AnonCache = null,
    parse: ParseOptions = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    test: Condition | js.Array[Condition] = null,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    warnings: Boolean | verbose = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

