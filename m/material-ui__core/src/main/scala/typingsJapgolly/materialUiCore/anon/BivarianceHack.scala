package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialUiCore.materialUiCoreStrings.backdropClick
import typingsJapgolly.materialUiCore.materialUiCoreStrings.escapeKeyDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BivarianceHack extends StObject {
  
  def bivarianceHack(event: js.Object, reason: backdropClick | escapeKeyDown): Unit
}
object BivarianceHack {
  
  inline def apply(bivarianceHack: (js.Object, backdropClick | escapeKeyDown) => Callback): BivarianceHack = {
    val __obj = js.Dynamic.literal(bivarianceHack = js.Any.fromFunction2((t0: js.Object, t1: backdropClick | escapeKeyDown) => (bivarianceHack(t0, t1)).runNow()))
    __obj.asInstanceOf[BivarianceHack]
  }
  
  extension [Self <: BivarianceHack](x: Self) {
    
    inline def setBivarianceHack(value: (js.Object, backdropClick | escapeKeyDown) => Callback): Self = StObject.set(x, "bivarianceHack", js.Any.fromFunction2((t0: js.Object, t1: backdropClick | escapeKeyDown) => (value(t0, t1)).runNow()))
  }
}
