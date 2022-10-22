package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotOutput extends StObject {
  
  /**
    * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon Elastic Compute Cloud API DescribeSnapshots) or creating a volume from a snapshot (CreateStorediSCSIVolume).
    */
  var SnapshotId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
    */
  var VolumeARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
}
object CreateSnapshotOutput {
  
  inline def apply(): CreateSnapshotOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotOutput]
  }
  
  extension [Self <: CreateSnapshotOutput](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
