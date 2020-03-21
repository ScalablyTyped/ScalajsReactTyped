package typingsJapgolly.reactImgpro.mod.ReactImgpro

import typingsJapgolly.reactImgpro.reactImgproStrings.horizontal_center
import typingsJapgolly.reactImgpro.reactImgproStrings.horizontal_left
import typingsJapgolly.reactImgpro.reactImgproStrings.horizontal_right
import typingsJapgolly.reactImgpro.reactImgproStrings.vertical_bottom
import typingsJapgolly.reactImgpro.reactImgproStrings.vertical_middle
import typingsJapgolly.reactImgpro.reactImgproStrings.vertical_top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: Double
  var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
  var width: Double
}

object Size {
  @scala.inline
  def apply(
    height: Double,
    mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

