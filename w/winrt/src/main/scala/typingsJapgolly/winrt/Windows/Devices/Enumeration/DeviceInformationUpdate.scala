package typingsJapgolly.winrt.Windows.Devices.Enumeration

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInformationUpdate
  extends StObject
     with IDeviceInformationUpdate
object DeviceInformationUpdate {
  
  inline def apply(id: String, properties: IMapView[String, Any]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
}
