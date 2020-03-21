package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import typingsJapgolly.oracleOraclejet.ojnavigationlistMod.ojTabBar.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRendererSelectable[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object AnonRendererSelectable {
  @scala.inline
  def apply[K, D](
    renderer: /* context */ ItemContext[K, D] => Callback = null,
    selectable: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean = null
  ): AnonRendererSelectable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojnavigationlistMod.ojTabBar.ItemContext[K, D]) => renderer(t0).runNow()))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRendererSelectable[K, D]]
  }
}

