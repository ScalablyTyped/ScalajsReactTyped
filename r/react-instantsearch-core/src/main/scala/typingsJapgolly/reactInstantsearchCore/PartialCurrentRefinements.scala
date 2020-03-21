package typingsJapgolly.reactInstantsearchCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactInstantsearchCore.mod.Refinement
import typingsJapgolly.reactInstantsearchCore.mod.RefinementValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.CurrentRefinementsProvided> */
trait PartialCurrentRefinements extends js.Object {
  var items: js.UndefOr[js.Array[Refinement]] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var refine: js.UndefOr[js.Function1[/* refinement */ RefinementValue | js.Array[RefinementValue], Unit]] = js.undefined
}

object PartialCurrentRefinements {
  @scala.inline
  def apply(
    items: js.Array[Refinement] = null,
    query: String = null,
    refine: /* refinement */ RefinementValue | js.Array[RefinementValue] => Callback = null
  ): PartialCurrentRefinements = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (refine != null) __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: /* refinement */ typingsJapgolly.reactInstantsearchCore.mod.RefinementValue | js.Array[typingsJapgolly.reactInstantsearchCore.mod.RefinementValue]) => refine(t0).runNow()))
    __obj.asInstanceOf[PartialCurrentRefinements]
  }
}

