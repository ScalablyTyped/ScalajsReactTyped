package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveFindingsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The IDs of the findings that you want to archive.
    */
  var FindingIds: typingsJapgolly.awsSdk.clientsGuarddutyMod.FindingIds
}
object ArchiveFindingsRequest {
  
  inline def apply(DetectorId: DetectorId, FindingIds: FindingIds): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
  
  extension [Self <: ArchiveFindingsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value*))
  }
}
