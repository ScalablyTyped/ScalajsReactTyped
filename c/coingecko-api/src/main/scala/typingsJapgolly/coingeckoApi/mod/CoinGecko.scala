package typingsJapgolly.coingeckoApi.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.coingeckoApi.anon.All
import typingsJapgolly.coingeckoApi.anon.Fetch
import typingsJapgolly.coingeckoApi.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinGecko extends StObject {
  
  var coins: All
  
  var exchanges: Fetch
  
  /**
    * Get cryptocurrency global data
    */
  def global(): js.Promise[Response[Any]]
  
  /**
    * Check API server status
    */
  def ping(): js.Promise[Response[Any]]
  
  var simple: Price
}
object CoinGecko {
  
  inline def apply(
    coins: All,
    exchanges: Fetch,
    global: CallbackTo[js.Promise[Response[Any]]],
    ping: CallbackTo[js.Promise[Response[Any]]],
    simple: Price
  ): CoinGecko = {
    val __obj = js.Dynamic.literal(coins = coins.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], global = global.toJsFn, ping = ping.toJsFn, simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinGecko]
  }
  
  extension [Self <: CoinGecko](x: Self) {
    
    inline def setCoins(value: All): Self = StObject.set(x, "coins", value.asInstanceOf[js.Any])
    
    inline def setExchanges(value: Fetch): Self = StObject.set(x, "exchanges", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: CallbackTo[js.Promise[Response[Any]]]): Self = StObject.set(x, "global", value.toJsFn)
    
    inline def setPing(value: CallbackTo[js.Promise[Response[Any]]]): Self = StObject.set(x, "ping", value.toJsFn)
    
    inline def setSimple(value: Price): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
  }
}
