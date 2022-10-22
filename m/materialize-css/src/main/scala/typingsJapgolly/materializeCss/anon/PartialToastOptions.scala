package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ToastOptions> */
trait PartialToastOptions extends StObject {
  
  var activationPercent: js.UndefOr[Double] = js.undefined
  
  var classes: js.UndefOr[String] = js.undefined
  
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var displayLength: js.UndefOr[Double] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialToastOptions {
  
  inline def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  
  extension [Self <: PartialToastOptions](x: Self) {
    
    inline def setActivationPercent(value: Double): Self = StObject.set(x, "activationPercent", value.asInstanceOf[js.Any])
    
    inline def setActivationPercentUndefined: Self = StObject.set(x, "activationPercent", js.undefined)
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCompleteCallback(value: Callback): Self = StObject.set(x, "completeCallback", value.toJsFn)
    
    inline def setCompleteCallbackUndefined: Self = StObject.set(x, "completeCallback", js.undefined)
    
    inline def setDisplayLength(value: Double): Self = StObject.set(x, "displayLength", value.asInstanceOf[js.Any])
    
    inline def setDisplayLengthUndefined: Self = StObject.set(x, "displayLength", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}
