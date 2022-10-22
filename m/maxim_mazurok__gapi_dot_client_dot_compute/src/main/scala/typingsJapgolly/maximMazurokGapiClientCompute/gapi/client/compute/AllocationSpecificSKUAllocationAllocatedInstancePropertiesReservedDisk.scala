package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends StObject {
  
  /** Specifies the size of the disk in base-2 GB. */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD
    * performance.
    */
  var interface: js.UndefOr[String] = js.undefined
}
object AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk {
  
  inline def apply(): AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  }
  
  extension [Self <: AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
  }
}
