package typingsJapgolly.coingeckoApi.mod

import typingsJapgolly.coingeckoApi.anon.All
import typingsJapgolly.coingeckoApi.anon.Fetch
import typingsJapgolly.coingeckoApi.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coingecko-api", JSImport.Namespace)
@js.native
open class ^ ()
  extends StObject
     with CoinGecko {
  
  /* CompleteClass */
  var coins: All = js.native
  
  /* CompleteClass */
  var exchanges: Fetch = js.native
  
  /**
    * Get cryptocurrency global data
    */
  /* CompleteClass */
  override def global(): js.Promise[Response[Any]] = js.native
  
  /**
    * Check API server status
    */
  /* CompleteClass */
  override def ping(): js.Promise[Response[Any]] = js.native
  
  /* CompleteClass */
  var simple: Price = js.native
}
