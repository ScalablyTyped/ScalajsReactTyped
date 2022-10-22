package typingsJapgolly.paypalPaypalJs.anon

import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.`1x1`
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.`1x4`
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.`20x1`
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.`8x1`
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.custom
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.flex
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[text | flex | custom] = js.undefined
  
  var logo: js.UndefOr[Position] = js.undefined
  
  var ratio: js.UndefOr[`1x1` | `1x4` | `8x1` | `20x1`] = js.undefined
  
  var text: js.UndefOr[Align] = js.undefined
}
object Layout {
  
  inline def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLayout(value: text | flex | custom): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLogo(value: Position): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setRatio(value: `1x1` | `1x4` | `8x1` | `20x1`): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setText(value: Align): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
