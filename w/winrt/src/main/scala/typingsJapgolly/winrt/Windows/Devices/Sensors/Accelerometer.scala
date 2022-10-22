package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accelerometer
  extends StObject
     with IAccelerometer
object Accelerometer {
  
  inline def apply(
    getCurrentReading: CallbackTo[AccelerometerReading],
    minimumReportInterval: Double,
    onreadingchanged: Any,
    onshaken: Any,
    reportInterval: Double
  ): Accelerometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading.toJsFn, minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], onshaken = onshaken.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accelerometer]
  }
}
