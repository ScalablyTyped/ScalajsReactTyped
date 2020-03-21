package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratePrimaryKeyValueEventUIParam extends js.Object {
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the auto-generated primary key (the number of records in the data source + 1) or set a custom unique primary key for the new row.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object GeneratePrimaryKeyValueEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, value: js.Any = null): GeneratePrimaryKeyValueEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratePrimaryKeyValueEventUIParam]
  }
}

