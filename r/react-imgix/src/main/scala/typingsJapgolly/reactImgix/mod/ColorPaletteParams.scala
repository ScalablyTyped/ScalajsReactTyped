package typingsJapgolly.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaletteParams extends StObject {
  
  var colors: js.UndefOr[ImgixParamType] = js.undefined
  
  var palette: js.UndefOr[ImgixParamType] = js.undefined
  
  var prefix: js.UndefOr[ImgixParamType] = js.undefined
}
object ColorPaletteParams {
  
  inline def apply(): ColorPaletteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPaletteParams]
  }
  
  extension [Self <: ColorPaletteParams](x: Self) {
    
    inline def setColors(value: ImgixParamType): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setPalette(value: ImgixParamType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPrefix(value: ImgixParamType): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
