package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IChangeKey
import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnBeginUndoDataUpdateChange")
@js.native
class OnBeginUndoDataUpdateChange protected () extends IEventArgs {
  def this(changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
}

