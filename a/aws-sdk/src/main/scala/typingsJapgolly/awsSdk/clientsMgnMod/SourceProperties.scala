package typingsJapgolly.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceProperties extends StObject {
  
  /**
    * Source Server CPUs.
    */
  var cpus: js.UndefOr[Cpus] = js.undefined
  
  /**
    * Source Server disks.
    */
  var disks: js.UndefOr[Disks] = js.undefined
  
  /**
    * Source server identification hints.
    */
  var identificationHints: js.UndefOr[IdentificationHints] = js.undefined
  
  /**
    * Source server last update date and time.
    */
  var lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Source server network interfaces.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    * Source server OS.
    */
  var os: js.UndefOr[OS] = js.undefined
  
  /**
    * Source server RAM in bytes.
    */
  var ramBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Source server recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[EC2InstanceType] = js.undefined
}
object SourceProperties {
  
  inline def apply(): SourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceProperties]
  }
  
  extension [Self <: SourceProperties](x: Self) {
    
    inline def setCpus(value: Cpus): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setCpusVarargs(value: CPU*): Self = StObject.set(x, "cpus", js.Array(value*))
    
    inline def setDisks(value: Disks): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setIdentificationHints(value: IdentificationHints): Self = StObject.set(x, "identificationHints", value.asInstanceOf[js.Any])
    
    inline def setIdentificationHintsUndefined: Self = StObject.set(x, "identificationHints", js.undefined)
    
    inline def setLastUpdatedDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setRamBytes(value: PositiveInteger): Self = StObject.set(x, "ramBytes", value.asInstanceOf[js.Any])
    
    inline def setRamBytesUndefined: Self = StObject.set(x, "ramBytes", js.undefined)
    
    inline def setRecommendedInstanceType(value: EC2InstanceType): Self = StObject.set(x, "recommendedInstanceType", value.asInstanceOf[js.Any])
    
    inline def setRecommendedInstanceTypeUndefined: Self = StObject.set(x, "recommendedInstanceType", js.undefined)
  }
}
