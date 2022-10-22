package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormItemLayout extends StObject {
  
  var componentHeight: js.UndefOr[Double | String] = js.undefined
  
  var componentWidth: js.UndefOr[Double | String] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var info: js.UndefOr[String] = js.undefined
  
  var titleFontSize: js.UndefOr[Double | String] = js.undefined
}
object FormItemLayout {
  
  inline def apply(): FormItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLayout]
  }
  
  extension [Self <: FormItemLayout](x: Self) {
    
    inline def setComponentHeight(value: Double | String): Self = StObject.set(x, "componentHeight", value.asInstanceOf[js.Any])
    
    inline def setComponentHeightUndefined: Self = StObject.set(x, "componentHeight", js.undefined)
    
    inline def setComponentWidth(value: Double | String): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
    
    inline def setComponentWidthUndefined: Self = StObject.set(x, "componentWidth", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setTitleFontSize(value: Double | String): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
  }
}
