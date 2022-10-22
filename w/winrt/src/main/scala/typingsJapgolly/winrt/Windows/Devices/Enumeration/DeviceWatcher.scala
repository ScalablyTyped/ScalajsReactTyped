package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceWatcher
  extends StObject
     with IDeviceWatcher
object DeviceWatcher {
  
  inline def apply(
    onadded: Any,
    onenumerationcompleted: Any,
    onremoved: Any,
    onstopped: Any,
    onupdated: Any,
    start: Callback,
    status: DeviceWatcherStatus,
    stop: Callback
  ): DeviceWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = start.toJsFn, status = status.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[DeviceWatcher]
  }
}
