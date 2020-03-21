package typingsJapgolly.jestRuntime.mod

import typingsJapgolly.std.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteMapOptions extends js.Object {
  var console: js.UndefOr[Console_] = js.undefined
  var maxWorkers: Double
  var resetCache: Boolean
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchman: Boolean
}

object HasteMapOptions {
  @scala.inline
  def apply(
    maxWorkers: Double,
    resetCache: Boolean,
    watchman: Boolean,
    console: Console_ = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): HasteMapOptions = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMapOptions]
  }
}

