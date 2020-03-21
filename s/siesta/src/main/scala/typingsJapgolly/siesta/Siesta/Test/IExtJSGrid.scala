package typingsJapgolly.siesta.Siesta.Test

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IExtJSGrid extends js.Object {
  def getCell(panel: js.Any, row: Double, column: Double): HTMLElement = js.native
  def getFirstCell(panel: js.Any): HTMLElement = js.native
  def getFirstRow(panel: js.Any): js.Any = js.native
  def getLastCellInRow(panel: js.Any, row: Double): HTMLElement = js.native
  def getRow(panel: js.Any, index: Double): js.Any = js.native
  def matchGridCellContent(panel: js.Any, row: Double, column: Double, string: String): Unit = js.native
  def matchGridCellContent(panel: js.Any, row: Double, column: Double, string: String, description: String): Unit = js.native
  def matchGridCellContent(panel: js.Any, row: Double, column: Double, string: RegExp): Unit = js.native
  def matchGridCellContent(panel: js.Any, row: Double, column: Double, string: RegExp, description: String): Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function): Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
}

