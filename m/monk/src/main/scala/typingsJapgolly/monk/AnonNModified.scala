package typingsJapgolly.monk

import typingsJapgolly.monk.monkNumbers.`0`
import typingsJapgolly.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNModified extends js.Object {
  var n: Double
  var nModified: Double
  var ok: `1` | `0`
}

object AnonNModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: `1` | `0`): AnonNModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNModified]
  }
}

