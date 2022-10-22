package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.griddleReact.mod.utils.SortProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleEvents
  extends StObject
     with GriddleActions {
  
  var onFilter: js.UndefOr[js.Function1[/* filterText */ String, Unit]] = js.undefined
  
  var setSortProperties: js.UndefOr[js.Function1[/* sortProperties */ SortProperties, js.Function0[Unit]]] = js.undefined
}
object GriddleEvents {
  
  inline def apply(): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleEvents]
  }
  
  extension [Self <: GriddleEvents](x: Self) {
    
    inline def setOnFilter(value: /* filterText */ String => Callback): Self = StObject.set(x, "onFilter", js.Any.fromFunction1((t0: /* filterText */ String) => value(t0).runNow()))
    
    inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    inline def setSetSortProperties(value: /* sortProperties */ SortProperties => js.Function0[Unit]): Self = StObject.set(x, "setSortProperties", js.Any.fromFunction1(value))
    
    inline def setSetSortPropertiesUndefined: Self = StObject.set(x, "setSortProperties", js.undefined)
  }
}
