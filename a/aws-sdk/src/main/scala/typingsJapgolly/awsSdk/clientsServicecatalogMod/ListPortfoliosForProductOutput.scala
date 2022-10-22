package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPortfoliosForProductOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.PortfolioDetails] = js.undefined
}
object ListPortfoliosForProductOutput {
  
  inline def apply(): ListPortfoliosForProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortfoliosForProductOutput]
  }
  
  extension [Self <: ListPortfoliosForProductOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPortfolioDetails(value: PortfolioDetails): Self = StObject.set(x, "PortfolioDetails", value.asInstanceOf[js.Any])
    
    inline def setPortfolioDetailsUndefined: Self = StObject.set(x, "PortfolioDetails", js.undefined)
    
    inline def setPortfolioDetailsVarargs(value: PortfolioDetail*): Self = StObject.set(x, "PortfolioDetails", js.Array(value*))
  }
}
