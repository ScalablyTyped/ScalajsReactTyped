package typingsJapgolly.bootstrapValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorOptions extends StObject {
  
  var custom: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var disable: js.UndefOr[Boolean] = js.undefined
  
  var feedback: js.UndefOr[Any] = js.undefined
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[Boolean] = js.undefined
}
object ValidatorOptions {
  
  inline def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  extension [Self <: ValidatorOptions](x: Self) {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setFeedback(value: Any): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
