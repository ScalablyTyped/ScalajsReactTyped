package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def defaults(options: PartialServerOptions): Unit
}
object `10` {
  
  inline def apply(defaults: PartialServerOptions => Callback): `10` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1((t0: PartialServerOptions) => defaults(t0).runNow()))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setDefaults(value: PartialServerOptions => Callback): Self = StObject.set(x, "defaults", js.Any.fromFunction1((t0: PartialServerOptions) => value(t0).runNow()))
  }
}
