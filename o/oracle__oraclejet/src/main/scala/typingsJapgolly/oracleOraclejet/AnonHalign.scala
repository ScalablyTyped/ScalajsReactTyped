package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.middle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHalign extends js.Object {
  var halign: start | end | center
  var height: Double
  var rendered: on | off
  var valign: top | bottom | middle
  var width: Double
}

object AnonHalign {
  @scala.inline
  def apply(
    halign: start | end | center,
    height: Double,
    rendered: on | off,
    valign: top | bottom | middle,
    width: Double
  ): AnonHalign = {
    val __obj = js.Dynamic.literal(halign = halign.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHalign]
  }
}

