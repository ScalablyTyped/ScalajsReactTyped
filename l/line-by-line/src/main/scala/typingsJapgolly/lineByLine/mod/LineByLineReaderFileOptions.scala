package typingsJapgolly.lineByLine.mod

import typingsJapgolly.lineByLine.lineByLineStrings.ascii
import typingsJapgolly.lineByLine.lineByLineStrings.base64
import typingsJapgolly.lineByLine.lineByLineStrings.binary
import typingsJapgolly.lineByLine.lineByLineStrings.hex
import typingsJapgolly.lineByLine.lineByLineStrings.latin1
import typingsJapgolly.lineByLine.lineByLineStrings.ucs2
import typingsJapgolly.lineByLine.lineByLineStrings.utf16le
import typingsJapgolly.lineByLine.lineByLineStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLineReaderFileOptions extends LineByLineReaderOptions {
  /** The `end` position in bytes to read from the file. */
  var end: js.UndefOr[Double] = js.undefined
  /** The `start` position in bytes to read from the file. */
  var start: js.UndefOr[Double] = js.undefined
}

object LineByLineReaderFileOptions {
  @scala.inline
  def apply(
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | latin1 | binary | hex = null,
    end: Int | Double = null,
    skipEmptyLines: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): LineByLineReaderFileOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineByLineReaderFileOptions]
  }
}

