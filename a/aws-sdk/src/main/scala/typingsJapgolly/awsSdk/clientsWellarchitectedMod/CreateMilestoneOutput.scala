package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMilestoneOutput extends StObject {
  
  var MilestoneNumber: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var WorkloadId: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object CreateMilestoneOutput {
  
  inline def apply(): CreateMilestoneOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMilestoneOutput]
  }
  
  extension [Self <: CreateMilestoneOutput](x: Self) {
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
