package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupColorMapping extends js.Object {
  /** Specifies the groupID for GroupColorMapping.
    * @Default {null}
    */
  var groupID: js.UndefOr[String] = js.undefined
}

object GroupColorMapping {
  @scala.inline
  def apply(groupID: String = null): GroupColorMapping = {
    val __obj = js.Dynamic.literal()
    if (groupID != null) __obj.updateDynamic("groupID")(groupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColorMapping]
  }
}

