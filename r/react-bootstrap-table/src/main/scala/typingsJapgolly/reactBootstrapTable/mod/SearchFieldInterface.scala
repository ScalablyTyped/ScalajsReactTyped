package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldInterface extends StObject {
  
  /**
    * getValue should return the current search text.
    */
  def getValue(): String
  
  /**
    * setValue should update the current search text to the given value.
    */
  def setValue(search: String): Unit
}
object SearchFieldInterface {
  
  inline def apply(getValue: CallbackTo[String], setValue: String => Callback): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = getValue.toJsFn, setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()))
    __obj.asInstanceOf[SearchFieldInterface]
  }
  
  extension [Self <: SearchFieldInterface](x: Self) {
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
