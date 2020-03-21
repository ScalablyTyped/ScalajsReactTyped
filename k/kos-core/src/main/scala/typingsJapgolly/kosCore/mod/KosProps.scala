package typingsJapgolly.kosCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosProps[T] extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], Unit]] = js.undefined
  var getNamespace: js.UndefOr[js.Function0[String]] = js.undefined
  var getParam: js.UndefOr[js.Function0[_]] = js.undefined
}

object KosProps {
  @scala.inline
  def apply[T](
    dispatch: /* action */ Action[T] => Callback = null,
    getNamespace: js.UndefOr[CallbackTo[String]] = js.undefined,
    getParam: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): KosProps[T] = {
    val __obj = js.Dynamic.literal()
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.kosCore.mod.Action[T]) => dispatch(t0).runNow()))
    getNamespace.foreach(p => __obj.updateDynamic("getNamespace")(p.toJsFn))
    getParam.foreach(p => __obj.updateDynamic("getParam")(p.toJsFn))
    __obj.asInstanceOf[KosProps[T]]
  }
}

