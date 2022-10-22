package typingsJapgolly.semanticUiProgress.anon

import typingsJapgolly.semanticUiProgress.SemanticUI.Progress.TextSettings.Param
import typingsJapgolly.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: (`false` | String) & (js.UndefOr[`false` | String])
  
  var error: js.UndefOr[`false` | String] = js.undefined
  
  var percent: js.UndefOr[`false` | String] = js.undefined
  
  var ratio: js.UndefOr[`false` | String] = js.undefined
  
  var success: js.UndefOr[`false` | String] = js.undefined
  
  var warning: js.UndefOr[`false` | String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: (`false` | String) & (js.UndefOr[`false` | String])): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: (`false` | String) & (js.UndefOr[`false` | String])): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setError(value: `false` | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
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
