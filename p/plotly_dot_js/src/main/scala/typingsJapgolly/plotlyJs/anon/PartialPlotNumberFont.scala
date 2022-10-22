package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.mod.Font
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotNumber> */
trait PartialPlotNumberFont extends StObject {
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var valueformat: js.UndefOr[String] = js.undefined
}
object PartialPlotNumberFont {
  
  inline def apply(): PartialPlotNumberFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotNumberFont]
  }
  
  extension [Self <: PartialPlotNumberFont](x: Self) {
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
    
    inline def setValueformatUndefined: Self = StObject.set(x, "valueformat", js.undefined)
  }
}
