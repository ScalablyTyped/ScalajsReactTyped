package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceivedLicensesResponse extends StObject {
  
  /**
    * Received license details.
    */
  var Licenses: js.UndefOr[GrantedLicenseList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReceivedLicensesResponse {
  
  inline def apply(): ListReceivedLicensesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceivedLicensesResponse]
  }
  
  extension [Self <: ListReceivedLicensesResponse](x: Self) {
    
    inline def setLicenses(value: GrantedLicenseList): Self = StObject.set(x, "Licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "Licenses", js.undefined)
    
    inline def setLicensesVarargs(value: GrantedLicense*): Self = StObject.set(x, "Licenses", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
