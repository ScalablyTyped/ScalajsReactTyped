package typingsJapgolly.envToObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var parsers: Parsers
}

object Options {
  @scala.inline
  def apply(parsers: Parsers): Options = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

