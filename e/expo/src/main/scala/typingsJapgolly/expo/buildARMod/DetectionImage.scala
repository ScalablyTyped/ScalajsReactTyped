package typingsJapgolly.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionImage extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var uri: String
  var width: Double
}

object DetectionImage {
  @scala.inline
  def apply(uri: String, width: Double, name: String = null): DetectionImage = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectionImage]
  }
}

