package typingsJapgolly.jimpTiff

import typingsJapgolly.jimpCore.etcMod.EncoderFn
import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagetiffEncoderFn extends js.Object {
  @JSName("image/tiff")
  var imageSlashtiff_Original: EncoderFn[Image] = js.native
  @JSName("image/tiff")
  def imageSlashtiff(image: Image): Buffer = js.native
}

