package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserEsbuildSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Budget extends StObject {
  
  /**
    * The baseline size for comparison.
    */
  var baseline: js.UndefOr[String] = js.undefined
  
  /**
    * The threshold for error relative to the baseline (min & max).
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum threshold for error relative to the baseline.
    */
  var maximumError: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum threshold for warning relative to the baseline.
    */
  var maximumWarning: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum threshold for error relative to the baseline.
    */
  var minimumError: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum threshold for warning relative to the baseline.
    */
  var minimumWarning: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the bundle.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of budget.
    */
  var `type`: Type
  
  /**
    * The threshold for warning relative to the baseline (min & max).
    */
  var warning: js.UndefOr[String] = js.undefined
}
object Budget {
  
  inline def apply(`type`: Type): Budget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Budget]
  }
  
  extension [Self <: Budget](x: Self) {
    
    inline def setBaseline(value: String): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMaximumError(value: String): Self = StObject.set(x, "maximumError", value.asInstanceOf[js.Any])
    
    inline def setMaximumErrorUndefined: Self = StObject.set(x, "maximumError", js.undefined)
    
    inline def setMaximumWarning(value: String): Self = StObject.set(x, "maximumWarning", value.asInstanceOf[js.Any])
    
    inline def setMaximumWarningUndefined: Self = StObject.set(x, "maximumWarning", js.undefined)
    
    inline def setMinimumError(value: String): Self = StObject.set(x, "minimumError", value.asInstanceOf[js.Any])
    
    inline def setMinimumErrorUndefined: Self = StObject.set(x, "minimumError", js.undefined)
    
    inline def setMinimumWarning(value: String): Self = StObject.set(x, "minimumWarning", value.asInstanceOf[js.Any])
    
    inline def setMinimumWarningUndefined: Self = StObject.set(x, "minimumWarning", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
