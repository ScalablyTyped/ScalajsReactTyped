package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ellipse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderRadius extends js.Object {
  var borderColor: String
  var borderRadius: String
  var borderWidth: Double
  var color: String
  var height: Double
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object AnonBorderRadius {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: String,
    borderWidth: Double,
    color: String,
    height: Double,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null
  ): AnonBorderRadius = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceHover = sourceHover.asInstanceOf[js.Any], sourceHoverSelected = sourceHoverSelected.asInstanceOf[js.Any], sourceSelected = sourceSelected.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderRadius]
  }
}

