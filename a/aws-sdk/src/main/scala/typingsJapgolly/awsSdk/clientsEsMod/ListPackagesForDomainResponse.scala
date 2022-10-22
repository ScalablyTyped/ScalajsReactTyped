package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesForDomainResponse extends StObject {
  
  /**
    * List of DomainPackageDetails objects.
    */
  var DomainPackageDetailsList: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.DomainPackageDetailsList] = js.undefined
  
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListPackagesForDomainResponse {
  
  inline def apply(): ListPackagesForDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesForDomainResponse]
  }
  
  extension [Self <: ListPackagesForDomainResponse](x: Self) {
    
    inline def setDomainPackageDetailsList(value: DomainPackageDetailsList): Self = StObject.set(x, "DomainPackageDetailsList", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsListUndefined: Self = StObject.set(x, "DomainPackageDetailsList", js.undefined)
    
    inline def setDomainPackageDetailsListVarargs(value: DomainPackageDetails*): Self = StObject.set(x, "DomainPackageDetailsList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
