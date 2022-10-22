package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitySearch
  extends StObject
     with EventBindable {
  
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
  ): Unit
  
  def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit
}
object CitySearch {
  
  inline def apply(
    getCityByIp: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Callback,
    getLocalCity: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback
  ): CitySearch = {
    val __obj = js.Dynamic.literal(getCityByIp = js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => (getCityByIp(t0, t1)).runNow()), getLocalCity = js.Any.fromFunction1((t0: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => getLocalCity(t0).runNow()), off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[CitySearch]
  }
  
  extension [Self <: CitySearch](x: Self) {
    
    inline def setGetCityByIp(
      value: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Callback
    ): Self = StObject.set(x, "getCityByIp", js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetLocalCity(value: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Callback): Self = StObject.set(x, "getLocalCity", js.Any.fromFunction1((t0: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => value(t0).runNow()))
  }
}
