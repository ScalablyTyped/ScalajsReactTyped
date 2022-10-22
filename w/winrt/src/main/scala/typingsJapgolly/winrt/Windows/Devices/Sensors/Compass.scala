package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compass
  extends StObject
     with ICompass
object Compass {
  
  inline def apply(
    getCurrentReading: CallbackTo[CompassReading],
    minimumReportInterval: Double,
    onreadingchanged: Any,
    reportInterval: Double
  ): Compass = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading.toJsFn, minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compass]
  }
}
