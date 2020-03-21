package typingsJapgolly.tail.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TailOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flushAtEOF: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var fromBeginning: js.UndefOr[Boolean] = js.undefined
  var fsWatchOptions: js.UndefOr[Record[String, _]] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var separator: js.UndefOr[String | js.RegExp | Null] = js.undefined
  var useWatchFile: js.UndefOr[Boolean] = js.undefined
}

object TailOptions {
  @scala.inline
  def apply(
    encoding: String = null,
    flushAtEOF: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    fromBeginning: js.UndefOr[Boolean] = js.undefined,
    fsWatchOptions: Record[String, _] = null,
    logger: js.Any = null,
    separator: String | js.RegExp = null,
    useWatchFile: js.UndefOr[Boolean] = js.undefined
  ): TailOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(flushAtEOF)) __obj.updateDynamic("flushAtEOF")(flushAtEOF.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning.asInstanceOf[js.Any])
    if (fsWatchOptions != null) __obj.updateDynamic("fsWatchOptions")(fsWatchOptions.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(useWatchFile)) __obj.updateDynamic("useWatchFile")(useWatchFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailOptions]
  }
}

