package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  var guid: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-guid'] */ js.Any
  ] = js.undefined
  
  var name: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-name'] */ js.Any
  ] = js.undefined
  
  var version: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-version'] */ js.Any
  ] = js.undefined
}
object Version {
  
  inline def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setGuid(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-guid'] */ js.Any
    ): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-name'] */ js.Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool-version'] */ js.Any
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
