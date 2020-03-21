package typingsJapgolly.jsqrcode

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.ImageData
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`10`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`11`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`12`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`13`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`14`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`16`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`8`
import typingsJapgolly.jsqrcode.jsqrcodeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("qrcode")
@js.native
object qrcode extends js.Object {
  var debug: Boolean = js.native
  var height: Double = js.native
  var imagedata: ImageData = js.native
  var maxImgSize: Double = js.native
  var qrCodeSymbol: js.Any = js.native
  val sizeOfDataLengthInfo: js.Tuple3[
    js.Tuple4[`10`, `9`, `8`, `8`], 
    js.Tuple4[`12`, `11`, `16`, `10`], 
    js.Tuple4[`14`, `13`, `16`, `12`]
  ] = js.native
  var width: Double = js.native
  def binarize(th: Double): js.Array[Boolean] = js.native
  // tslint:disable-next-line:prefer-method-signature
  def callback(result: String): Unit = js.native
  def captureToCanvas(): Unit = js.native
  def decode(): Unit = js.native
  def decode(src: String): Unit = js.native
  def decode_url(s: String): String = js.native
  def decode_utf8(s: String): String = js.native
  def getMiddleBrightnessPerArea(image: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def getPixel(x: Double, y: Double): Double = js.native
  def grayScaleToBitmap(grayScale: js.Array[Double]): scala.scalajs.js.typedarray.Uint8Array = js.native
  def grayscale(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def isUrl(s: String): Boolean = js.native
  def orderBestPatterns(patterns: js.Array[AlignmentPattern]): Unit = js.native
  def process(ctx: CanvasRenderingContext2D): String = js.native
  def setWebcam(videoId: String): Unit = js.native
  def vidError(): Unit = js.native
  def vidError(error: js.Any): Unit = js.native
}

