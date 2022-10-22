package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TabStripOptions {
  
  inline def apply(): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripOptions]
  }
  
  extension [Self <: TabStripOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelect(value: /* e */ TabStripSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ TabStripSelectEvent) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
