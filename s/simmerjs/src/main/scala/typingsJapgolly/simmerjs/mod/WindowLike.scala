package typingsJapgolly.simmerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLike extends Scope {
  var document: Queryable
}

object WindowLike {
  @scala.inline
  def apply(document: Queryable): WindowLike = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowLike]
  }
}

