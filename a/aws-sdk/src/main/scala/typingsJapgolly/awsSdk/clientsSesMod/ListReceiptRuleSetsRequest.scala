package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceiptRuleSetsRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.NextToken] = js.undefined
}
object ListReceiptRuleSetsRequest {
  
  inline def apply(): ListReceiptRuleSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsRequest]
  }
  
  extension [Self <: ListReceiptRuleSetsRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
