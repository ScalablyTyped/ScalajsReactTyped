package typingsJapgolly.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var bold: js.UndefOr[String | FontStyles] = js.undefined
  
  var boldital: js.UndefOr[String | FontStyles] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  // px
  var face: js.UndefOr[String] = js.undefined
  
  var ital: js.UndefOr[String | FontStyles] = js.undefined
  
  var mono: js.UndefOr[String | FontStyles] = js.undefined
  
  var multi: js.UndefOr[Boolean | String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  // px
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  var vadjust: js.UndefOr[Double] = js.undefined
}
object Font {
  
  inline def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBold(value: String | FontStyles): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setBoldital(value: String | FontStyles): Self = StObject.set(x, "boldital", value.asInstanceOf[js.Any])
    
    inline def setBolditalUndefined: Self = StObject.set(x, "boldital", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    inline def setItal(value: String | FontStyles): Self = StObject.set(x, "ital", value.asInstanceOf[js.Any])
    
    inline def setItalUndefined: Self = StObject.set(x, "ital", js.undefined)
    
    inline def setMono(value: String | FontStyles): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
    
    inline def setMonoUndefined: Self = StObject.set(x, "mono", js.undefined)
    
    inline def setMulti(value: Boolean | String): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setVadjust(value: Double): Self = StObject.set(x, "vadjust", value.asInstanceOf[js.Any])
    
    inline def setVadjustUndefined: Self = StObject.set(x, "vadjust", js.undefined)
  }
}
