package typingsJapgolly.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/core.@nivo/core.PatternDotsDef, 'id' | 'type'> */
trait OmitPatternDotsDefidtype extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var stagger: js.UndefOr[Boolean] = js.undefined
}
object OmitPatternDotsDefidtype {
  
  inline def apply(): OmitPatternDotsDefidtype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPatternDotsDefidtype]
  }
  
  extension [Self <: OmitPatternDotsDefidtype](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStagger(value: Boolean): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
    
    inline def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
  }
}
