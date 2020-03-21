package typingsJapgolly.decompress.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressOptions extends js.Object {
  /**
    * Filter out files before extracting
    */
  var filter: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.undefined
  /**
    * Map files before extracting
    */
  var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.undefined
  /**
    * Array of plugins to use.
    * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Remove leading directory components from extracted files.
    * Default: 0
    */
  var strip: js.UndefOr[Double] = js.undefined
}

object DecompressOptions {
  @scala.inline
  def apply(
    filter: /* file */ File => CallbackTo[Boolean] = null,
    map: /* file */ File => CallbackTo[File] = null,
    plugins: js.Array[_] = null,
    strip: Int | Double = null
  ): DecompressOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.decompress.mod.File) => filter(t0).runNow()))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.decompress.mod.File) => map(t0).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecompressOptions]
  }
}

