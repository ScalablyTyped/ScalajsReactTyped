package typingsJapgolly.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabDetachInfo extends js.Object {
  var oldPosition: Double
  var oldWindowId: Double
}

object TabDetachInfo {
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): TabDetachInfo = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabDetachInfo]
  }
}

