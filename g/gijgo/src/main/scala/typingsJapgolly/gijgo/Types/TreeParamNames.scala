package typingsJapgolly.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeParamNames extends js.Object {
  var parentId: js.UndefOr[String] = js.undefined
}

object TreeParamNames {
  @scala.inline
  def apply(parentId: String = null): TreeParamNames = {
    val __obj = js.Dynamic.literal()
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeParamNames]
  }
}

