package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains extends StObject {
  
  def contains(input: String): Unit
  
  def endsWith(input: String): Unit
  
  def is(input: String): Unit
  
  def isNot(input: String): Unit
  
  def startsWith(input: String): Unit
}
object Contains {
  
  inline def apply(
    contains: String => Callback,
    endsWith: String => Callback,
    is: String => Callback,
    isNot: String => Callback,
    startsWith: String => Callback
  ): Contains = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1((t0: String) => contains(t0).runNow()), endsWith = js.Any.fromFunction1((t0: String) => endsWith(t0).runNow()), is = js.Any.fromFunction1((t0: String) => is(t0).runNow()), isNot = js.Any.fromFunction1((t0: String) => isNot(t0).runNow()), startsWith = js.Any.fromFunction1((t0: String) => startsWith(t0).runNow()))
    __obj.asInstanceOf[Contains]
  }
  
  extension [Self <: Contains](x: Self) {
    
    inline def setContains(value: String => Callback): Self = StObject.set(x, "contains", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEndsWith(value: String => Callback): Self = StObject.set(x, "endsWith", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIs(value: String => Callback): Self = StObject.set(x, "is", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIsNot(value: String => Callback): Self = StObject.set(x, "isNot", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartsWith(value: String => Callback): Self = StObject.set(x, "startsWith", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
