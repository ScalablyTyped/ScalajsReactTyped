package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelVersionsResult extends StObject {
  
  /**
    * The model version details.
    */
  var modelVersionDetails: js.UndefOr[modelVersionDetailList] = js.undefined
  
  /**
    * The next token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeModelVersionsResult {
  
  inline def apply(): DescribeModelVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelVersionsResult]
  }
  
  extension [Self <: DescribeModelVersionsResult](x: Self) {
    
    inline def setModelVersionDetails(value: modelVersionDetailList): Self = StObject.set(x, "modelVersionDetails", value.asInstanceOf[js.Any])
    
    inline def setModelVersionDetailsUndefined: Self = StObject.set(x, "modelVersionDetails", js.undefined)
    
    inline def setModelVersionDetailsVarargs(value: ModelVersionDetail*): Self = StObject.set(x, "modelVersionDetails", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
