package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableFastSnapshotRestoresRequest extends StObject {
  
  /**
    * One or more Availability Zones. For example, us-east-2a.
    */
  var AvailabilityZones: AvailabilityZoneStringList
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more snapshots. For example, snap-1234567890abcdef0. You can specify a snapshot that was shared with you from another Amazon Web Services account.
    */
  var SourceSnapshotIds: SnapshotIdStringList
}
object EnableFastSnapshotRestoresRequest {
  
  inline def apply(AvailabilityZones: AvailabilityZoneStringList, SourceSnapshotIds: SnapshotIdStringList): EnableFastSnapshotRestoresRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], SourceSnapshotIds = SourceSnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoresRequest]
  }
  
  extension [Self <: EnableFastSnapshotRestoresRequest](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSourceSnapshotIds(value: SnapshotIdStringList): Self = StObject.set(x, "SourceSnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SourceSnapshotIds", js.Array(value*))
  }
}
