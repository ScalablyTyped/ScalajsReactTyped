package typingsJapgolly.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMozosxfontsmoothing extends js.Object {
  var `-moz-osx-font-smoothing`: String
  var `-webkit-font-smoothing`: String
  var fontFamily: String
  var fontWeight: Double
  var textRendering: String
}

object AnonMozosxfontsmoothing {
  @scala.inline
  def apply(
    `-moz-osx-font-smoothing`: String,
    `-webkit-font-smoothing`: String,
    fontFamily: String,
    fontWeight: Double,
    textRendering: String
  ): AnonMozosxfontsmoothing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any])
    __obj.updateDynamic("-moz-osx-font-smoothing")(`-moz-osx-font-smoothing`.asInstanceOf[js.Any])
    __obj.updateDynamic("-webkit-font-smoothing")(`-webkit-font-smoothing`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMozosxfontsmoothing]
  }
}

