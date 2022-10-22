package typingsJapgolly.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLineScatterCandleBubbleConfig extends StObject {
  
  var highlightColor: js.UndefOr[Color] = js.undefined
}
object BarLineScatterCandleBubbleConfig {
  
  inline def apply(): BarLineScatterCandleBubbleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineScatterCandleBubbleConfig]
  }
  
  extension [Self <: BarLineScatterCandleBubbleConfig](x: Self) {
    
    inline def setHighlightColor(value: Color): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
  }
}
