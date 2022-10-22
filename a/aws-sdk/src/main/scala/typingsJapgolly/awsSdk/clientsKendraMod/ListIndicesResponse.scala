package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesResponse extends StObject {
  
  /**
    * An array of summary information on the configuration of one or more indexes.
    */
  var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of indexes.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListIndicesResponse {
  
  inline def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  
  extension [Self <: ListIndicesResponse](x: Self) {
    
    inline def setIndexConfigurationSummaryItems(value: IndexConfigurationSummaryList): Self = StObject.set(x, "IndexConfigurationSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigurationSummaryItemsUndefined: Self = StObject.set(x, "IndexConfigurationSummaryItems", js.undefined)
    
    inline def setIndexConfigurationSummaryItemsVarargs(value: IndexConfigurationSummary*): Self = StObject.set(x, "IndexConfigurationSummaryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
