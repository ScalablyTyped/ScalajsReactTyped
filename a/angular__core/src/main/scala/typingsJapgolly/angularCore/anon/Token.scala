package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.angularCoreStrings.any
import typingsJapgolly.angularCore.angularCoreStrings.environment
import typingsJapgolly.angularCore.angularCoreStrings.platform
import typingsJapgolly.angularCore.angularCoreStrings.root
import typingsJapgolly.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token[T] extends StObject {
  
  def factory(): T
  
  var providedIn: js.UndefOr[Type[Any] | root | platform | any | environment | Null] = js.undefined
  
  var token: Any
}
object Token {
  
  inline def apply[T](factory: CallbackTo[T], token: Any): Token[T] = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn, token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[T]]
  }
  
  extension [Self <: Token[?], T](x: Self & Token[T]) {
    
    inline def setFactory(value: CallbackTo[T]): Self = StObject.set(x, "factory", value.toJsFn)
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any | environment): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
