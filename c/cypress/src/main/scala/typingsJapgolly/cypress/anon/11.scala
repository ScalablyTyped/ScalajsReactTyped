package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def defaults(options: PartialScreenshotDefaults): Unit
}
object `11` {
  
  inline def apply(defaults: PartialScreenshotDefaults => Callback): `11` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1((t0: PartialScreenshotDefaults) => defaults(t0).runNow()))
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setDefaults(value: PartialScreenshotDefaults => Callback): Self = StObject.set(x, "defaults", js.Any.fromFunction1((t0: PartialScreenshotDefaults) => value(t0).runNow()))
  }
}
