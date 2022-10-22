package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
trait PickAutocompleteselectOpt extends StObject {
  
  def selectOption(el: Element): Unit
  @JSName("selectOption")
  var selectOption_Original: js.Function1[/* el */ Element, Unit]
}
object PickAutocompleteselectOpt {
  
  inline def apply(selectOption: /* el */ Element => Callback): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal(selectOption = js.Any.fromFunction1((t0: /* el */ Element) => selectOption(t0).runNow()))
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
  
  extension [Self <: PickAutocompleteselectOpt](x: Self) {
    
    inline def setSelectOption(value: /* el */ Element => Callback): Self = StObject.set(x, "selectOption", js.Any.fromFunction1((t0: /* el */ Element) => value(t0).runNow()))
  }
}
