package typingsJapgolly.chartist.distCoreTypesMod

import typingsJapgolly.chartist.distAxesMod.Axis
import typingsJapgolly.chartist.distSvgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chartist.distCoreTypesMod.GridDrawEvent
  - typingsJapgolly.chartist.distCoreTypesMod.GridBackgroundDrawEvent
  - typingsJapgolly.chartist.distCoreTypesMod.LabelDrawEvent
*/
trait AxesDrawEvent extends StObject
object AxesDrawEvent {
  
  inline def GridBackgroundDrawEvent(element: Svg, group: Svg): typingsJapgolly.chartist.distCoreTypesMod.GridBackgroundDrawEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gridBackground")
    __obj.asInstanceOf[typingsJapgolly.chartist.distCoreTypesMod.GridBackgroundDrawEvent]
  }
  
  inline def GridDrawEvent(
    axis: Axis,
    element: Svg,
    group: Svg,
    index: Double,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): typingsJapgolly.chartist.distCoreTypesMod.GridDrawEvent = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("grid")
    __obj.asInstanceOf[typingsJapgolly.chartist.distCoreTypesMod.GridDrawEvent]
  }
  
  inline def LabelDrawEvent(
    axis: Axis,
    element: Svg,
    group: Svg,
    height: Double,
    index: Double,
    text: Label,
    width: Double,
    x: Double,
    y: Double
  ): typingsJapgolly.chartist.distCoreTypesMod.LabelDrawEvent = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typingsJapgolly.chartist.distCoreTypesMod.LabelDrawEvent]
  }
}
