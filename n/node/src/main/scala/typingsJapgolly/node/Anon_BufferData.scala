package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferData extends js.Object {
  var data: js.Array[Double]
  var `type`: typingsJapgolly.node.nodeStrings.Buffer
}

object Anon_BufferData {
  @scala.inline
  def apply(data: js.Array[Double], `type`: typingsJapgolly.node.nodeStrings.Buffer): Anon_BufferData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferData]
  }
}

