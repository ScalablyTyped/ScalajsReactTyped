package typingsJapgolly.vastClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VASTClientCustomStorage
  extends StObject
     with /* key */ StringDictionary[Any | js.Function0[Any]] {
  
  def getItem(key: String): String | Null
  
  def setItem(key: String, `val`: String): Unit
}
object VASTClientCustomStorage {
  
  inline def apply(getItem: String => String | Null, setItem: (String, String) => Callback): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
  
  extension [Self <: VASTClientCustomStorage](x: Self) {
    
    inline def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
