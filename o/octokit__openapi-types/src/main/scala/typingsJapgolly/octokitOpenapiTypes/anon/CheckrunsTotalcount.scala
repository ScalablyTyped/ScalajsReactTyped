package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckrunsTotalcount extends StObject {
  
  var check_runs: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['check-run'] */ js.Any
  ]
  
  var total_count: Double
}
object CheckrunsTotalcount {
  
  inline def apply(
    check_runs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['check-run'] */ js.Any
    ],
    total_count: Double
  ): CheckrunsTotalcount = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckrunsTotalcount]
  }
  
  extension [Self <: CheckrunsTotalcount](x: Self) {
    
    inline def setCheck_runs(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['check-run'] */ js.Any
        ]
    ): Self = StObject.set(x, "check_runs", value.asInstanceOf[js.Any])
    
    inline def setCheck_runsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['check-run'] */ js.Any)*
    ): Self = StObject.set(x, "check_runs", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
