package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationjsonsarif extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis'] */ js.Any
  
  @JSName("application/json+sarif")
  var applicationSlashjsonPlussignsarif: StringDictionary[Any]
}
object ApplicationjsonApplicationjsonsarif {
  
  inline def apply(
    applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis'] */ js.Any,
    applicationSlashjsonPlussignsarif: StringDictionary[Any]
  ): ApplicationjsonApplicationjsonsarif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/json+sarif")(applicationSlashjsonPlussignsarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationjsonsarif]
  }
  
  extension [Self <: ApplicationjsonApplicationjsonsarif](x: Self) {
    
    inline def setApplicationSlashjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis'] */ js.Any
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonPlussignsarif(value: StringDictionary[Any]): Self = StObject.set(x, "application/json+sarif", value.asInstanceOf[js.Any])
  }
}
