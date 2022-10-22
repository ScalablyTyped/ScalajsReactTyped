package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGaugeOptions extends StObject {
  
  var gaugeArea: js.UndefOr[RadialGaugeGaugeArea] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pointer: js.UndefOr[js.Array[RadialGaugePointerItem]] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[RadialGaugeScale] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
}
object RadialGaugeOptions {
  
  inline def apply(): RadialGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeOptions]
  }
  
  extension [Self <: RadialGaugeOptions](x: Self) {
    
    inline def setGaugeArea(value: RadialGaugeGaugeArea): Self = StObject.set(x, "gaugeArea", value.asInstanceOf[js.Any])
    
    inline def setGaugeAreaUndefined: Self = StObject.set(x, "gaugeArea", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointer(value: js.Array[RadialGaugePointerItem]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPointerVarargs(value: RadialGaugePointerItem*): Self = StObject.set(x, "pointer", js.Array(value*))
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setScale(value: RadialGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
  }
}
