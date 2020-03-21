package typingsJapgolly.leafletDraw.mod.Localization

import typingsJapgolly.leafletDraw.AnonError
import typingsJapgolly.leafletDraw.AnonRadius
import typingsJapgolly.leafletDraw.AnonTooltip
import typingsJapgolly.leafletDraw.AnonTooltipAnonCont
import typingsJapgolly.leafletDraw.AnonTooltipAnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHandlers extends js.Object {
  var circle: AnonRadius
  var circlemarker: AnonTooltip
  var marker: AnonTooltip
  var polygon: AnonTooltipAnonCont
  var polyline: AnonError
  var rectangle: AnonTooltip
  var simpleshape: AnonTooltipAnonEnd
}

object DrawHandlers {
  @scala.inline
  def apply(
    circle: AnonRadius,
    circlemarker: AnonTooltip,
    marker: AnonTooltip,
    polygon: AnonTooltipAnonCont,
    polyline: AnonError,
    rectangle: AnonTooltip,
    simpleshape: AnonTooltipAnonEnd
  ): DrawHandlers = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawHandlers]
  }
}

