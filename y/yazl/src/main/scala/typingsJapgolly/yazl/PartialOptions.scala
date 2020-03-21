package typingsJapgolly.yazl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.Options> */
trait PartialOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var forceZip64Format: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[js.Date] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    mtime: js.Date = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

