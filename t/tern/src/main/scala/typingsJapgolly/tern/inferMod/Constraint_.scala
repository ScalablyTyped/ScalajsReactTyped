package typingsJapgolly.tern.inferMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint_ extends ANull {
  /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
  def propHint(): js.UndefOr[String]
  /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
  def typeHint(): js.UndefOr[Type]
}

object Constraint_ {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => Callback,
    forAllProps: /* repeated */ js.Any => Callback,
    gatherProperties: /* repeated */ js.Any => Callback,
    getFunctionType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull]],
    getObjType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull | Null]],
    getProp: /* repeated */ js.Any => CallbackTo[ANull],
    getSymbolType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull]],
    getType: /* repeated */ js.Any => CallbackTo[js.UndefOr[ANull | Null]],
    hasType: /* repeated */ js.Any => CallbackTo[Boolean],
    isEmpty: /* repeated */ js.Any => CallbackTo[Boolean],
    propHint: CallbackTo[js.UndefOr[String]],
    propagate: /* repeated */ js.Any => Callback,
    propagatesTo: CallbackTo[js.Any],
    toString: /* repeated */ js.Any => CallbackTo[String],
    typeHint: CallbackTo[js.UndefOr[Type]]
  ): Constraint_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => addType(t0).runNow()))
    __obj.updateDynamic("forAllProps")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => forAllProps(t0).runNow()))
    __obj.updateDynamic("gatherProperties")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => gatherProperties(t0).runNow()))
    __obj.updateDynamic("getFunctionType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getFunctionType(t0).runNow()))
    __obj.updateDynamic("getObjType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getObjType(t0).runNow()))
    __obj.updateDynamic("getProp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getProp(t0).runNow()))
    __obj.updateDynamic("getSymbolType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getSymbolType(t0).runNow()))
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getType(t0).runNow()))
    __obj.updateDynamic("hasType")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => hasType(t0).runNow()))
    __obj.updateDynamic("isEmpty")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => isEmpty(t0).runNow()))
    __obj.updateDynamic("propHint")(propHint.toJsFn)
    __obj.updateDynamic("propagate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => propagate(t0).runNow()))
    __obj.updateDynamic("propagatesTo")(propagatesTo.toJsFn)
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toString(t0).runNow()))
    __obj.updateDynamic("typeHint")(typeHint.toJsFn)
    __obj.asInstanceOf[Constraint_]
  }
}

