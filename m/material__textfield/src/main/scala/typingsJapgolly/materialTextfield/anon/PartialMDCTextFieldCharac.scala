package typingsJapgolly.materialTextfield.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/character-counter/adapter.MDCTextFieldCharacterCounterAdapter> */
trait PartialMDCTextFieldCharac extends StObject {
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
}
object PartialMDCTextFieldCharac {
  
  inline def apply(): PartialMDCTextFieldCharac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldCharac]
  }
  
  extension [Self <: PartialMDCTextFieldCharac](x: Self) {
    
    inline def setSetContent(value: /* content */ String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: /* content */ String) => value(t0).runNow()))
    
    inline def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
  }
}
