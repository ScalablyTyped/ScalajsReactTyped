package typingsJapgolly.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageEncodingProperties extends IMediaEncodingProperties {
  var height: Double
  var width: Double
}

object IImageEncodingProperties {
  @scala.inline
  def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): IImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageEncodingProperties]
  }
}

