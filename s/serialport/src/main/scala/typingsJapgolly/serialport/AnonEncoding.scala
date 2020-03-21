package typingsJapgolly.serialport

import typingsJapgolly.node.Buffer
import typingsJapgolly.serialport.serialportStrings.ascii
import typingsJapgolly.serialport.serialportStrings.base64
import typingsJapgolly.serialport.serialportStrings.binary
import typingsJapgolly.serialport.serialportStrings.hex
import typingsJapgolly.serialport.serialportStrings.ucs2
import typingsJapgolly.serialport.serialportStrings.utf16le
import typingsJapgolly.serialport.serialportStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.undefined
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object AnonEncoding {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex = null,
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

