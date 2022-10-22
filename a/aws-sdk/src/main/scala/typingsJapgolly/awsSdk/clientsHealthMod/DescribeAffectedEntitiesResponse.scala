package typingsJapgolly.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAffectedEntitiesResponse extends StObject {
  
  /**
    * The entities that match the filter criteria.
    */
  var entities: js.UndefOr[EntityList] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthMod.nextToken] = js.undefined
}
object DescribeAffectedEntitiesResponse {
  
  inline def apply(): DescribeAffectedEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedEntitiesResponse]
  }
  
  extension [Self <: DescribeAffectedEntitiesResponse](x: Self) {
    
    inline def setEntities(value: EntityList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: AffectedEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
