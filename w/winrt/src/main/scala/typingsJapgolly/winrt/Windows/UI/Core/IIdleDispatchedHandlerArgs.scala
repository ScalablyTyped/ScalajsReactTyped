package typingsJapgolly.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdleDispatchedHandlerArgs extends js.Object {
  var isDispatcherIdle: Boolean
}

object IIdleDispatchedHandlerArgs {
  @scala.inline
  def apply(isDispatcherIdle: Boolean): IIdleDispatchedHandlerArgs = {
    val __obj = js.Dynamic.literal(isDispatcherIdle = isDispatcherIdle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIdleDispatchedHandlerArgs]
  }
}

