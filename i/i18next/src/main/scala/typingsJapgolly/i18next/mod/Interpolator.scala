package typingsJapgolly.i18next.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolator extends js.Object {
  def init(options: InterpolationOptions, reset: Boolean): js.UndefOr[scala.Nothing]
  def interpolate(str: String, data: js.Object, lng: String, options: InterpolationOptions): String
  def nest(str: String, fc: js.Function1[/* repeated */ js.Any, _], options: InterpolationOptions): String
  def reset(): js.UndefOr[scala.Nothing]
  def resetRegExp(): js.UndefOr[scala.Nothing]
}

object Interpolator {
  @scala.inline
  def apply(
    init: (InterpolationOptions, Boolean) => CallbackTo[js.UndefOr[scala.Nothing]],
    interpolate: (String, js.Object, String, InterpolationOptions) => CallbackTo[String],
    nest: (String, js.Function1[/* repeated */ js.Any, js.Any], InterpolationOptions) => CallbackTo[String],
    reset: CallbackTo[js.UndefOr[scala.Nothing]],
    resetRegExp: CallbackTo[js.UndefOr[scala.Nothing]]
  ): Interpolator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction2((t0: typingsJapgolly.i18next.mod.InterpolationOptions, t1: scala.Boolean) => init(t0, t1).runNow()))
    __obj.updateDynamic("interpolate")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Object, t2: java.lang.String, t3: typingsJapgolly.i18next.mod.InterpolationOptions) => interpolate(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("nest")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any], t2: typingsJapgolly.i18next.mod.InterpolationOptions) => nest(t0, t1, t2).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("resetRegExp")(resetRegExp.toJsFn)
    __obj.asInstanceOf[Interpolator]
  }
}

