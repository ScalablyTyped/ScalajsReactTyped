package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.mod.RemoteWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindow extends js.Object {
  var window: RemoteWindow
}

object AnonWindow {
  @scala.inline
  def apply(window: RemoteWindow): AnonWindow = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWindow]
  }
}

