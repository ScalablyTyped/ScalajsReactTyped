package typingsJapgolly.iron

import typingsJapgolly.iron.mod.Key
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Buffer
  var key: Key
}

object AnonData {
  @scala.inline
  def apply(data: Buffer, key: Key): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

