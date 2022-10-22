package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  */
trait AzureDiskVolumeSource extends StObject {
  
  /**
    * cachingMode is the Host Caching mode: None, Read Only, Read Write.
    */
  var cachingMode: String
  
  /**
    * diskName is the Name of the data disk in the blob storage
    */
  var diskName: String
  
  /**
    * diskURI is the URI of data disk in the blob storage
    */
  var diskURI: String
  
  /**
    * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String
  
  /**
    * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
    */
  var kind: String
  
  /**
    * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
}
object AzureDiskVolumeSource {
  
  inline def apply(
    cachingMode: String,
    diskName: String,
    diskURI: String,
    fsType: String,
    kind: String,
    readOnly: Boolean
  ): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(cachingMode = cachingMode.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
  
  extension [Self <: AzureDiskVolumeSource](x: Self) {
    
    inline def setCachingMode(value: String): Self = StObject.set(x, "cachingMode", value.asInstanceOf[js.Any])
    
    inline def setDiskName(value: String): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setDiskURI(value: String): Self = StObject.set(x, "diskURI", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
