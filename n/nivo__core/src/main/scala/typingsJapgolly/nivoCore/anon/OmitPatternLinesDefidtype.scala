package typingsJapgolly.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/core.@nivo/core.PatternLinesDef, 'id' | 'type'> */
trait OmitPatternLinesDefidtype extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object OmitPatternLinesDefidtype {
  
  inline def apply(): OmitPatternLinesDefidtype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPatternLinesDefidtype]
  }
  
  extension [Self <: OmitPatternLinesDefidtype](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
