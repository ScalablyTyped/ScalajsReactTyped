package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sizzle.sizzleMod.Selectors.AttrHandleFunctions
import typingsJapgolly.sizzle.sizzleMod.Selectors.CreatePseudoFunction
import typingsJapgolly.sizzle.sizzleMod.Selectors.FilterFunctions
import typingsJapgolly.sizzle.sizzleMod.Selectors.FindFunctions
import typingsJapgolly.sizzle.sizzleMod.Selectors.Matches
import typingsJapgolly.sizzle.sizzleMod.Selectors.PreFilterFunctions
import typingsJapgolly.sizzle.sizzleMod.Selectors.PseudoFunction
import typingsJapgolly.sizzle.sizzleMod.Selectors.PseudoFunctions
import typingsJapgolly.sizzle.sizzleMod.Selectors.SetFilterFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors
  extends typingsJapgolly.sizzle.sizzleMod.Selectors {
  /**
    * @deprecated ​ Deprecated since 3.0. Use \`{@link Selectors#pseudos }\`.
    *
    * **Cause**: The standard way to add new custom selectors through jQuery is `jQuery.expr.pseudos`. These two other aliases are deprecated, although they still work as of jQuery 3.0.
    *
    * **Solution**: Rename any of the older usage to `jQuery.expr.pseudos`. The functionality is identical.
    */
  var `:`: PseudoFunctions
}

object Selectors {
  @scala.inline
  def apply(
    `:`: PseudoFunctions,
    attrHandle: AttrHandleFunctions,
    cacheLength: Double,
    createPseudo: CreatePseudoFunction => CallbackTo[PseudoFunction],
    filter: FilterFunctions,
    find: FindFunctions,
    `match`: Matches,
    preFilter: PreFilterFunctions,
    pseudos: PseudoFunctions,
    setFilters: SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle.asInstanceOf[js.Any], cacheLength = cacheLength.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], preFilter = preFilter.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], setFilters = setFilters.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(`:`.asInstanceOf[js.Any])
    __obj.updateDynamic("createPseudo")(js.Any.fromFunction1((t0: typingsJapgolly.sizzle.sizzleMod.Selectors.CreatePseudoFunction) => createPseudo(t0).runNow()))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectors]
  }
}

