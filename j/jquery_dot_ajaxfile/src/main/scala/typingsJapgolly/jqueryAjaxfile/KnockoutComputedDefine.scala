package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedDefine[T] extends js.Object {
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.undefined
  var owner: js.UndefOr[js.Any] = js.undefined
  var pure: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  def read(): T
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](
    read: CallbackTo[T],
    deferEvaluation: js.UndefOr[Boolean] = js.undefined,
    disposeWhen: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    disposeWhenNodeIsRemoved: Node = null,
    owner: js.Any = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    write: /* value */ T => Callback = null
  ): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(read.toJsFn)
    if (!js.isUndefined(deferEvaluation)) __obj.updateDynamic("deferEvaluation")(deferEvaluation.asInstanceOf[js.Any])
    disposeWhen.foreach(p => __obj.updateDynamic("disposeWhen")(p.toJsFn))
    if (disposeWhenNodeIsRemoved != null) __obj.updateDynamic("disposeWhenNodeIsRemoved")(disposeWhenNodeIsRemoved.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1((t0: /* value */ T) => write(t0).runNow()))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
}

