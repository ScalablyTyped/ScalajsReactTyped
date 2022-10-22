package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isinstalled extends StObject {
  
  var effective_date: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var is_installed: js.UndefOr[Boolean] = js.undefined
  
  var plan: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-listing-plan'] */ js.Any
  ] = js.undefined
  
  var unit_count: js.UndefOr[Double | Null] = js.undefined
}
object Isinstalled {
  
  inline def apply(): Isinstalled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Isinstalled]
  }
  
  extension [Self <: Isinstalled](x: Self) {
    
    inline def setEffective_date(value: String): Self = StObject.set(x, "effective_date", value.asInstanceOf[js.Any])
    
    inline def setEffective_dateUndefined: Self = StObject.set(x, "effective_date", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_installed(value: Boolean): Self = StObject.set(x, "is_installed", value.asInstanceOf[js.Any])
    
    inline def setIs_installedUndefined: Self = StObject.set(x, "is_installed", js.undefined)
    
    inline def setPlan(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-listing-plan'] */ js.Any
    ): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUnit_countNull: Self = StObject.set(x, "unit_count", null)
    
    inline def setUnit_countUndefined: Self = StObject.set(x, "unit_count", js.undefined)
  }
}
