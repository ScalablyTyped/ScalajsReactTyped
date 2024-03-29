package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterSnapshotCopyStatus extends StObject {
  
  /**
    * The destination Region that snapshots are automatically copied to when cross-Region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days that manual snapshots are retained in the destination region after they are copied from a source region. If the value is -1, then the manual snapshot is retained indefinitely. Valid values: Either -1 or an integer between 1 and 3,653
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of days to retain automated snapshots in the destination Region after they are copied from a source Region.
    */
  var RetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterSnapshotCopyStatus {
  
  inline def apply(): AwsRedshiftClusterClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSnapshotCopyStatus]
  }
  
  extension [Self <: AwsRedshiftClusterClusterSnapshotCopyStatus](x: Self) {
    
    inline def setDestinationRegion(value: NonEmptyString): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    inline def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
    
    inline def setManualSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setRetentionPeriod(value: Integer): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setSnapshotCopyGrantName(value: NonEmptyString): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "SnapshotCopyGrantName", js.undefined)
  }
}
