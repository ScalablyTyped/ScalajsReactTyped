package typingsJapgolly.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
}
object `122` {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
  ): `122` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.ExtractOctokitResponse<@octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/codespaces/secrets']['get']>['data']['secrets'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
