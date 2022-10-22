package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.setExtremes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisSetExtremesEventObject
  extends StObject
     with ExtremesObject {
  
  var preventDefault: js.Function
  
  var target: SVGElement
  
  var trigger: String | AxisExtremesTriggerValue
  
  var `type`: setExtremes
}
object AxisSetExtremesEventObject {
  
  inline def apply(
    dataMax: Double,
    dataMin: Double,
    max: Double,
    min: Double,
    preventDefault: js.Function,
    target: SVGElement,
    trigger: String | AxisExtremesTriggerValue,
    userMax: Double,
    userMin: Double
  ): AxisSetExtremesEventObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setExtremes")
    __obj.asInstanceOf[AxisSetExtremesEventObject]
  }
  
  extension [Self <: AxisSetExtremesEventObject](x: Self) {
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SVGElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String | AxisExtremesTriggerValue): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setType(value: setExtremes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
