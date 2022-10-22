package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachinesTotalcount extends StObject {
  
  var machines: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace-machine'] */ js.Any
  ]
  
  var total_count: Double
}
object MachinesTotalcount {
  
  inline def apply(
    machines: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace-machine'] */ js.Any
    ],
    total_count: Double
  ): MachinesTotalcount = {
    val __obj = js.Dynamic.literal(machines = machines.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachinesTotalcount]
  }
  
  extension [Self <: MachinesTotalcount](x: Self) {
    
    inline def setMachines(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace-machine'] */ js.Any
        ]
    ): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    inline def setMachinesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['codespace-machine'] */ js.Any)*
    ): Self = StObject.set(x, "machines", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
