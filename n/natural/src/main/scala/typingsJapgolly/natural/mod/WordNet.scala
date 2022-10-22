package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordNet extends StObject {
  
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit
  
  def lookup(word: String, callback: WordNetLookupCallback): Unit
}
object WordNet {
  
  inline def apply(
    get: (Double, String, WordNetGetCallback) => Callback,
    lookup: (String, WordNetLookupCallback) => Callback
  ): WordNet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3((t0: Double, t1: String, t2: WordNetGetCallback) => (get(t0, t1, t2)).runNow()), lookup = js.Any.fromFunction2((t0: String, t1: WordNetLookupCallback) => (lookup(t0, t1)).runNow()))
    __obj.asInstanceOf[WordNet]
  }
  
  extension [Self <: WordNet](x: Self) {
    
    inline def setGet(value: (Double, String, WordNetGetCallback) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: Double, t1: String, t2: WordNetGetCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setLookup(value: (String, WordNetLookupCallback) => Callback): Self = StObject.set(x, "lookup", js.Any.fromFunction2((t0: String, t1: WordNetLookupCallback) => (value(t0, t1)).runNow()))
  }
}
