package typingsJapgolly.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToConnectionErrorEventArgs extends js.Object {
  var code: PlayToConnectionError
  var message: String
}

object IPlayToConnectionErrorEventArgs {
  @scala.inline
  def apply(code: PlayToConnectionError, message: String): IPlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlayToConnectionErrorEventArgs]
  }
}

