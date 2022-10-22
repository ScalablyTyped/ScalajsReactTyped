package typingsJapgolly.reactVis.mod

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunburstPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var children: js.UndefOr[js.Array[SunburstPoint]] = js.undefined
  
  var color: js.UndefOr[Double | String] = js.undefined
  
  var dontRotateLabel: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object SunburstPoint {
  
  inline def apply(title: String): SunburstPoint = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstPoint]
  }
  
  extension [Self <: SunburstPoint](x: Self) {
    
    inline def setChildren(value: js.Array[SunburstPoint]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SunburstPoint*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setColor(value: Double | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDontRotateLabel(value: Boolean): Self = StObject.set(x, "dontRotateLabel", value.asInstanceOf[js.Any])
    
    inline def setDontRotateLabelUndefined: Self = StObject.set(x, "dontRotateLabel", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
