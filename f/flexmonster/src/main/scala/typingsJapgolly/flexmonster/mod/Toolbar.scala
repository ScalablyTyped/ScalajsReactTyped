package typingsJapgolly.flexmonster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flexmonster.anon.Charts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbar extends StObject {
  
  // Charts tab
  def chartsHandler(`type`: String): Unit
  
  def chartsMultipleHandler(): Unit
  
  def conditionalFormattingHandler(): Unit
  
  // Connect tab
  def connectLocalCSVHandler(): Unit
  
  def connectLocalJSONHandler(): Unit
  
  def connectOLAP(): Unit
  
  def connectRemoteCSV(): Unit
  
  def connectRemoteJSON(): Unit
  
  def exportHandler(`type`: String): Unit
  
  // Fields tab
  def fieldsHandler(): Unit
  
  // Format tab
  def formatCellsHandler(): Unit
  
  // Fullscreen tab
  def fullscreenHandler(): Unit
  
  def getTabs(): js.Array[ToolbarTab]
  
  // Grid tab
  def gridHandler(): Unit
  
  var icons: Charts
  
  // Open tab
  def openLocalReport(): Unit
  
  def openRemoteReport(): Unit
  
  // Options tab
  def optionsHandler(): Unit
  
  // Export tab
  def printHandler(): Unit
  
  // Save tab
  def saveHandler(): Unit
}
object Toolbar {
  
  inline def apply(
    chartsHandler: String => Callback,
    chartsMultipleHandler: Callback,
    conditionalFormattingHandler: Callback,
    connectLocalCSVHandler: Callback,
    connectLocalJSONHandler: Callback,
    connectOLAP: Callback,
    connectRemoteCSV: Callback,
    connectRemoteJSON: Callback,
    exportHandler: String => Callback,
    fieldsHandler: Callback,
    formatCellsHandler: Callback,
    fullscreenHandler: Callback,
    getTabs: CallbackTo[js.Array[ToolbarTab]],
    gridHandler: Callback,
    icons: Charts,
    openLocalReport: Callback,
    openRemoteReport: Callback,
    optionsHandler: Callback,
    printHandler: Callback,
    saveHandler: Callback
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = js.Any.fromFunction1((t0: String) => chartsHandler(t0).runNow()), chartsMultipleHandler = chartsMultipleHandler.toJsFn, conditionalFormattingHandler = conditionalFormattingHandler.toJsFn, connectLocalCSVHandler = connectLocalCSVHandler.toJsFn, connectLocalJSONHandler = connectLocalJSONHandler.toJsFn, connectOLAP = connectOLAP.toJsFn, connectRemoteCSV = connectRemoteCSV.toJsFn, connectRemoteJSON = connectRemoteJSON.toJsFn, exportHandler = js.Any.fromFunction1((t0: String) => exportHandler(t0).runNow()), fieldsHandler = fieldsHandler.toJsFn, formatCellsHandler = formatCellsHandler.toJsFn, fullscreenHandler = fullscreenHandler.toJsFn, getTabs = getTabs.toJsFn, gridHandler = gridHandler.toJsFn, icons = icons.asInstanceOf[js.Any], openLocalReport = openLocalReport.toJsFn, openRemoteReport = openRemoteReport.toJsFn, optionsHandler = optionsHandler.toJsFn, printHandler = printHandler.toJsFn, saveHandler = saveHandler.toJsFn)
    __obj.asInstanceOf[Toolbar]
  }
  
  extension [Self <: Toolbar](x: Self) {
    
    inline def setChartsHandler(value: String => Callback): Self = StObject.set(x, "chartsHandler", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setChartsMultipleHandler(value: Callback): Self = StObject.set(x, "chartsMultipleHandler", value.toJsFn)
    
    inline def setConditionalFormattingHandler(value: Callback): Self = StObject.set(x, "conditionalFormattingHandler", value.toJsFn)
    
    inline def setConnectLocalCSVHandler(value: Callback): Self = StObject.set(x, "connectLocalCSVHandler", value.toJsFn)
    
    inline def setConnectLocalJSONHandler(value: Callback): Self = StObject.set(x, "connectLocalJSONHandler", value.toJsFn)
    
    inline def setConnectOLAP(value: Callback): Self = StObject.set(x, "connectOLAP", value.toJsFn)
    
    inline def setConnectRemoteCSV(value: Callback): Self = StObject.set(x, "connectRemoteCSV", value.toJsFn)
    
    inline def setConnectRemoteJSON(value: Callback): Self = StObject.set(x, "connectRemoteJSON", value.toJsFn)
    
    inline def setExportHandler(value: String => Callback): Self = StObject.set(x, "exportHandler", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFieldsHandler(value: Callback): Self = StObject.set(x, "fieldsHandler", value.toJsFn)
    
    inline def setFormatCellsHandler(value: Callback): Self = StObject.set(x, "formatCellsHandler", value.toJsFn)
    
    inline def setFullscreenHandler(value: Callback): Self = StObject.set(x, "fullscreenHandler", value.toJsFn)
    
    inline def setGetTabs(value: CallbackTo[js.Array[ToolbarTab]]): Self = StObject.set(x, "getTabs", value.toJsFn)
    
    inline def setGridHandler(value: Callback): Self = StObject.set(x, "gridHandler", value.toJsFn)
    
    inline def setIcons(value: Charts): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setOpenLocalReport(value: Callback): Self = StObject.set(x, "openLocalReport", value.toJsFn)
    
    inline def setOpenRemoteReport(value: Callback): Self = StObject.set(x, "openRemoteReport", value.toJsFn)
    
    inline def setOptionsHandler(value: Callback): Self = StObject.set(x, "optionsHandler", value.toJsFn)
    
    inline def setPrintHandler(value: Callback): Self = StObject.set(x, "printHandler", value.toJsFn)
    
    inline def setSaveHandler(value: Callback): Self = StObject.set(x, "saveHandler", value.toJsFn)
  }
}
