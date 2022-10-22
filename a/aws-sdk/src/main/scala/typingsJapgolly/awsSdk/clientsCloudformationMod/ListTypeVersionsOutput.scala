package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypeVersionsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of TypeVersionSummary structures that contain information about the specified extension's versions.
    */
  var TypeVersionSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.TypeVersionSummaries] = js.undefined
}
object ListTypeVersionsOutput {
  
  inline def apply(): ListTypeVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsOutput]
  }
  
  extension [Self <: ListTypeVersionsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTypeVersionSummaries(value: TypeVersionSummaries): Self = StObject.set(x, "TypeVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionSummariesUndefined: Self = StObject.set(x, "TypeVersionSummaries", js.undefined)
    
    inline def setTypeVersionSummariesVarargs(value: TypeVersionSummary*): Self = StObject.set(x, "TypeVersionSummaries", js.Array(value*))
  }
}
