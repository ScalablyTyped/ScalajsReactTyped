package typingsJapgolly.handsontable.mod.Handsontable._editors

import typingsJapgolly.handsontable.mod.Handsontable.CellValue
import typingsJapgolly.handsontable.mod.Handsontable.RowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Base {
  def prepareOptions(): Unit = js.native
  def prepareOptions(optionsToPrepare: js.Array[CellValue]): Unit = js.native
  def prepareOptions(optionsToPrepare: RowObject): Unit = js.native
  def refreshDimensions(): Unit = js.native
  def refreshValue(): Unit = js.native
  def registerHooks(): Unit = js.native
}

