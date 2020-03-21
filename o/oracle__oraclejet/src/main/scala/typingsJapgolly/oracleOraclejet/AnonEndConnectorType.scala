package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndConnectorType extends js.Object {
  var color: String
  var endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var labelStyle: js.Object
  var startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object AnonEndConnectorType {
  @scala.inline
  def apply(
    color: String,
    endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    labelStyle: js.Object,
    startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): AnonEndConnectorType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endConnectorType = endConnectorType.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], startConnectorType = startConnectorType.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndConnectorType]
  }
}

