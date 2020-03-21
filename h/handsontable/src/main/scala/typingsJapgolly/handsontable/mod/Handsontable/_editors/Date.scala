package typingsJapgolly.handsontable.mod.Handsontable._editors

import typingsJapgolly.pikaday.mod.PikadayOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends Text {
  def destroyElements(): Unit = js.native
  def getDatePickerConfig(): PikadayOptions = js.native
  def hideDatepicker(): Unit = js.native
  def showDatepicker(): Unit = js.native
  def showDatepicker(event: Event_): Unit = js.native
}

