package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.image
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWithMarker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.marker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.solid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderColor extends js.Object {
  var borderColor: String
  var categories: js.Array[String]
  var categoryVisibility: hidden | visible
  var color: String
  var id: String
  var lineStyle: dotted | dashed | solid
  var lineWidth: Double
  var markerColor: String
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  var shortDesc: String
  var source: String
  var symbolType: line | lineWithMarker | image | marker
  var text: String
}

object AnonBorderColor {
  @scala.inline
  def apply(
    borderColor: String,
    categories: js.Array[String],
    categoryVisibility: hidden | visible,
    color: String,
    id: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    shortDesc: String,
    source: String,
    symbolType: line | lineWithMarker | image | marker,
    text: String,
    markerShape: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null
  ): AnonBorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryVisibility = categoryVisibility.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColor]
  }
}

