package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  /**
    * Specifies the legend subtitle&apos;s font properties.
    */
  var font: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Specifies the distance between the legend&apos;s title and subtitle in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the subtitle&apos;s text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object Font {
  
  inline def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setFont(value: typingsJapgolly.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
