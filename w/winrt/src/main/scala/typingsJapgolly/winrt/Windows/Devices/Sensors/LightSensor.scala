package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightSensor
  extends StObject
     with ILightSensor
object LightSensor {
  
  inline def apply(
    getCurrentReading: CallbackTo[LightSensorReading],
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): LightSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading.toJsFn, minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensor]
  }
}
