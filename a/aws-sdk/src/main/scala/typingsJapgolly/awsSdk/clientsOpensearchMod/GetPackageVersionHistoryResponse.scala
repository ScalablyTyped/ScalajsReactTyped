package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionHistoryResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.undefined
  
  var PackageID: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.PackageID] = js.undefined
  
  /**
    * List of PackageVersionHistory objects. 
    */
  var PackageVersionHistoryList: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.PackageVersionHistoryList] = js.undefined
}
object GetPackageVersionHistoryResponse {
  
  inline def apply(): GetPackageVersionHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionHistoryResponse]
  }
  
  extension [Self <: GetPackageVersionHistoryResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageVersionHistoryList(value: PackageVersionHistoryList): Self = StObject.set(x, "PackageVersionHistoryList", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionHistoryListUndefined: Self = StObject.set(x, "PackageVersionHistoryList", js.undefined)
    
    inline def setPackageVersionHistoryListVarargs(value: PackageVersionHistory*): Self = StObject.set(x, "PackageVersionHistoryList", js.Array(value*))
  }
}
