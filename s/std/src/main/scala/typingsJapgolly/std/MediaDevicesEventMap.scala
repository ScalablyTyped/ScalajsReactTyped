package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevicesEventMap extends StObject {
  
  /* standard dom */
  var devicechange: org.scalajs.dom.Event
}
object MediaDevicesEventMap {
  
  inline def apply(devicechange: org.scalajs.dom.Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  extension [Self <: MediaDevicesEventMap](x: Self) {
    
    inline def setDevicechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
