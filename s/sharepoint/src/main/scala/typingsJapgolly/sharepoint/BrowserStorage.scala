package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object BrowserStorage {
  
  /** Available only in SharePoint Online*/
  trait CachedStorage extends StObject {
    
    def clead(): Unit
    
    def getItem(key: String): String
    
    var length: Double
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, value: String): Unit
  }
  object CachedStorage {
    
    inline def apply(
      clead: Callback,
      getItem: String => String,
      length: Double,
      removeItem: String => Callback,
      setItem: (String, String) => Callback
    ): CachedStorage = {
      val __obj = js.Dynamic.literal(clead = clead.toJsFn, getItem = js.Any.fromFunction1(getItem), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
      __obj.asInstanceOf[CachedStorage]
    }
    
    extension [Self <: CachedStorage](x: Self) {
      
      inline def setClead(value: Callback): Self = StObject.set(x, "clead", value.toJsFn)
      
      inline def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
