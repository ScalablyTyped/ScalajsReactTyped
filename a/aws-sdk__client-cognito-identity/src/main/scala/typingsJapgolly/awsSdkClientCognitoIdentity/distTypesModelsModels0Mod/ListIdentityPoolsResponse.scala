package typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoolsResponse extends StObject {
  
  /**
    * <p>The identity pools returned by the ListIdentityPools action.</p>
    */
  var IdentityPools: js.UndefOr[js.Array[IdentityPoolShortDescription]] = js.undefined
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityPoolsResponse {
  
  inline def apply(): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
  
  extension [Self <: ListIdentityPoolsResponse](x: Self) {
    
    inline def setIdentityPools(value: js.Array[IdentityPoolShortDescription]): Self = StObject.set(x, "IdentityPools", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolsUndefined: Self = StObject.set(x, "IdentityPools", js.undefined)
    
    inline def setIdentityPoolsVarargs(value: IdentityPoolShortDescription*): Self = StObject.set(x, "IdentityPools", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
