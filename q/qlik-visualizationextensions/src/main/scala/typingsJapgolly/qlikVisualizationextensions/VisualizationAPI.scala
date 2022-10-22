package typingsJapgolly.qlikVisualizationextensions

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.qlikVisualizationextensions.TableAPI.IQTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualizationAPI {
  
  @js.native
  trait IQVisualization extends StObject {
    
    /**
      * Closes a visualization and releases the session object.
      * @return - A promise.
      */
    def close(): IPromise[Any] = js.native
    
    /**
      * Tells the visualization it has been resized and should re-paint.
      */
    def resize(): Unit = js.native
    
    /**
      * Sets options for a visualization.
      * @param options - Options to set (using applyPatches).
      */
    def setOptions(): Unit = js.native
    def setOptions(options: Any): Unit = js.native
    
    /**
      * Shows the visualization in an HTML element.
      * @param [element] - Optional. HTML element or HTML element ID.
      * @param [options] - Optional.
      * Name | Type | Description
      * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
      * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
      * | | Parameter introduced in version 3.0.
      */
    def show(): Unit = js.native
    def show(element: String): Unit = js.native
    def show(element: String, options: Any): Unit = js.native
    def show(element: Any): Unit = js.native
    def show(element: Any, options: Any): Unit = js.native
    def show(element: Unit, options: Any): Unit = js.native
    
    /**
      * Table object for this visualization.
      * Only for visualizations built on a hypercube.
      */
    var table: IQTable = js.native
  }
  
  @js.native
  trait IVisualization extends StObject {
    
    /**
      * Create a new visualization on the fly based on a session object
      * and will not be persisted in the app.
      * @param type - Visualization type. Can be:
      *       # barchart
      *       # combochart
      *       # gauge
      *       # kpi
      *       # linechart
      *       # piechart
      *       # pivot-table
      *       # scatterplot
      *       # table
      *       # treemap
      *       # extension
      *       # listbox
      * @param [cols] - Optional. Column definitions, dimensions and measures.
      *       Each entry can be of the following structures:
      *       # String
      *       # NxDimension
      *       # NxMeasure
      *       If the NxDimension or the NxMeasure refer to a library dimension
      *       or a library measure, you also need to add qType : "measure" or "dimension".
      * @param [options] - Optional. Options to set.
      * @return - A promise of a QVisualization.
      */
    def create(`type`: VisualizationType): IPromise[Any] = js.native
    def create(`type`: VisualizationType, cols: js.Array[Any]): IPromise[Any] = js.native
    def create(`type`: VisualizationType, cols: js.Array[Any], options: Any): IPromise[Any] = js.native
    def create(`type`: VisualizationType, cols: Unit, options: Any): IPromise[Any] = js.native
    
    /**
      * Gets an existing visualization.
      * @param id - Id for an existing visualization.
      * @return - A promise of a QVisualization.
      */
    def get(id: String): IPromise[Any] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension`
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.listbox
  */
  trait VisualizationType extends StObject
  object VisualizationType {
    
    inline def barchart: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart = "barchart".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart]
    
    inline def combochart: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart = "combochart".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart]
    
    inline def `extension`: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension` = "extension".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`extension`]
    
    inline def gauge: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge = "gauge".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge]
    
    inline def kpi: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi = "kpi".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi]
    
    inline def linechart: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart = "linechart".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart]
    
    inline def listbox: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.listbox = "listbox".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.listbox]
    
    inline def piechart: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart = "piechart".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart]
    
    inline def `pivot-table`: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table` = "pivot-table".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`]
    
    inline def scatterplot: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot = "scatterplot".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot]
    
    inline def table: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table = "table".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table]
    
    inline def treemap: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap = "treemap".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap]
  }
}
