package typingsJapgolly.uiGrid.mod.importer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridImporterApi extends js.Object {
  /**
    * Imports a file into the grid using the file object provided. Bypasses the grid menu
    * @param {File} fileObject The file we want to import as a javascript File object
    */
  def importFile(fileObject: File): Unit
}

object IGridImporterApi {
  @scala.inline
  def apply(importFile: File => Callback): IGridImporterApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("importFile")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.File) => importFile(t0).runNow()))
    __obj.asInstanceOf[IGridImporterApi]
  }
}

