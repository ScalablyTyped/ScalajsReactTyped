package typingsJapgolly.oracleOraclejet.ojformlayoutMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.column
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.row
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.truncate
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFormLayoutSettableProperties extends JetSettableProperties {
  var direction: column | row
  var labelEdge: start | top
  var labelWidth: String
  var labelWrapping: truncate | wrap
  var maxColumns: Double
}

object ojFormLayoutSettableProperties {
  @scala.inline
  def apply(
    direction: column | row,
    labelEdge: start | top,
    labelWidth: String,
    labelWrapping: truncate | wrap,
    maxColumns: Double
  ): ojFormLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], labelWrapping = labelWrapping.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojFormLayoutSettableProperties]
  }
}

