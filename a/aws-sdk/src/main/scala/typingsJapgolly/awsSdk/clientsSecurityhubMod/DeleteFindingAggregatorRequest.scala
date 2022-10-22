package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFindingAggregatorRequest extends StObject {
  
  /**
    * The ARN of the finding aggregator to delete. To obtain the ARN, use ListFindingAggregators.
    */
  var FindingAggregatorArn: NonEmptyString
}
object DeleteFindingAggregatorRequest {
  
  inline def apply(FindingAggregatorArn: NonEmptyString): DeleteFindingAggregatorRequest = {
    val __obj = js.Dynamic.literal(FindingAggregatorArn = FindingAggregatorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFindingAggregatorRequest]
  }
  
  extension [Self <: DeleteFindingAggregatorRequest](x: Self) {
    
    inline def setFindingAggregatorArn(value: NonEmptyString): Self = StObject.set(x, "FindingAggregatorArn", value.asInstanceOf[js.Any])
  }
}
