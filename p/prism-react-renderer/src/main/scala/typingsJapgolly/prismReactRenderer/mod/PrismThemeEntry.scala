package typingsJapgolly.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`100`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`200`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`300`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`400`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`500`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`600`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`700`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`800`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`900`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`line-through`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.`underline line-through`
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.bold
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.italic
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.none
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.normal
import typingsJapgolly.prismReactRenderer.prismReactRendererStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismThemeEntry
  extends StObject
     with /* styleKey */ StringDictionary[String | Double | Unit] {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.undefined
}
object PrismThemeEntry {
  
  inline def apply(): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismThemeEntry]
  }
  
  extension [Self <: PrismThemeEntry](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
  }
}
