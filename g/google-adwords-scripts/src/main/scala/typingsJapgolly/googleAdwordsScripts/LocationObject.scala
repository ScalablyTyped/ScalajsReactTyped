package typingsJapgolly.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationObject extends js.Object {
  var bidModifier: js.UndefOr[Double] = js.undefined
  var id: Double
}

object LocationObject {
  @scala.inline
  def apply(id: Double, bidModifier: Int | Double = null): LocationObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (bidModifier != null) __obj.updateDynamic("bidModifier")(bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
}

