package typingsJapgolly.bunyanLogentries.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  var token: String
}

object StreamOptions {
  @scala.inline
  def apply(token: String): StreamOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamOptions]
  }
}

