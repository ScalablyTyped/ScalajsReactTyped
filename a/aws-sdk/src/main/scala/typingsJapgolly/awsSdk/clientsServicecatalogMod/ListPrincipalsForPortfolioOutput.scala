package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalsForPortfolioOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The IAM principals (users or roles) associated with the portfolio.
    */
  var Principals: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.Principals] = js.undefined
}
object ListPrincipalsForPortfolioOutput {
  
  inline def apply(): ListPrincipalsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
  }
  
  extension [Self <: ListPrincipalsForPortfolioOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPrincipals(value: Principals): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}
