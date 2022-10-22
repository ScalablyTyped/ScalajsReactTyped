package typingsJapgolly.coreJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map[K, V] extends StObject {
  
  def toJSON(): Any
}
object Map {
  
  inline def apply[K, V](toJSON: CallbackTo[Any]): Map[K, V] = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Map[K, V]]
  }
  
  extension [Self <: Map[?, ?], K, V](x: Self & (Map[K, V])) {
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
