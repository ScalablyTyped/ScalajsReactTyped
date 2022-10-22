package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLStorage extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLStorage_typekey")
  var MSHTMLDotIHTMLStorage_typekey: IHTMLStorage
  
  def clear(): Unit
  
  def getItem(bstrKey: String): Any
  
  def key(lIndex: Double): String
  
  val length: Double
  
  val remainingSpace: Double
  
  def removeItem(bstrKey: String): Unit
  
  def setItem(bstrKey: String, bstrValue: String): Unit
}
object IHTMLStorage {
  
  inline def apply(
    MSHTMLDotIHTMLStorage_typekey: IHTMLStorage,
    clear: Callback,
    getItem: String => Any,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): IHTMLStorage = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
    __obj.updateDynamic("MSHTML.IHTMLStorage_typekey")(MSHTMLDotIHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStorage]
  }
  
  extension [Self <: IHTMLStorage](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetItem(value: String => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLStorage_typekey(value: IHTMLStorage): Self = StObject.set(x, "MSHTML.IHTMLStorage_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemainingSpace(value: Double): Self = StObject.set(x, "remainingSpace", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
