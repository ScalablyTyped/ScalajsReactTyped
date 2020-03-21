package typingsJapgolly.typescriptTuple

import typingsJapgolly.typescriptTuple.typescriptTupleStrings.Infinite
import typingsJapgolly.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typingsJapgolly.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonERROR extends js.Object {
  var CODENAME: InfiniteLeft with Infinite
  var ERROR: `Left is not finite`
}

object AnonERROR {
  @scala.inline
  def apply(CODENAME: InfiniteLeft with Infinite, ERROR: `Left is not finite`): AnonERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonERROR]
  }
}

