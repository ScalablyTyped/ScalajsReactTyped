package typingsJapgolly.codemirror

import typingsJapgolly.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchor extends js.Object {
  var anchor: Position
  var head: Position
}

object AnonAnchor {
  @scala.inline
  def apply(anchor: Position, head: Position): AnonAnchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnchor]
  }
}

