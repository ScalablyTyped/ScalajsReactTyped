package typingsJapgolly.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait json extends js.Object {
  var conditions: js.UndefOr[js.Object] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}

object json {
  @scala.inline
  def apply(conditions: js.Object = null, path: String = null, value: String | Double | Boolean = null): json = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[json]
  }
}

