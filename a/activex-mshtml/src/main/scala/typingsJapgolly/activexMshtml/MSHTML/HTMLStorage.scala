package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLStorage extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLStorage_typekey")
  var MSHTMLDotHTMLStorage_typekey: HTMLStorage
  
  def clear(): Unit
  
  val constructor: Any
  
  def getItem(bstrKey: String): Any
  
  def ie9_setItem(bstrKey: String, bstrValue: String): Unit
  
  def key(lIndex: Double): String
  
  val length: Double
  
  val remainingSpace: Double
  
  def removeItem(bstrKey: String): Unit
  
  def setItem(bstrKey: String, bstrValue: String): Unit
}
object HTMLStorage {
  
  inline def apply(
    MSHTMLDotHTMLStorage_typekey: HTMLStorage,
    clear: Callback,
    constructor: Any,
    getItem: String => Any,
    ie9_setItem: (String, String) => Callback,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): HTMLStorage = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, constructor = constructor.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), ie9_setItem = js.Any.fromFunction2((t0: String, t1: String) => (ie9_setItem(t0, t1)).runNow()), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
    __obj.updateDynamic("MSHTML.HTMLStorage_typekey")(MSHTMLDotHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStorage]
  }
  
  extension [Self <: HTMLStorage](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setGetItem(value: String => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setIe9_setItem(value: (String, String) => Callback): Self = StObject.set(x, "ie9_setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLStorage_typekey(value: HTMLStorage): Self = StObject.set(x, "MSHTML.HTMLStorage_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemainingSpace(value: Double): Self = StObject.set(x, "remainingSpace", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
