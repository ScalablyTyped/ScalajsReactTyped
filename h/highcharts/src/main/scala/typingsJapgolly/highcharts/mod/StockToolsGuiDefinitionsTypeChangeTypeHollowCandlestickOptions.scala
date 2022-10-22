package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsTypeChangeTypeHollowCandlestickOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsTypeChangeTypeHollowCandlestickOptions {
  
  inline def apply(): StockToolsGuiDefinitionsTypeChangeTypeHollowCandlestickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeTypeHollowCandlestickOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsTypeChangeTypeHollowCandlestickOptions](x: Self) {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
