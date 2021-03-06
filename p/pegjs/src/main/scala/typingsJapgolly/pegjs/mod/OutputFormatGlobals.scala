package typingsJapgolly.pegjs.mod

import typingsJapgolly.pegjs.pegjsStrings.globals
import typingsJapgolly.pegjs.pegjsStrings.size
import typingsJapgolly.pegjs.pegjsStrings.source
import typingsJapgolly.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFormatGlobals extends BuildOptionsBase {
  /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
  var exportVar: js.UndefOr[js.Any] = js.undefined
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: globals
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source
}

object OutputFormatGlobals {
  @scala.inline
  def apply(
    format: globals,
    output: source,
    allowedStartRules: js.Array[String] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    exportVar: js.Any = null,
    optimize: speed | size = null,
    plugins: js.Array[_] = null,
    trace: js.UndefOr[Boolean] = js.undefined
  ): OutputFormatGlobals = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (allowedStartRules != null) __obj.updateDynamic("allowedStartRules")(allowedStartRules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (exportVar != null) __obj.updateDynamic("exportVar")(exportVar.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatGlobals]
  }
}

