package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `494` extends StObject {
  
  /**
    * @description The id of the user or team who can review the deployment
    * @example 4532992
    */
  var id: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-reviewer-type'] */ js.Any
  ] = js.undefined
}
object `494` {
  
  inline def apply(): `494` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`494`]
  }
  
  extension [Self <: `494`](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-reviewer-type'] */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
