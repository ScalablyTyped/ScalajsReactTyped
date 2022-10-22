package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.CurrentValue> */
trait PartialCurrentValueFont extends StObject {
  
  var font: js.UndefOr[PartialFont] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var xanchor: js.UndefOr[left | center | right] = js.undefined
}
object PartialCurrentValueFont {
  
  inline def apply(): PartialCurrentValueFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCurrentValueFont]
  }
  
  extension [Self <: PartialCurrentValueFont](x: Self) {
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
  }
}
