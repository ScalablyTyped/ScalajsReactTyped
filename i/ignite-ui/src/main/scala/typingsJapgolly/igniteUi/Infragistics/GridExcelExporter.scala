package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridExcelExporter extends StObject {
  
  /**
    * Exports the provided igGrid to Excel document.
    *
    * @param grid jQuery element of the igGrid.
    * @param userSettings Settings for exporting the grid.
    * @param userCallbacks Callbacks for the events.
    */
  def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): Unit
}
object GridExcelExporter {
  
  inline def apply(exportGrid: (js.Object, js.Object, js.Object) => Callback): GridExcelExporter = {
    val __obj = js.Dynamic.literal(exportGrid = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (exportGrid(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[GridExcelExporter]
  }
  
  extension [Self <: GridExcelExporter](x: Self) {
    
    inline def setExportGrid(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "exportGrid", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
  }
}
