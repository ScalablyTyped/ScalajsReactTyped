package typingsJapgolly.sharepoint.SP

import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
class PageRequestSucceededEventArgs () extends EventArgs {
  def get_executor(): WebRequestExecutor = js.native
}

