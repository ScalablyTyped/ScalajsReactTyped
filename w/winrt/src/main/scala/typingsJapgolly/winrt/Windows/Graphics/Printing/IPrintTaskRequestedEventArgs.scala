package typingsJapgolly.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequestedEventArgs extends js.Object {
  var request: PrintTaskRequest
}

object IPrintTaskRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskRequest): IPrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintTaskRequestedEventArgs]
  }
}

