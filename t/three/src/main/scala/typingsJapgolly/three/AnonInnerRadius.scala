package typingsJapgolly.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInnerRadius extends js.Object {
  var innerRadius: Double
  var outerRadius: Double
  var phiSegments: Double
  var thetaLength: Double
  var thetaSegments: Double
  var thetaStart: Double
}

object AnonInnerRadius {
  @scala.inline
  def apply(
    innerRadius: Double,
    outerRadius: Double,
    phiSegments: Double,
    thetaLength: Double,
    thetaSegments: Double,
    thetaStart: Double
  ): AnonInnerRadius = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], phiSegments = phiSegments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaSegments = thetaSegments.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInnerRadius]
  }
}

