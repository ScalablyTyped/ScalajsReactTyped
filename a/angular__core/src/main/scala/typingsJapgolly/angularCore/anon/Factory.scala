package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.any
import typingsJapgolly.angularCore.angularCoreStrings.platform
import typingsJapgolly.angularCore.angularCoreStrings.root
import typingsJapgolly.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory[T] extends StObject {
  
  def factory(): T
  
  var providedIn: js.UndefOr[Type[Any] | root | platform | any | Null] = js.undefined
}
object Factory {
  
  inline def apply[T](factory: CallbackTo[T]): Factory[T] = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn)
    __obj.asInstanceOf[Factory[T]]
  }
  
  extension [Self <: Factory[?], T](x: Self & Factory[T]) {
    
    inline def setFactory(value: CallbackTo[T]): Self = StObject.set(x, "factory", value.toJsFn)
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}
