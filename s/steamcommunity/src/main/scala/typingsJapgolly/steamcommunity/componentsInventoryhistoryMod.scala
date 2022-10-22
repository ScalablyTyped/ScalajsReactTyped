package typingsJapgolly.steamcommunity

import typingsJapgolly.steamcommunity.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInventoryhistoryMod {
  
  trait InventoryHistory extends StObject {
    
    /**
      * @deprecated Use GetTradeHistory instead: https://lab.xpaw.me/steam_api_documentation.html#IEconService_GetTradeHistory_v1
      * @param options
      * @param callback
      */
    def getInventoryHistory(options: js.Object, callback: Callback): Unit
  }
  object InventoryHistory {
    
    inline def apply(getInventoryHistory: (js.Object, Callback) => japgolly.scalajs.react.Callback): InventoryHistory = {
      val __obj = js.Dynamic.literal(getInventoryHistory = js.Any.fromFunction2((t0: js.Object, t1: Callback) => (getInventoryHistory(t0, t1)).runNow()))
      __obj.asInstanceOf[InventoryHistory]
    }
    
    extension [Self <: InventoryHistory](x: Self) {
      
      inline def setGetInventoryHistory(value: (js.Object, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "getInventoryHistory", js.Any.fromFunction2((t0: js.Object, t1: Callback) => (value(t0, t1)).runNow()))
    }
  }
}
