package typingsJapgolly.jimpJpeg

import typingsJapgolly.jimpCore.etcMod.Bitmap
import typingsJapgolly.jimpCore.etcMod.DecoderFn
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagejpegDecoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: DecoderFn = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(data: Buffer): Bitmap = js.native
}

