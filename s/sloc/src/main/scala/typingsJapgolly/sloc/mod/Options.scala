package typingsJapgolly.sloc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: Boolean
}

object Options {
  @scala.inline
  def apply(debug: Boolean): Options = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

