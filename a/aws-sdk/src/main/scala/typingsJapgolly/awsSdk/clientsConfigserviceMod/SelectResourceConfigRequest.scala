package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectResourceConfigRequest extends StObject {
  
  /**
    * The SQL query SELECT command.
    */
  var Expression: typingsJapgolly.awsSdk.clientsConfigserviceMod.Expression
  
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object SelectResourceConfigRequest {
  
  inline def apply(Expression: Expression): SelectResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectResourceConfigRequest]
  }
  
  extension [Self <: SelectResourceConfigRequest](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
