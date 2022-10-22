package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANGatewayVersion extends StObject {
  
  /**
    * The model number of the wireless gateway.
    */
  var Model: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.Model] = js.undefined
  
  /**
    * The version of the wireless gateway firmware.
    */
  var PackageVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.PackageVersion] = js.undefined
  
  /**
    * The basic station version of the wireless gateway.
    */
  var Station: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.Station] = js.undefined
}
object LoRaWANGatewayVersion {
  
  inline def apply(): LoRaWANGatewayVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANGatewayVersion]
  }
  
  extension [Self <: LoRaWANGatewayVersion](x: Self) {
    
    inline def setModel(value: Model): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
    
    inline def setStation(value: Station): Self = StObject.set(x, "Station", value.asInstanceOf[js.Any])
    
    inline def setStationUndefined: Self = StObject.set(x, "Station", js.undefined)
  }
}
