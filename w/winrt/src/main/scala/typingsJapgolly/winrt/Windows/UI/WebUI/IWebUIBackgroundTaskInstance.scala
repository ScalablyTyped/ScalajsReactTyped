package typingsJapgolly.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUIBackgroundTaskInstance extends js.Object {
  var succeeded: Boolean
}

object IWebUIBackgroundTaskInstance {
  @scala.inline
  def apply(succeeded: Boolean): IWebUIBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebUIBackgroundTaskInstance]
  }
}

