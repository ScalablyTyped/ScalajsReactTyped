package typingsJapgolly.flexmonster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flexmonster.AnonCharts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  var icons: AnonCharts
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
  @scala.inline
  def apply(
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
    icons: AnonCharts,
    openLocalReport: Callback,
    openRemoteReport: Callback,
    optionsHandler: Callback,
    printHandler: Callback,
    saveHandler: Callback
  ): Toolbar = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.updateDynamic("chartsHandler")(js.Any.fromFunction1((t0: java.lang.String) => chartsHandler(t0).runNow()))
    __obj.updateDynamic("chartsMultipleHandler")(chartsMultipleHandler.toJsFn)
    __obj.updateDynamic("conditionalFormattingHandler")(conditionalFormattingHandler.toJsFn)
    __obj.updateDynamic("connectLocalCSVHandler")(connectLocalCSVHandler.toJsFn)
    __obj.updateDynamic("connectLocalJSONHandler")(connectLocalJSONHandler.toJsFn)
    __obj.updateDynamic("connectOLAP")(connectOLAP.toJsFn)
    __obj.updateDynamic("connectRemoteCSV")(connectRemoteCSV.toJsFn)
    __obj.updateDynamic("connectRemoteJSON")(connectRemoteJSON.toJsFn)
    __obj.updateDynamic("exportHandler")(js.Any.fromFunction1((t0: java.lang.String) => exportHandler(t0).runNow()))
    __obj.updateDynamic("fieldsHandler")(fieldsHandler.toJsFn)
    __obj.updateDynamic("formatCellsHandler")(formatCellsHandler.toJsFn)
    __obj.updateDynamic("fullscreenHandler")(fullscreenHandler.toJsFn)
    __obj.updateDynamic("getTabs")(getTabs.toJsFn)
    __obj.updateDynamic("gridHandler")(gridHandler.toJsFn)
    __obj.updateDynamic("openLocalReport")(openLocalReport.toJsFn)
    __obj.updateDynamic("openRemoteReport")(openRemoteReport.toJsFn)
    __obj.updateDynamic("optionsHandler")(optionsHandler.toJsFn)
    __obj.updateDynamic("printHandler")(printHandler.toJsFn)
    __obj.updateDynamic("saveHandler")(saveHandler.toJsFn)
    __obj.asInstanceOf[Toolbar]
  }
}

