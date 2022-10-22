package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceId extends StObject {
  
  /** Value of Build.BRAND. */
  var buildBrand: js.UndefOr[String] = js.undefined
  
  /** Value of Build.DEVICE. */
  var buildDevice: js.UndefOr[String] = js.undefined
}
object DeviceId {
  
  inline def apply(): DeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceId]
  }
  
  extension [Self <: DeviceId](x: Self) {
    
    inline def setBuildBrand(value: String): Self = StObject.set(x, "buildBrand", value.asInstanceOf[js.Any])
    
    inline def setBuildBrandUndefined: Self = StObject.set(x, "buildBrand", js.undefined)
    
    inline def setBuildDevice(value: String): Self = StObject.set(x, "buildDevice", value.asInstanceOf[js.Any])
    
    inline def setBuildDeviceUndefined: Self = StObject.set(x, "buildDevice", js.undefined)
  }
}
