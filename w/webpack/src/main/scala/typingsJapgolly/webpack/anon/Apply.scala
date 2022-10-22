package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  @JSName("apply")
  def apply(arg0: Resolver): Unit
}
object Apply {
  
  inline def apply(apply: Resolver => Callback): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Resolver) => apply(t0).runNow()))
    __obj.asInstanceOf[Apply]
  }
  
  extension [Self <: Apply](x: Self) {
    
    inline def setApply(value: Resolver => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Resolver) => value(t0).runNow()))
  }
}
