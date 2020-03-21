package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create, access and modify named ranges in a spreadsheet. Named ranges are ranges that have
  * associated string aliases. They can be viewed and edited via the Sheets UI under the Data >
  * Named ranges... menu.
  */
trait NamedRange extends js.Object {
  def getName(): String
  def getRange(): Range
  def remove(): Unit
  def setName(name: String): NamedRange
  def setRange(range: Range): NamedRange
}

object NamedRange {
  @scala.inline
  def apply(
    getName: CallbackTo[String],
    getRange: CallbackTo[Range],
    remove: Callback,
    setName: String => CallbackTo[NamedRange],
    setRange: Range => CallbackTo[NamedRange]
  ): NamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setRange")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => setRange(t0).runNow()))
    __obj.asInstanceOf[NamedRange]
  }
}

