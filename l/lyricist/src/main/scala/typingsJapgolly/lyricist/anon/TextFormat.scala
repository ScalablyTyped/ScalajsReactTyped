package typingsJapgolly.lyricist.anon

import typingsJapgolly.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFormat extends StObject {
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.undefined
}
object TextFormat {
  
  inline def apply(): TextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormat]
  }
  
  extension [Self <: TextFormat](x: Self) {
    
    inline def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
