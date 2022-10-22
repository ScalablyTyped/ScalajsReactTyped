package typingsJapgolly.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbideOptions extends StObject {
  
  var error_labels: js.UndefOr[Boolean] = js.undefined
  
  var focus_on_invalid: js.UndefOr[Boolean] = js.undefined
  
  var live_validate: js.UndefOr[Boolean] = js.undefined
  
  var patterns: js.UndefOr[AbidePatterns] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var validate_on_blur: js.UndefOr[Boolean] = js.undefined
  
  var validators: js.UndefOr[js.Object] = js.undefined
}
object AbideOptions {
  
  inline def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  
  extension [Self <: AbideOptions](x: Self) {
    
    inline def setError_labels(value: Boolean): Self = StObject.set(x, "error_labels", value.asInstanceOf[js.Any])
    
    inline def setError_labelsUndefined: Self = StObject.set(x, "error_labels", js.undefined)
    
    inline def setFocus_on_invalid(value: Boolean): Self = StObject.set(x, "focus_on_invalid", value.asInstanceOf[js.Any])
    
    inline def setFocus_on_invalidUndefined: Self = StObject.set(x, "focus_on_invalid", js.undefined)
    
    inline def setLive_validate(value: Boolean): Self = StObject.set(x, "live_validate", value.asInstanceOf[js.Any])
    
    inline def setLive_validateUndefined: Self = StObject.set(x, "live_validate", js.undefined)
    
    inline def setPatterns(value: AbidePatterns): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setValidate_on_blur(value: Boolean): Self = StObject.set(x, "validate_on_blur", value.asInstanceOf[js.Any])
    
    inline def setValidate_on_blurUndefined: Self = StObject.set(x, "validate_on_blur", js.undefined)
    
    inline def setValidators(value: js.Object): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
  }
}
