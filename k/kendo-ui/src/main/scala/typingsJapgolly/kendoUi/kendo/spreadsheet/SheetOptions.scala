package typingsJapgolly.kendoUi.kendo.spreadsheet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SheetOptions {
  
  inline def apply(): SheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetOptions]
  }
  
  extension [Self <: SheetOptions](x: Self) {
    
    inline def setChange(value: /* e */ SheetChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ SheetChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
