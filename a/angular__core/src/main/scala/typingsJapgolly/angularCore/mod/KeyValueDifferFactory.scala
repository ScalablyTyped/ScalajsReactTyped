package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueDifferFactory extends StObject {
  
  /**
    * Create a `KeyValueDiffer`.
    */
  def create[K, V](): KeyValueDiffer[K, V]
  
  /**
    * Test to see if the differ knows how to diff this kind of object.
    */
  def supports(objects: Any): Boolean
}
object KeyValueDifferFactory {
  
  inline def apply(create: CallbackTo[KeyValueDiffer[Any, Any]], supports: Any => Boolean): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, supports = js.Any.fromFunction1(supports))
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
  
  extension [Self <: KeyValueDifferFactory](x: Self) {
    
    inline def setCreate(value: CallbackTo[KeyValueDiffer[Any, Any]]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setSupports(value: Any => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
  }
}
