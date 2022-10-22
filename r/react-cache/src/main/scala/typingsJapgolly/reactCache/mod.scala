package typingsJapgolly.reactCache

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unstableCreateResource[Input, Value](fetch: js.Function1[/* input */ Input, PromiseLike[Value]]): Resource[Input, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createResource")(fetch.asInstanceOf[js.Any]).asInstanceOf[Resource[Input, Value]]
  inline def unstableCreateResource[Input, Value](
    fetch: js.Function1[/* input */ Input, PromiseLike[Value]],
    maybeHashInput: js.Function1[/* input */ Input, String | Double]
  ): Resource[Input, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createResource")(fetch.asInstanceOf[js.Any], maybeHashInput.asInstanceOf[js.Any])).asInstanceOf[Resource[Input, Value]]
  
  trait Resource[Input, Value] extends StObject {
    
    def preload(key: Input): Unit
    
    def read(key: Input): Value
  }
  object Resource {
    
    inline def apply[Input, Value](preload: Input => Callback, read: Input => Value): Resource[Input, Value] = {
      val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1((t0: Input) => preload(t0).runNow()), read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Resource[Input, Value]]
    }
    
    extension [Self <: Resource[?, ?], Input, Value](x: Self & (Resource[Input, Value])) {
      
      inline def setPreload(value: Input => Callback): Self = StObject.set(x, "preload", js.Any.fromFunction1((t0: Input) => value(t0).runNow()))
      
      inline def setRead(value: Input => Value): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
}
