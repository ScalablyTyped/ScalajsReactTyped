package typingsJapgolly.jimpBmp.mod

import typingsJapgolly.jimpBmp.AnonImagebmp
import typingsJapgolly.jimpBmp.AnonImagebmpImagexmsbmp
import typingsJapgolly.jimpBmp.AnonImagexmsbmp
import typingsJapgolly.jimpBmp.AnonMIMEBMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bmp extends js.Object {
  var constants: AnonMIMEBMP
  var decoders: AnonImagexmsbmp
  var encoders: AnonImagebmpImagexmsbmp
  var mime: AnonImagebmp
}

object Bmp {
  @scala.inline
  def apply(
    constants: AnonMIMEBMP,
    decoders: AnonImagexmsbmp,
    encoders: AnonImagebmpImagexmsbmp,
    mime: AnonImagebmp
  ): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bmp]
  }
}

