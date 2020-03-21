package typingsJapgolly.modernizr

import typingsJapgolly.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatauriBoolean extends Boolean {
  var over32kb: scala.Boolean
}

object DatauriBoolean {
  @scala.inline
  def apply(over32kb: scala.Boolean): DatauriBoolean = {
    val __obj = js.Dynamic.literal(over32kb = over32kb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatauriBoolean]
  }
}

