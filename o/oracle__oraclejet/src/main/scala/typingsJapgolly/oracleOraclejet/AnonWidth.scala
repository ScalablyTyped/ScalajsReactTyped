package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth[K, D] extends js.Object {
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
  var width: enable | disable
}

object AnonWidth {
  @scala.inline
  def apply[K, D](
    width: enable | disable,
    height: (js.Function1[/* context */ HeaderContext[K, D], String]) | String = null
  ): AnonWidth[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth[K, D]]
  }
}

