package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreButtonClickedEventArgs extends ProcessingModeEventArgs {
  var handled: Boolean
  val interval: BootstrapTimeInterval
  val resource: String
  val targetDateTime: js.Date
}

object MoreButtonClickedEventArgs {
  @scala.inline
  def apply(
    handled: Boolean,
    interval: BootstrapTimeInterval,
    processOnServer: Boolean,
    resource: String,
    sender: Control,
    targetDateTime: js.Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], targetDateTime = targetDateTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
}

