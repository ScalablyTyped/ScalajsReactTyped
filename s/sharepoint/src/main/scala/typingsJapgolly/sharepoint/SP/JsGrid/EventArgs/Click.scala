package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import typingsJapgolly.sharepoint.SP.JsGrid.ClickContext
import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.Click")
@js.native
class Click protected () extends IEventArgs {
  def this(eventInfo: DomEvent, context: ClickContext, recordKey: Double, fieldKey: String) = this()
  var context: ClickContext = js.native
  var eventInfo: DomEvent = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

