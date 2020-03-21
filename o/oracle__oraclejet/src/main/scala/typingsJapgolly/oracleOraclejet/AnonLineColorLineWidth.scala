package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineColorLineWidth extends js.Object {
  var lineColor: String
  var lineWidth: Double
  var rendered: on | off | auto
}

object AnonLineColorLineWidth {
  @scala.inline
  def apply(lineColor: String, lineWidth: Double, rendered: on | off | auto): AnonLineColorLineWidth = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLineColorLineWidth]
  }
}

