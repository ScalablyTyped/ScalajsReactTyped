package typingsJapgolly.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.KeyboardDefaultsOptions> */
trait PartialKeyboardDefaultsOp extends StObject {
  
  var keystrokeDelay: js.UndefOr[Double] = js.undefined
}
object PartialKeyboardDefaultsOp {
  
  inline def apply(): PartialKeyboardDefaultsOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKeyboardDefaultsOp]
  }
  
  extension [Self <: PartialKeyboardDefaultsOp](x: Self) {
    
    inline def setKeystrokeDelay(value: Double): Self = StObject.set(x, "keystrokeDelay", value.asInstanceOf[js.Any])
    
    inline def setKeystrokeDelayUndefined: Self = StObject.set(x, "keystrokeDelay", js.undefined)
  }
}
