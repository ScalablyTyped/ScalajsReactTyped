package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var historyMode: js.UndefOr[String] = js.undefined
  var initialState: js.UndefOr[js.Object] = js.undefined
  var middlewares: js.Array[_]
  def addEffect(name: String, handler: js.Function0[_]): js.Any
}

object defaultOptions {
  @scala.inline
  def apply(
    addEffect: (String, js.Function0[js.Any]) => CallbackTo[js.Any],
    middlewares: js.Array[_],
    historyMode: String = null,
    initialState: js.Object = null
  ): defaultOptions = {
    val __obj = js.Dynamic.literal(middlewares = middlewares.asInstanceOf[js.Any])
    __obj.updateDynamic("addEffect")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[js.Any]) => addEffect(t0, t1).runNow()))
    if (historyMode != null) __obj.updateDynamic("historyMode")(historyMode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
}

