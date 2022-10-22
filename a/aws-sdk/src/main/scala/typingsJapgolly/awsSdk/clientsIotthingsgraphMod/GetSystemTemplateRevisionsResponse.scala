package typingsJapgolly.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemTemplateRevisionsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that contain summary data about the system template revisions.
    */
  var summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
}
object GetSystemTemplateRevisionsResponse {
  
  inline def apply(): GetSystemTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemTemplateRevisionsResponse]
  }
  
  extension [Self <: GetSystemTemplateRevisionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: SystemTemplateSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: SystemTemplateSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
