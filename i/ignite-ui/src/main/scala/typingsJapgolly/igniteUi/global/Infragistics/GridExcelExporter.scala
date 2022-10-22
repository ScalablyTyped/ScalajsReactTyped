package typingsJapgolly.igniteUi.global.Infragistics

import typingsJapgolly.igniteUi.GridExcelExporterCallbacks
import typingsJapgolly.igniteUi.GridExcelExporterSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.GridExcelExporter")
@js.native
open class GridExcelExporter protected ()
  extends StObject
     with typingsJapgolly.igniteUi.Infragistics.GridExcelExporter {
  def this(callbacks: GridExcelExporterCallbacks) = this()
  def this(settings: GridExcelExporterSettings) = this()
  
  /**
    * Exports the provided igGrid to Excel document.
    *
    * @param grid jQuery element of the igGrid.
    * @param userSettings Settings for exporting the grid.
    * @param userCallbacks Callbacks for the events.
    */
  /* CompleteClass */
  override def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): Unit = js.native
}
