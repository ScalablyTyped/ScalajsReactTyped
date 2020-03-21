package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
  var renderer: js.UndefOr[(js.Function1[/* context */ LabelContext[K, D], Anon1 | Unit | Null]) | Null] = js.undefined
  var style: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply[K, D](
    className: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String = null,
    renderer: /* context */ LabelContext[K, D] => CallbackTo[Anon1 | Unit | Null] = null,
    style: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String = null
  ): AnonStyle[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext[K, D]) => renderer(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle[K, D]]
  }
}

