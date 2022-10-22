package typingsJapgolly.bmapgl.BMapGL

import typingsJapgolly.bmapgl.bmapglStrings.dashed
import typingsJapgolly.bmapgl.bmapglStrings.dotted
import typingsJapgolly.bmapgl.bmapglStrings.metric
import typingsJapgolly.bmapgl.bmapglStrings.solid
import typingsJapgolly.bmapgl.bmapglStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceToolOptions extends StObject {
  
  var closeIcon: js.UndefOr[Icon] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var followText: js.UndefOr[String] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineStroke: js.UndefOr[Double] = js.undefined
  
  var lineStyle: js.UndefOr[solid | dashed | dotted] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var secIcon: js.UndefOr[Icon] = js.undefined
  
  var tips: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[metric | us] = js.undefined
}
object DistanceToolOptions {
  
  inline def apply(): DistanceToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceToolOptions]
  }
  
  extension [Self <: DistanceToolOptions](x: Self) {
    
    inline def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    inline def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineStroke(value: Double): Self = StObject.set(x, "lineStroke", value.asInstanceOf[js.Any])
    
    inline def setLineStrokeUndefined: Self = StObject.set(x, "lineStroke", js.undefined)
    
    inline def setLineStyle(value: solid | dashed | dotted): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSecIcon(value: Icon): Self = StObject.set(x, "secIcon", value.asInstanceOf[js.Any])
    
    inline def setSecIconUndefined: Self = StObject.set(x, "secIcon", js.undefined)
    
    inline def setTips(value: String): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    
    inline def setUnit(value: metric | us): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
