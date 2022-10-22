package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSVolumeConfiguration extends StObject {
  
  /**
    * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to false. If it's set to true, all tags for the volume are copied to snapshots where the user doesn't specify tags. If this value is true and you specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
    */
  var CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined
  
  /**
    * Specifies the method used to compress the data on the volume. The compression type is NONE by default.    NONE - Doesn't compress the data on the volume. NONE is the default.    ZSTD - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.    LZ4 - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.  
    */
  var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined
  
  /**
    * The configuration object for mounting a Network File System (NFS) file system.
    */
  var NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined
  
  /**
    * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
    */
  var OriginSnapshot: js.UndefOr[OpenZFSOriginSnapshotConfiguration] = js.undefined
  
  /**
    * The ID of the parent volume.
    */
  var ParentVolumeId: js.UndefOr[VolumeId] = js.undefined
  
  /**
    * A Boolean value indicating whether the volume is read-only.
    */
  var ReadOnly: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ReadOnly] = js.undefined
  
  /**
    * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. For guidance on when to set a custom record size, see the Amazon FSx for OpenZFS User Guide.
    */
  var RecordSizeKiB: js.UndefOr[IntegerRecordSizeKiB] = js.undefined
  
  /**
    * The maximum amount of storage in gibibtyes (GiB) that the volume can use from its parent. You can specify a quota larger than the storage on the parent volume.
    */
  var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax] = js.undefined
  
  /**
    * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than the parent volume has reserved.
    */
  var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax] = js.undefined
  
  /**
    * An object specifying how much storage users or groups can use on the volume.
    */
  var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
  
  /**
    * The path to the volume from the root volume. For example, fsx/parentVolume/volume1.
    */
  var VolumePath: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.VolumePath] = js.undefined
}
object OpenZFSVolumeConfiguration {
  
  inline def apply(): OpenZFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenZFSVolumeConfiguration]
  }
  
  extension [Self <: OpenZFSVolumeConfiguration](x: Self) {
    
    inline def setCopyTagsToSnapshots(value: Flag): Self = StObject.set(x, "CopyTagsToSnapshots", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotsUndefined: Self = StObject.set(x, "CopyTagsToSnapshots", js.undefined)
    
    inline def setDataCompressionType(value: OpenZFSDataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setNfsExports(value: OpenZFSNfsExports): Self = StObject.set(x, "NfsExports", value.asInstanceOf[js.Any])
    
    inline def setNfsExportsUndefined: Self = StObject.set(x, "NfsExports", js.undefined)
    
    inline def setNfsExportsVarargs(value: OpenZFSNfsExport*): Self = StObject.set(x, "NfsExports", js.Array(value*))
    
    inline def setOriginSnapshot(value: OpenZFSOriginSnapshotConfiguration): Self = StObject.set(x, "OriginSnapshot", value.asInstanceOf[js.Any])
    
    inline def setOriginSnapshotUndefined: Self = StObject.set(x, "OriginSnapshot", js.undefined)
    
    inline def setParentVolumeId(value: VolumeId): Self = StObject.set(x, "ParentVolumeId", value.asInstanceOf[js.Any])
    
    inline def setParentVolumeIdUndefined: Self = StObject.set(x, "ParentVolumeId", js.undefined)
    
    inline def setReadOnly(value: ReadOnly): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRecordSizeKiB(value: IntegerRecordSizeKiB): Self = StObject.set(x, "RecordSizeKiB", value.asInstanceOf[js.Any])
    
    inline def setRecordSizeKiBUndefined: Self = StObject.set(x, "RecordSizeKiB", js.undefined)
    
    inline def setStorageCapacityQuotaGiB(value: IntegerNoMax): Self = StObject.set(x, "StorageCapacityQuotaGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityQuotaGiBUndefined: Self = StObject.set(x, "StorageCapacityQuotaGiB", js.undefined)
    
    inline def setStorageCapacityReservationGiB(value: IntegerNoMax): Self = StObject.set(x, "StorageCapacityReservationGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityReservationGiBUndefined: Self = StObject.set(x, "StorageCapacityReservationGiB", js.undefined)
    
    inline def setUserAndGroupQuotas(value: OpenZFSUserAndGroupQuotas): Self = StObject.set(x, "UserAndGroupQuotas", value.asInstanceOf[js.Any])
    
    inline def setUserAndGroupQuotasUndefined: Self = StObject.set(x, "UserAndGroupQuotas", js.undefined)
    
    inline def setUserAndGroupQuotasVarargs(value: OpenZFSUserOrGroupQuota*): Self = StObject.set(x, "UserAndGroupQuotas", js.Array(value*))
    
    inline def setVolumePath(value: VolumePath): Self = StObject.set(x, "VolumePath", value.asInstanceOf[js.Any])
    
    inline def setVolumePathUndefined: Self = StObject.set(x, "VolumePath", js.undefined)
  }
}
