package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildidOwner extends StObject {
  
  var build_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
}
object BuildidOwner {
  
  inline def apply(
    build_id: Double,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any,
    repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
  ): BuildidOwner = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildidOwner]
  }
  
  extension [Self <: BuildidOwner](x: Self) {
    
    inline def setBuild_id(value: Double): Self = StObject.set(x, "build_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
    ): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
