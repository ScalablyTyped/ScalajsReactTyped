package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDomTokenList extends StObject {
  
  def add(token: String): Unit
  
  def remove(token: String): Unit
}
object RDomTokenList {
  
  inline def apply(add: String => Callback, remove: String => Callback): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: String) => add(t0).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[RDomTokenList]
  }
  
  extension [Self <: RDomTokenList](x: Self) {
    
    inline def setAdd(value: String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
