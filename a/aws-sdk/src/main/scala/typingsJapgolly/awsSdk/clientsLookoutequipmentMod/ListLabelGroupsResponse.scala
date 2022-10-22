package typingsJapgolly.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelGroupsResponse extends StObject {
  
  /**
    *  A summary of the label groups. 
    */
  var LabelGroupSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.LabelGroupSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of label groups. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListLabelGroupsResponse {
  
  inline def apply(): ListLabelGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelGroupsResponse]
  }
  
  extension [Self <: ListLabelGroupsResponse](x: Self) {
    
    inline def setLabelGroupSummaries(value: LabelGroupSummaries): Self = StObject.set(x, "LabelGroupSummaries", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupSummariesUndefined: Self = StObject.set(x, "LabelGroupSummaries", js.undefined)
    
    inline def setLabelGroupSummariesVarargs(value: LabelGroupSummary*): Self = StObject.set(x, "LabelGroupSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
