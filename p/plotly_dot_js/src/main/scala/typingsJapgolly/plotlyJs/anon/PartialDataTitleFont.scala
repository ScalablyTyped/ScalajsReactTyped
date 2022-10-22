package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.mod.Font
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom left`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom right`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`middle center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top left`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top right`
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.DataTitle> */
trait PartialDataTitleFont extends StObject {
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var position: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.undefined
  
  var standoff: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialDataTitleFont {
  
  inline def apply(): PartialDataTitleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataTitleFont]
  }
  
  extension [Self <: PartialDataTitleFont](x: Self) {
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setPosition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStandoff(value: Double): Self = StObject.set(x, "standoff", value.asInstanceOf[js.Any])
    
    inline def setStandoffUndefined: Self = StObject.set(x, "standoff", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
