package typingsJapgolly.dv.mod

import typingsJapgolly.dv.dvStrings.AZTEC
import typingsJapgolly.dv.dvStrings.CODE_128
import typingsJapgolly.dv.dvStrings.CODE_39
import typingsJapgolly.dv.dvStrings.DATA_MATRIX
import typingsJapgolly.dv.dvStrings.EAN_13
import typingsJapgolly.dv.dvStrings.EAN_8
import typingsJapgolly.dv.dvStrings.ITF
import typingsJapgolly.dv.dvStrings.None
import typingsJapgolly.dv.dvStrings.PDF_417
import typingsJapgolly.dv.dvStrings.QR_CODE
import typingsJapgolly.dv.dvStrings.UPC_A
import typingsJapgolly.dv.dvStrings.UPC_E
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dv", "ZXing")
@js.native
class ZXing () extends js.Object {
  def this(image: Image) = this()
  /**
  	 * denotes the decoded binary data of the barcode before conversion into another character encoding.
  	 */
  val buffer: Buffer = js.native
  /**
  	 * denotes the stringified data read from the barcode.
  	 */
  val data: String = js.native
  /**
  	 * List of barcodes the reader tries to find. It's specified as an object and missing properties account as false
  	 */
  var formats: Barcodeformat = js.native
  /**
  	 * Accessor for the input image this barcode reader operates on.
  	 */
  var image: Image = js.native
  /**
  	 * denotes the points in pixels which were used by the barcode reader to detect the barcode.
  	 */
  val points: js.Array[Point] = js.native
  /**
  	 * If try harder is enabled, the barcode reader spends more time trying to find a barcode (optimize for accuracy, not speed).
  	 */
  var tryHarder: Boolean = js.native
  /**
  	 * enotes the barcodes type.
  	 */
  val `type`: None | QR_CODE | DATA_MATRIX | PDF_417 | UPC_E | UPC_A | EAN_8 | EAN_13 | CODE_128 | CODE_39 | ITF | AZTEC = js.native
  /**
  	 * Returns the first barcode found as an object with the following format:
  	 */
  def findCode(): BarCode = js.native
}

