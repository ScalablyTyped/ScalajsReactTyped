package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThesauriResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of thesauri. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for a thesaurus or multiple thesauri.
    */
  var ThesaurusSummaryItems: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.ThesaurusSummaryItems] = js.undefined
}
object ListThesauriResponse {
  
  inline def apply(): ListThesauriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThesauriResponse]
  }
  
  extension [Self <: ListThesauriResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setThesaurusSummaryItems(value: ThesaurusSummaryItems): Self = StObject.set(x, "ThesaurusSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setThesaurusSummaryItemsUndefined: Self = StObject.set(x, "ThesaurusSummaryItems", js.undefined)
    
    inline def setThesaurusSummaryItemsVarargs(value: ThesaurusSummary*): Self = StObject.set(x, "ThesaurusSummaryItems", js.Array(value*))
  }
}
