package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[Double]
  var `type`: typingsJapgolly.node.nodeStrings.Buffer
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[Double], `type`: typingsJapgolly.node.nodeStrings.Buffer): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

