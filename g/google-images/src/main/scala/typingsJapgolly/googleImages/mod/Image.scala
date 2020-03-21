package typingsJapgolly.googleImages.mod

import typingsJapgolly.googleImages.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: Double
  var size: Double
  var thumbnail: AnonHeight
  var `type`: String
  var url: String
  var width: Double
}

object Image {
  @scala.inline
  def apply(height: Double, size: Double, thumbnail: AnonHeight, `type`: String, url: String, width: Double): Image = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

