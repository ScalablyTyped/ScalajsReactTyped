package typingsJapgolly.tryer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tryer.tryer.Options> */
trait ReadonlyOptions extends js.Object {
  val action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.undefined
  val fail: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  val interval: js.UndefOr[Double] = js.undefined
  val limit: js.UndefOr[Double] = js.undefined
  val pass: js.UndefOr[js.Function0[Unit]] = js.undefined
  val until: js.UndefOr[js.Function0[Boolean]] = js.undefined
  val when: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object ReadonlyOptions {
  @scala.inline
  def apply(
    action: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _]) = null,
    fail: /* err */ js.Error => Callback = null,
    interval: Int | Double = null,
    limit: Int | Double = null,
    pass: js.UndefOr[Callback] = js.undefined,
    until: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    when: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ js.Error) => fail(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    pass.foreach(p => __obj.updateDynamic("pass")(p.toJsFn))
    until.foreach(p => __obj.updateDynamic("until")(p.toJsFn))
    when.foreach(p => __obj.updateDynamic("when")(p.toJsFn))
    __obj.asInstanceOf[ReadonlyOptions]
  }
}

