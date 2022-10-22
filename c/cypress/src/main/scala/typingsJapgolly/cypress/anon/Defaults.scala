package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaults extends StObject {
  
  def defaults(options: PartialKeyboardDefaultsOp): Unit
}
object Defaults {
  
  inline def apply(defaults: PartialKeyboardDefaultsOp => Callback): Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1((t0: PartialKeyboardDefaultsOp) => defaults(t0).runNow()))
    __obj.asInstanceOf[Defaults]
  }
  
  extension [Self <: Defaults](x: Self) {
    
    inline def setDefaults(value: PartialKeyboardDefaultsOp => Callback): Self = StObject.set(x, "defaults", js.Any.fromFunction1((t0: PartialKeyboardDefaultsOp) => value(t0).runNow()))
  }
}
