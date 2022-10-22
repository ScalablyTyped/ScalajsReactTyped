package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodespacesTotalcount extends StObject {
  
  var codespaces: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace'] */ js.Any
  ]
  
  var total_count: Double
}
object CodespacesTotalcount {
  
  inline def apply(
    codespaces: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace'] */ js.Any
    ],
    total_count: Double
  ): CodespacesTotalcount = {
    val __obj = js.Dynamic.literal(codespaces = codespaces.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodespacesTotalcount]
  }
  
  extension [Self <: CodespacesTotalcount](x: Self) {
    
    inline def setCodespaces(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace'] */ js.Any
        ]
    ): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
    
    inline def setCodespacesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace'] */ js.Any)*
    ): Self = StObject.set(x, "codespaces", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
