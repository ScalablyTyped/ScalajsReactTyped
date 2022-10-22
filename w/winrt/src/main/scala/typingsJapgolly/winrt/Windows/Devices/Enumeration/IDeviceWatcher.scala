package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceWatcher extends StObject {
  
  var onadded: Any
  
  var onenumerationcompleted: Any
  
  var onremoved: Any
  
  var onstopped: Any
  
  var onupdated: Any
  
  def start(): Unit
  
  var status: DeviceWatcherStatus
  
  def stop(): Unit
}
object IDeviceWatcher {
  
  inline def apply(
    onadded: Any,
    onenumerationcompleted: Any,
    onremoved: Any,
    onstopped: Any,
    onupdated: Any,
    start: Callback,
    status: DeviceWatcherStatus,
    stop: Callback
  ): IDeviceWatcher = {
    val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = start.toJsFn, status = status.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[IDeviceWatcher]
  }
  
  extension [Self <: IDeviceWatcher](x: Self) {
    
    inline def setOnadded(value: Any): Self = StObject.set(x, "onadded", value.asInstanceOf[js.Any])
    
    inline def setOnenumerationcompleted(value: Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
    
    inline def setOnremoved(value: Any): Self = StObject.set(x, "onremoved", value.asInstanceOf[js.Any])
    
    inline def setOnstopped(value: Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
    
    inline def setOnupdated(value: Any): Self = StObject.set(x, "onupdated", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStatus(value: DeviceWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
