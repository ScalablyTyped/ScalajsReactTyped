package typingsJapgolly.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesOutput extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupsMod.NextToken] = js.undefined
  
  /**
    * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var QueryErrors: js.UndefOr[QueryErrorList] = js.undefined
  
  /**
    * The ARNs and resource types of resources that are members of the group that you specified.
    */
  var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
}
object SearchResourcesOutput {
  
  inline def apply(): SearchResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesOutput]
  }
  
  extension [Self <: SearchResourcesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryErrors(value: QueryErrorList): Self = StObject.set(x, "QueryErrors", value.asInstanceOf[js.Any])
    
    inline def setQueryErrorsUndefined: Self = StObject.set(x, "QueryErrors", js.undefined)
    
    inline def setQueryErrorsVarargs(value: QueryError*): Self = StObject.set(x, "QueryErrors", js.Array(value*))
    
    inline def setResourceIdentifiers(value: ResourceIdentifierList): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiersUndefined: Self = StObject.set(x, "ResourceIdentifiers", js.undefined)
    
    inline def setResourceIdentifiersVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value*))
  }
}
