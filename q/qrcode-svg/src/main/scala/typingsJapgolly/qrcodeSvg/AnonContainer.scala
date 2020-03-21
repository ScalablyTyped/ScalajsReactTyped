package typingsJapgolly.qrcodeSvg

import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.g
import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.none
import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: svg | g | none
}

object AnonContainer {
  @scala.inline
  def apply(container: svg | g | none): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainer]
  }
}

