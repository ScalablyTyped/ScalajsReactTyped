package typingsJapgolly.kendoUi.kendo.ooxml

import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ooxml.Workbook")
@js.native
class Workbook () extends Observable_ {
  def this(options: WorkbookOptions) = this()
  var options: WorkbookOptions = js.native
  var sheets: js.Array[WorkbookSheet] = js.native
  def toDataURL(): String = js.native
  def toDataURLAsync(): JQueryPromise[_] = js.native
}

