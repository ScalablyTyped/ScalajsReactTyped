package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultParametersResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of parameters. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}
object DescribeDefaultParametersResponse {
  
  inline def apply(): DescribeDefaultParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultParametersResponse]
  }
  
  extension [Self <: DescribeDefaultParametersResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameters(value: ParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
