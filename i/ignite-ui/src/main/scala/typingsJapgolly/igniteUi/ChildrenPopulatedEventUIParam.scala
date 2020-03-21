package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenPopulatedEventUIParam extends js.Object {
  /**
  	 * Gets the data ID of the row.
  	 */
  var id: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the row element for the row that was populated.
  	 */
  var parentrow: js.UndefOr[String] = js.undefined
}

object ChildrenPopulatedEventUIParam {
  @scala.inline
  def apply(id: js.Any = null, owner: js.Any = null, parentrow: String = null): ChildrenPopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPopulatedEventUIParam]
  }
}

