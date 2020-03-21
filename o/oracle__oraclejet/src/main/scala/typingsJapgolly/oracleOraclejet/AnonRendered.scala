package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRendered extends js.Object {
  var color: String
  var rendered: off | auto
}

object AnonRendered {
  @scala.inline
  def apply(color: String, rendered: off | auto): AnonRendered = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRendered]
  }
}

