package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesEbs extends StObject {
  
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support them.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of I/O operations per second (IOPS) to provision for an io1 or io2 volume, with a maximum ratio of 50 IOPS/GiB for io1, and 500 IOPS/GiB for io2. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on instances built on the Nitro System. Other instance families guarantee performance up to 32,000 IOPS. For more information, see Amazon EBS volume types in the Amazon EC2 User Guide. This parameter is valid only for Provisioned IOPS SSD (io1 and io2) volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.SnapshotId] = js.undefined
  
  /**
    * The size of the volume, in GiB. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume type. gp2 for General Purpose SSD, io1 or  io2 for Provisioned IOPS SSD, Throughput Optimized HDD for st1, Cold HDD for sc1, or standard for Magnetic. Default: gp2 
    */
  var VolumeType: js.UndefOr[String] = js.undefined
}
object ScheduledInstancesEbs {
  
  inline def apply(): ScheduledInstancesEbs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesEbs]
  }
  
  extension [Self <: ScheduledInstancesEbs](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
