package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStorageClass extends StObject {
  
  def clear(): Unit
  
  def getAllKeys(): js.Array[String]
  
  def getItem(key: String): String
  
  def isSupported(): Boolean
  
  def removeItem(key: String): Unit
  
  def setItem(key: String, value: String): Unit
}
object LocalStorageClass {
  
  inline def apply(
    clear: Callback,
    getAllKeys: CallbackTo[js.Array[String]],
    getItem: String => String,
    isSupported: CallbackTo[Boolean],
    removeItem: String => Callback,
    setItem: (String, String) => Callback
  ): LocalStorageClass = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, getAllKeys = getAllKeys.toJsFn, getItem = js.Any.fromFunction1(getItem), isSupported = isSupported.toJsFn, removeItem = js.Any.fromFunction1((t0: String) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2((t0: String, t1: String) => (setItem(t0, t1)).runNow()))
    __obj.asInstanceOf[LocalStorageClass]
  }
  
  extension [Self <: LocalStorageClass](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGetAllKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAllKeys", value.toJsFn)
    
    inline def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setIsSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSupported", value.toJsFn)
    
    inline def setRemoveItem(value: String => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetItem(value: (String, String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
