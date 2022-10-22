package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientationSensor
  extends StObject
     with IOrientationSensor
object OrientationSensor {
  
  inline def apply(
    getCurrentReading: CallbackTo[OrientationSensorReading],
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): OrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading.toJsFn, minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensor]
  }
}
