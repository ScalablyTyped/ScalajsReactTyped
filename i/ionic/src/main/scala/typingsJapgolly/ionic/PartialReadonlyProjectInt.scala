package typingsJapgolly.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.ProjectIntegration>> */
trait PartialReadonlyProjectInt extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialReadonlyProjectInt {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, root: String = null): PartialReadonlyProjectInt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReadonlyProjectInt]
  }
}

