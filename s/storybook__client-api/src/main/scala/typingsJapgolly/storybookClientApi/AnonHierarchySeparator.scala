package typingsJapgolly.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHierarchySeparator extends js.Object {
  var hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.undefined
  var hierarchySeparator: String
}

object AnonHierarchySeparator {
  @scala.inline
  def apply(hierarchySeparator: String, hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.undefined): AnonHierarchySeparator = {
    val __obj = js.Dynamic.literal(hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(hierarchyRootSeparator)) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHierarchySeparator]
  }
}

