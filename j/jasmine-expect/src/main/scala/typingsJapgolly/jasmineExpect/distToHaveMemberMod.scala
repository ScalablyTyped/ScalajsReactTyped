package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveMemberMod {
  
  @JSImport("jasmine-expect/dist/toHaveMember", "toHaveMember")
  @js.native
  val toHaveMember: ToHaveMember_ = js.native
  
  type ToHaveMember_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveMember(key: String): Boolean
        def toHaveMember(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveMember")
        var toHaveMember_Original: ToHaveMember_
      }
      object Matchers {
        
        inline def apply[T](toHaveMember: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveMember = js.Any.fromFunction2(toHaveMember))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveMember(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveMember", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
