package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabControlTabEventArgs extends EventArgs {
  val tab: BootstrapTab
}

object TabControlTabEventArgs {
  @scala.inline
  def apply(sender: Control, tab: BootstrapTab): TabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabControlTabEventArgs]
  }
}

