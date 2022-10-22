package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  var WorkloadArn: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadArn
}
object ListTagsForResourceInput {
  
  inline def apply(WorkloadArn: WorkloadArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(WorkloadArn = WorkloadArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  extension [Self <: ListTagsForResourceInput](x: Self) {
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
  }
}
