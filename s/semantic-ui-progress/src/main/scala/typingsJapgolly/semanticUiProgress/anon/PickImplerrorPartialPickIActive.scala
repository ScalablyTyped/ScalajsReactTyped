package typingsJapgolly.semanticUiProgress.anon

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.TextSettings.Param
import typingsJapgolly.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'error'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl>> */
trait PickImplerrorPartialPickIActive
  extends StObject
     with Param {
  
  var active: js.UndefOr[`false` | String] = js.undefined
  
  var error: (`false` | String) & (js.UndefOr[`false` | String])
  
  var percent: js.UndefOr[`false` | String] = js.undefined
  
  var ratio: js.UndefOr[`false` | String] = js.undefined
  
  var success: js.UndefOr[`false` | String] = js.undefined
  
  var warning: js.UndefOr[`false` | String] = js.undefined
}
object PickImplerrorPartialPickIActive {
  
  inline def apply(error: (`false` | String) & (js.UndefOr[`false` | String])): PickImplerrorPartialPickIActive = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorPartialPickIActive]
  }
  
  extension [Self <: PickImplerrorPartialPickIActive](x: Self) {
    
    inline def setActive(value: `false` | String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setError(value: (`false` | String) & (js.UndefOr[`false` | String])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: `false` | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRatio(value: `false` | String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setSuccess(value: `false` | String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: `false` | String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
