package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEnvironmentCatalog extends StObject {
  
  /** Supported Android devices. */
  var androidDeviceCatalog: js.UndefOr[AndroidDeviceCatalog] = js.undefined
  
  /** The IP blocks used by devices in the test environment. */
  var deviceIpBlockCatalog: js.UndefOr[DeviceIpBlockCatalog] = js.undefined
  
  /** Supported iOS devices. */
  var iosDeviceCatalog: js.UndefOr[IosDeviceCatalog] = js.undefined
  
  /** Supported network configurations. */
  var networkConfigurationCatalog: js.UndefOr[NetworkConfigurationCatalog] = js.undefined
  
  /** The software test environment provided by TestExecutionService. */
  var softwareCatalog: js.UndefOr[ProvidedSoftwareCatalog] = js.undefined
}
object TestEnvironmentCatalog {
  
  inline def apply(): TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEnvironmentCatalog]
  }
  
  extension [Self <: TestEnvironmentCatalog](x: Self) {
    
    inline def setAndroidDeviceCatalog(value: AndroidDeviceCatalog): Self = StObject.set(x, "androidDeviceCatalog", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceCatalogUndefined: Self = StObject.set(x, "androidDeviceCatalog", js.undefined)
    
    inline def setDeviceIpBlockCatalog(value: DeviceIpBlockCatalog): Self = StObject.set(x, "deviceIpBlockCatalog", value.asInstanceOf[js.Any])
    
    inline def setDeviceIpBlockCatalogUndefined: Self = StObject.set(x, "deviceIpBlockCatalog", js.undefined)
    
    inline def setIosDeviceCatalog(value: IosDeviceCatalog): Self = StObject.set(x, "iosDeviceCatalog", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceCatalogUndefined: Self = StObject.set(x, "iosDeviceCatalog", js.undefined)
    
    inline def setNetworkConfigurationCatalog(value: NetworkConfigurationCatalog): Self = StObject.set(x, "networkConfigurationCatalog", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationCatalogUndefined: Self = StObject.set(x, "networkConfigurationCatalog", js.undefined)
    
    inline def setSoftwareCatalog(value: ProvidedSoftwareCatalog): Self = StObject.set(x, "softwareCatalog", value.asInstanceOf[js.Any])
    
    inline def setSoftwareCatalogUndefined: Self = StObject.set(x, "softwareCatalog", js.undefined)
  }
}
