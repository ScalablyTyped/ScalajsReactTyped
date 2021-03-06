package typingsJapgolly.escPosEncoder.mod

import typingsJapgolly.escPosEncoder.escPosEncoderNumbers.`1`
import typingsJapgolly.escPosEncoder.escPosEncoderNumbers.`2`
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EscPosEncoder extends js.Object {
  def align(value: alignType): EscPosEncoder = js.native
  def barcode(value: String, symbology: symbologyType, height: Double): EscPosEncoder = js.native
  def bold(): EscPosEncoder = js.native
  def bold(value: Boolean): EscPosEncoder = js.native
  def codepage(value: codepageType): EscPosEncoder = js.native
  def cut(): EscPosEncoder = js.native
  def cut(value: cutType): EscPosEncoder = js.native
  def encode(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def image(element: js.Any, width: Double, height: Double): EscPosEncoder = js.native
  def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType): EscPosEncoder = js.native
  def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType, threshold: Double): EscPosEncoder = js.native
  def initialize(): EscPosEncoder = js.native
  def italic(): EscPosEncoder = js.native
  def italic(value: Boolean): EscPosEncoder = js.native
  def line(value: String): EscPosEncoder = js.native
  def line(value: String, wrap: Double): EscPosEncoder = js.native
  def newline(): EscPosEncoder = js.native
  def qrcode(value: String): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_1(value: String, model: `1`): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_1(value: String, model: `1`, size: qrSizeType): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_1(value: String, model: `1`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_2(value: String, model: `2`): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_2(value: String, model: `2`, size: qrSizeType): EscPosEncoder = js.native
  @JSName("qrcode")
  def qrcode_2(value: String, model: `2`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
  def raw(data: js.Array[Double]): EscPosEncoder = js.native
  def raw(data: Uint8Array): EscPosEncoder = js.native
  def size(value: sizeType): EscPosEncoder = js.native
  def text(value: String): EscPosEncoder = js.native
  def text(value: String, wrap: Double): EscPosEncoder = js.native
  def underline(): EscPosEncoder = js.native
  def underline(value: Boolean): EscPosEncoder = js.native
  @JSName("underline")
  def underline_2(value: `2`): EscPosEncoder = js.native
}

