package typingsJapgolly.octokitPluginPaginateRest.anon

import typingsJapgolly.octokitTypes.distTypesGeneratedEndpointsMod.ExtractOctokitResponse
import typingsJapgolly.octokitTypes.distTypesGeneratedEndpointsMod.RequiredPreview
import typingsJapgolly.octokitTypes.distTypesGeneratedEndpointsMod.ToOctokitParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var parameters: (ToOctokitParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
  ]) & RequiredPreview[Any]
  
  var response: ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
  ]
}
object `228` {
  
  inline def apply(
    parameters: (ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
    ]) & RequiredPreview[Any],
    response: ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
    ]
  ): `228` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setParameters(
      value: (ToOctokitParameters[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
        ]) & RequiredPreview[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/user/marketplace_purchases']['get'] */ js.Any
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
