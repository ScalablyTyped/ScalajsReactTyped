package typingsJapgolly.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontWeightLetterSpacing extends js.Object {
  @JSName("@media (min-width: 42rem)")
  var `@media Leftparenthesismin-widthColon 42remRightparenthesis`: AnonFontWeight
  @JSName("@media (min-width: 66rem)")
  var `@media Leftparenthesismin-widthColon 66remRightparenthesis`: AnonFontFamily
  @JSName("@media (min-width: 82rem)")
  var `@media Leftparenthesismin-widthColon 82remRightparenthesis`: AnonFontFamily
  @JSName("@media (min-width: 99rem)")
  var `@media Leftparenthesismin-widthColon 99remRightparenthesis`: AnonFontFamily
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: Double
  var lineHeight: String
}

object AnonFontWeightLetterSpacing {
  @scala.inline
  def apply(
    `@media Leftparenthesismin-widthColon 42remRightparenthesis`: AnonFontWeight,
    `@media Leftparenthesismin-widthColon 66remRightparenthesis`: AnonFontFamily,
    `@media Leftparenthesismin-widthColon 82remRightparenthesis`: AnonFontFamily,
    `@media Leftparenthesismin-widthColon 99remRightparenthesis`: AnonFontFamily,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): AnonFontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 42rem)")(`@media Leftparenthesismin-widthColon 42remRightparenthesis`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 66rem)")(`@media Leftparenthesismin-widthColon 66remRightparenthesis`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 82rem)")(`@media Leftparenthesismin-widthColon 82remRightparenthesis`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 99rem)")(`@media Leftparenthesismin-widthColon 99remRightparenthesis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontWeightLetterSpacing]
  }
}

