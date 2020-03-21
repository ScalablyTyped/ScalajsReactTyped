package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import typingsJapgolly.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
@js.native
class RecordChecked protected () extends IEventArgs {
  def this(recordKeySet: Set, bChecked: Boolean) = this()
  var bChecked: Boolean = js.native
  var recordKeySet: Set = js.native
}

