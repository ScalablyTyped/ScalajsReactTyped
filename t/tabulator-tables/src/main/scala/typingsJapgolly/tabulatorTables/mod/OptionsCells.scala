package typingsJapgolly.tabulatorTables.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCells
  extends StObject
     with CellCallbacks {
  
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.undefined
}
object OptionsCells {
  
  inline def apply(): OptionsCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCells]
  }
  
  extension [Self <: OptionsCells](x: Self) {
    
    inline def setValidationFailed(
      value: (/* cell */ CellComponent, /* value */ Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Callback
    ): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3((t0: /* cell */ CellComponent, t1: /* value */ Any, t2: /* validators */ js.Array[StandardValidatorType | Validator]) => (value(t0, t1, t2)).runNow()))
    
    inline def setValidationFailedUndefined: Self = StObject.set(x, "validationFailed", js.undefined)
  }
}
