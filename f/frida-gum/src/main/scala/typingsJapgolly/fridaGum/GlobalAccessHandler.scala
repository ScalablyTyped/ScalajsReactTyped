package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalAccessHandler extends StObject {
  
  /**
    * Queries which additional globals exist.
    */
  def enumerate(): js.Array[String]
  
  /**
    * Called whenever an attempt to access a non-existent global variable is
    * made. Return `undefined` to treat the variable as inexistent.
    *
    * @param property Name of non-existent global that is being accessed.
    */
  def get(property: String): Any
}
object GlobalAccessHandler {
  
  inline def apply(enumerate: CallbackTo[js.Array[String]], get: String => Any): GlobalAccessHandler = {
    val __obj = js.Dynamic.literal(enumerate = enumerate.toJsFn, get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GlobalAccessHandler]
  }
  
  extension [Self <: GlobalAccessHandler](x: Self) {
    
    inline def setEnumerate(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "enumerate", value.toJsFn)
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
