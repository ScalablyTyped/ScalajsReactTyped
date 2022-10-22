package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentTemplateVersionsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next major or minor version in the array of major or minor versions of an environment template, after the list of major or minor versions that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of major or minor versions of an environment template detail data.
    */
  var templateVersions: EnvironmentTemplateVersionSummaryList
}
object ListEnvironmentTemplateVersionsOutput {
  
  inline def apply(templateVersions: EnvironmentTemplateVersionSummaryList): ListEnvironmentTemplateVersionsOutput = {
    val __obj = js.Dynamic.literal(templateVersions = templateVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentTemplateVersionsOutput]
  }
  
  extension [Self <: ListEnvironmentTemplateVersionsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateVersions(value: EnvironmentTemplateVersionSummaryList): Self = StObject.set(x, "templateVersions", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionsVarargs(value: EnvironmentTemplateVersionSummary*): Self = StObject.set(x, "templateVersions", js.Array(value*))
  }
}
