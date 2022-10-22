package typingsJapgolly.pixiTextBitmap.mod

import typingsJapgolly.pixiTextBitmap.anon.Amount
import typingsJapgolly.pixiTextBitmap.anon.Count
import typingsJapgolly.pixiTextBitmap.anon.DistanceRange
import typingsJapgolly.pixiTextBitmap.anon.Face
import typingsJapgolly.pixiTextBitmap.anon.File
import typingsJapgolly.pixiTextBitmap.anon.Height
import typingsJapgolly.pixiTextBitmap.anon.LineHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontRawData extends StObject {
  
  var char: js.Array[Height]
  
  var chars: js.Array[Count]
  
  var common: js.Array[LineHeight]
  
  var distanceField: js.UndefOr[js.Array[DistanceRange]] = js.undefined
  
  var info: js.Array[Face]
  
  var kerning: js.UndefOr[js.Array[Amount]] = js.undefined
  
  var kernings: js.UndefOr[js.Array[Count]] = js.undefined
  
  var page: js.Array[File]
}
object IBitmapFontRawData {
  
  inline def apply(
    char: js.Array[Height],
    chars: js.Array[Count],
    common: js.Array[LineHeight],
    info: js.Array[Face],
    page: js.Array[File]
  ): IBitmapFontRawData = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontRawData]
  }
  
  extension [Self <: IBitmapFontRawData](x: Self) {
    
    inline def setChar(value: js.Array[Height]): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    inline def setCharVarargs(value: Height*): Self = StObject.set(x, "char", js.Array(value*))
    
    inline def setChars(value: js.Array[Count]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setCharsVarargs(value: Count*): Self = StObject.set(x, "chars", js.Array(value*))
    
    inline def setCommon(value: js.Array[LineHeight]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonVarargs(value: LineHeight*): Self = StObject.set(x, "common", js.Array(value*))
    
    inline def setDistanceField(value: js.Array[DistanceRange]): Self = StObject.set(x, "distanceField", value.asInstanceOf[js.Any])
    
    inline def setDistanceFieldUndefined: Self = StObject.set(x, "distanceField", js.undefined)
    
    inline def setDistanceFieldVarargs(value: DistanceRange*): Self = StObject.set(x, "distanceField", js.Array(value*))
    
    inline def setInfo(value: js.Array[Face]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: Face*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setKerning(value: js.Array[Amount]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setKerningVarargs(value: Amount*): Self = StObject.set(x, "kerning", js.Array(value*))
    
    inline def setKernings(value: js.Array[Count]): Self = StObject.set(x, "kernings", value.asInstanceOf[js.Any])
    
    inline def setKerningsUndefined: Self = StObject.set(x, "kernings", js.undefined)
    
    inline def setKerningsVarargs(value: Count*): Self = StObject.set(x, "kernings", js.Array(value*))
    
    inline def setPage(value: js.Array[File]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageVarargs(value: File*): Self = StObject.set(x, "page", js.Array(value*))
  }
}
