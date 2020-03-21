package typingsJapgolly.jimpPng

import typingsJapgolly.jimpCore.etcMod.EncoderFn
import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagepngEncoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: EncoderFn[Image] = js.native
  @JSName("image/png")
  def imageSlashpng(image: Image): Buffer = js.native
}

