package typingsJapgolly.arcgisRestApi.mod

import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriSLS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleLineSymbol
  extends StObject
     with Symbol {
  
  var color: js.UndefOr[Color] = js.undefined
  
  @JSName("style")
  var style_SimpleLineSymbol: js.UndefOr[SimpleLineSymbolStyle] = js.undefined
  
  @JSName("type")
  var type_SimpleLineSymbol: esriSLS
  
  var width: js.UndefOr[Double] = js.undefined
}
object SimpleLineSymbol {
  
  inline def apply(): SimpleLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriSLS")
    __obj.asInstanceOf[SimpleLineSymbol]
  }
  
  extension [Self <: SimpleLineSymbol](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: SimpleLineSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: esriSLS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
