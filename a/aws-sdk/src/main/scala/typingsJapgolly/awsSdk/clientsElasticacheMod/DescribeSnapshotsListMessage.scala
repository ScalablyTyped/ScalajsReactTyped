package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsListMessage extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of snapshots. Each item in the list contains detailed information about one snapshot.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}
object DescribeSnapshotsListMessage {
  
  inline def apply(): DescribeSnapshotsListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsListMessage]
  }
  
  extension [Self <: DescribeSnapshotsListMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSnapshots(value: SnapshotList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}
