package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait list extends StObject {
  
  def arrayToList(listArray: Any, database: Any, paragraphMode: Any, dir: Any): Unit
  
  def listToArray(listNode: Any, database: Any, baseArray: Any, baseIndentLevel: Any, grandparentNode: Any): Unit
}
object list {
  
  inline def apply(arrayToList: (Any, Any, Any, Any) => Callback, listToArray: (Any, Any, Any, Any, Any) => Callback): list = {
    val __obj = js.Dynamic.literal(arrayToList = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (arrayToList(t0, t1, t2, t3)).runNow()), listToArray = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (listToArray(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[list]
  }
  
  extension [Self <: list](x: Self) {
    
    inline def setArrayToList(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "arrayToList", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setListToArray(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "listToArray", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
