package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensReviewInput extends StObject {
  
  var LensAlias: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var MilestoneNumber: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object GetLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, WorkloadId: WorkloadId): GetLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLensReviewInput]
  }
  
  extension [Self <: GetLensReviewInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
