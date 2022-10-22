package typingsJapgolly.xstate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.libActorMod.Actor
import typingsJapgolly.xstate.libTypesMod.AnyEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegistryMod {
  
  @JSImport("xstate/lib/registry", "registry")
  @js.native
  val registry: Registry_ = js.native
  
  trait Registry_ extends StObject {
    
    def bookId(): String
    
    def free(id: String): Unit
    
    def get(id: String): js.UndefOr[Actor[Any, AnyEventObject]]
    
    def register(id: String, actor: Actor[Any, AnyEventObject]): String
  }
  object Registry_ {
    
    inline def apply(
      bookId: CallbackTo[String],
      free: String => Callback,
      get: String => js.UndefOr[Actor[Any, AnyEventObject]],
      register: (String, Actor[Any, AnyEventObject]) => String
    ): Registry_ = {
      val __obj = js.Dynamic.literal(bookId = bookId.toJsFn, free = js.Any.fromFunction1((t0: String) => free(t0).runNow()), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Registry_]
    }
    
    extension [Self <: Registry_](x: Self) {
      
      inline def setBookId(value: CallbackTo[String]): Self = StObject.set(x, "bookId", value.toJsFn)
      
      inline def setFree(value: String => Callback): Self = StObject.set(x, "free", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGet(value: String => js.UndefOr[Actor[Any, AnyEventObject]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, Actor[Any, AnyEventObject]) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
