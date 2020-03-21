package typingsJapgolly.storybookTheming.typesMod

import typingsJapgolly.storybookTheming.AnonBase
import typingsJapgolly.storybookTheming.AnonBlack
import typingsJapgolly.storybookTheming.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var fonts: AnonBase
  var size: AnonCode
  var weight: AnonBlack
}

object Typography {
  @scala.inline
  def apply(fonts: AnonBase, size: AnonCode, weight: AnonBlack): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typography]
  }
}

