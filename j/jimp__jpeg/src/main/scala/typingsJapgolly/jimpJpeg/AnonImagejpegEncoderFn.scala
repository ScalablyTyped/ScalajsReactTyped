package typingsJapgolly.jimpJpeg

import typingsJapgolly.jimpCore.etcMod.EncoderFn
import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagejpegEncoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(image: Image): Buffer = js.native
}

