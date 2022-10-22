package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsCrookedLinesCrooked3Options extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsCrookedLinesCrooked3Options {
  
  inline def apply(): StockToolsGuiDefinitionsCrookedLinesCrooked3Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesCrooked3Options]
  }
  
  extension [Self <: StockToolsGuiDefinitionsCrookedLinesCrooked3Options](x: Self) {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
