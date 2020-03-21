package typingsJapgolly.oracleOraclejet.ojthematicmapMod

import typingsJapgolly.oracleOraclejet.AnonLocation
import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapLinkSettableProperties extends JetSettableProperties {
  var categories: js.Array[String]
  var color: String
  var endLocation: AnonLocation
  var selectable: auto | off
  var shortDesc: String
  var startLocation: AnonLocation
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object ojThematicMapLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    endLocation: AnonLocation,
    selectable: auto | off,
    shortDesc: String,
    startLocation: AnonLocation,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): ojThematicMapLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endLocation = endLocation.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], startLocation = startLocation.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
}

