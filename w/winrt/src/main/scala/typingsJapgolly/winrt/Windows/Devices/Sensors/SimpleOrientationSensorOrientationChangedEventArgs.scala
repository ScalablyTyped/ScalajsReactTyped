package typingsJapgolly.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleOrientationSensorOrientationChangedEventArgs
  extends StObject
     with ISimpleOrientationSensorOrientationChangedEventArgs
object SimpleOrientationSensorOrientationChangedEventArgs {
  
  inline def apply(orientation: SimpleOrientation, timestamp: js.Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
}
