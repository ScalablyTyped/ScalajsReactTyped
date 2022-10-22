package typingsJapgolly.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInfo extends StObject {
  
  /** Device hardware version. */
  var hwVersion: js.UndefOr[String] = js.undefined
  
  /** Device manufacturer. */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /** Device model. */
  var model: js.UndefOr[String] = js.undefined
  
  /** Device software version. */
  var swVersion: js.UndefOr[String] = js.undefined
}
object DeviceInfo {
  
  inline def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setHwVersion(value: String): Self = StObject.set(x, "hwVersion", value.asInstanceOf[js.Any])
    
    inline def setHwVersionUndefined: Self = StObject.set(x, "hwVersion", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSwVersion(value: String): Self = StObject.set(x, "swVersion", value.asInstanceOf[js.Any])
    
    inline def setSwVersionUndefined: Self = StObject.set(x, "swVersion", js.undefined)
  }
}
