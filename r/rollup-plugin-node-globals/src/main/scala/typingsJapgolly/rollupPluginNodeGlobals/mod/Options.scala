package typingsJapgolly.rollupPluginNodeGlobals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseDir: js.UndefOr[String] = js.undefined
  var buffer: js.UndefOr[Boolean] = js.undefined
  var dirname: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  var filename: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  // Plugin's options
  var process: js.UndefOr[Boolean] = js.undefined
  // Enable sourcemaps support
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseDir: String = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    dirname: js.UndefOr[Boolean] = js.undefined,
    exclude: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    filename: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    include: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    process: js.UndefOr[Boolean] = js.undefined,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(dirname)) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(process)) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

