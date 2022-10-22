package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.maximMazurokGapiClientCompute.anon.DiskGb
import typingsJapgolly.maximMazurokGapiClientCompute.anon.GuestAcceleratorCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineType extends StObject {
  
  /** [Output Only] A list of accelerator configurations assigned to this machine type. */
  var accelerators: js.UndefOr[js.Array[GuestAcceleratorCount]] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The deprecation status associated with this machine type. Only applicable if the machine type is unavailable. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  
  /** [Output Only] An optional textual description of the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The number of virtual CPUs that are available to the instance. */
  var guestCpus: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Deprecated] This property is deprecated and will never be populated with any relevant values. */
  var imageSpaceGb: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for more information. */
  var isSharedCpu: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] The type of the resource. Always compute#machineType for machine types. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Maximum persistent disks allowed. */
  var maximumPersistentDisks: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Maximum total persistent disks size (GB) allowed. */
  var maximumPersistentDisksSizeGb: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The amount of physical memory available to the instance, defined in MB. */
  var memoryMb: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A list of extended scratch disks assigned to the instance. */
  var scratchDisks: js.UndefOr[js.Array[DiskGb]] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The name of the zone where the machine type resides, such as us-central1-a. */
  var zone: js.UndefOr[String] = js.undefined
}
object MachineType {
  
  inline def apply(): MachineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineType]
  }
  
  extension [Self <: MachineType](x: Self) {
    
    inline def setAccelerators(value: js.Array[GuestAcceleratorCount]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: GuestAcceleratorCount*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeprecated(value: DeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuestCpus(value: Double): Self = StObject.set(x, "guestCpus", value.asInstanceOf[js.Any])
    
    inline def setGuestCpusUndefined: Self = StObject.set(x, "guestCpus", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageSpaceGb(value: Double): Self = StObject.set(x, "imageSpaceGb", value.asInstanceOf[js.Any])
    
    inline def setImageSpaceGbUndefined: Self = StObject.set(x, "imageSpaceGb", js.undefined)
    
    inline def setIsSharedCpu(value: Boolean): Self = StObject.set(x, "isSharedCpu", value.asInstanceOf[js.Any])
    
    inline def setIsSharedCpuUndefined: Self = StObject.set(x, "isSharedCpu", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaximumPersistentDisks(value: Double): Self = StObject.set(x, "maximumPersistentDisks", value.asInstanceOf[js.Any])
    
    inline def setMaximumPersistentDisksSizeGb(value: String): Self = StObject.set(x, "maximumPersistentDisksSizeGb", value.asInstanceOf[js.Any])
    
    inline def setMaximumPersistentDisksSizeGbUndefined: Self = StObject.set(x, "maximumPersistentDisksSizeGb", js.undefined)
    
    inline def setMaximumPersistentDisksUndefined: Self = StObject.set(x, "maximumPersistentDisks", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScratchDisks(value: js.Array[DiskGb]): Self = StObject.set(x, "scratchDisks", value.asInstanceOf[js.Any])
    
    inline def setScratchDisksUndefined: Self = StObject.set(x, "scratchDisks", js.undefined)
    
    inline def setScratchDisksVarargs(value: DiskGb*): Self = StObject.set(x, "scratchDisks", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
