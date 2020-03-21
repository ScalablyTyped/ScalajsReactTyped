package typingsJapgolly.jqueryColorpicker

import typingsJapgolly.jqueryColorpicker.jqueryColorpickerStrings.close
import typingsJapgolly.jqueryColorpicker.jqueryColorpickerStrings.destroy
import typingsJapgolly.jqueryColorpicker.jqueryColorpickerStrings.open
import typingsJapgolly.jqueryColorpicker.jqueryColorpickerStrings.setColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def colorpicker(): JQuery = js.native
  def colorpicker(method: String): JQuery = js.native
  def colorpicker(method: String, params: js.Any*): JQuery = js.native
  def colorpicker(options: JQueryColorpickerOptions): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_close(method: close): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_destroy(method: destroy): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_open(method: open): JQuery = js.native
  @JSName("colorpicker")
  def colorpicker_setColor(method: setColor, color: js.Any): JQuery = js.native
}

