package typingsJapgolly.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.tsMockito.libMatcherTypeMatcherMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatcherTypeAnyOfClassMatcherMod {
  
  @JSImport("ts-mockito/lib/matcher/type/AnyOfClassMatcher", "AnyOfClassMatcher")
  @js.native
  open class AnyOfClassMatcher[T] protected () extends Matcher {
    def this(expectedClass: Instantiable1[/* args (repeated) */ Any, T]) = this()
    
    /* private */ var expectedClass: Any = js.native
  }
}
