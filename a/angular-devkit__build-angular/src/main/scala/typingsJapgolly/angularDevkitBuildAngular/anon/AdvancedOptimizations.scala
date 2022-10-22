package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedOptimizations extends StObject {
  
  var advancedOptimizations: js.UndefOr[Boolean] = js.undefined
  
  var sourcemap: Boolean
  
  var thirdPartySourcemaps: js.UndefOr[Boolean] = js.undefined
  
  var tsconfig: String
}
object AdvancedOptimizations {
  
  inline def apply(sourcemap: Boolean, tsconfig: String): AdvancedOptimizations = {
    val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptimizations]
  }
  
  extension [Self <: AdvancedOptimizations](x: Self) {
    
    inline def setAdvancedOptimizations(value: Boolean): Self = StObject.set(x, "advancedOptimizations", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptimizationsUndefined: Self = StObject.set(x, "advancedOptimizations", js.undefined)
    
    inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setThirdPartySourcemaps(value: Boolean): Self = StObject.set(x, "thirdPartySourcemaps", value.asInstanceOf[js.Any])
    
    inline def setThirdPartySourcemapsUndefined: Self = StObject.set(x, "thirdPartySourcemaps", js.undefined)
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
  }
}
