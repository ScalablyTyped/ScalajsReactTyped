package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gyrometer
  extends StObject
     with IGyrometer
object Gyrometer {
  
  inline def apply(
    getCurrentReading: CallbackTo[GyrometerReading],
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): Gyrometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading.toJsFn, minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gyrometer]
  }
}
