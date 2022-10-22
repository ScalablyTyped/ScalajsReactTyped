package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailButtonOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ DetailButtonClickEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object DetailButtonOptions {
  
  inline def apply(): DetailButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailButtonOptions]
  }
  
  extension [Self <: DetailButtonOptions](x: Self) {
    
    inline def setClick(value: /* e */ DetailButtonClickEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* e */ DetailButtonClickEvent) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
