package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupLabelDisplay extends js.Object {
  var groupLabelDisplay: node | off | header
  var header: AnonHoverBackgroundColor
  var hoverColor: String
  var labelDisplay: off | node
  var labelHalign: start | end | center
  var labelMinLength: Double
  var labelStyle: js.Object
  var labelValign: top | bottom | center
  var selectedInnerColor: String
  var selectedOuterColor: String
}

object AnonGroupLabelDisplay {
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: AnonHoverBackgroundColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): AnonGroupLabelDisplay = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroupLabelDisplay]
  }
}

