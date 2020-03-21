package typingsJapgolly.reactWithStyles.themedStyleSheetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemedStyleSheet extends js.Object {
  def create(makeFromTheme: js.Any): js.Any
  def createLTR(makeFromTheme: js.Any): js.Any
  def createRTL(makeFromTheme: js.Any): js.Any
  def flush(): Unit
  def get(): js.Any
  def registerInterface(registerInterface: js.Any): Unit
  def registerTheme(theme: js.Any): Unit
  def resolve(): js.Any
  def resolveLTR(): js.Any
  def resolveRTL(): js.Any
}

object ThemedStyleSheet {
  @scala.inline
  def apply(
    create: js.Any => CallbackTo[js.Any],
    createLTR: js.Any => CallbackTo[js.Any],
    createRTL: js.Any => CallbackTo[js.Any],
    flush: Callback,
    get: CallbackTo[js.Any],
    registerInterface: js.Any => Callback,
    registerTheme: js.Any => Callback,
    resolve: CallbackTo[js.Any],
    resolveLTR: CallbackTo[js.Any],
    resolveRTL: CallbackTo[js.Any]
  ): ThemedStyleSheet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Any) => create(t0).runNow()))
    __obj.updateDynamic("createLTR")(js.Any.fromFunction1((t0: js.Any) => createLTR(t0).runNow()))
    __obj.updateDynamic("createRTL")(js.Any.fromFunction1((t0: js.Any) => createRTL(t0).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("registerInterface")(js.Any.fromFunction1((t0: js.Any) => registerInterface(t0).runNow()))
    __obj.updateDynamic("registerTheme")(js.Any.fromFunction1((t0: js.Any) => registerTheme(t0).runNow()))
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.updateDynamic("resolveLTR")(resolveLTR.toJsFn)
    __obj.updateDynamic("resolveRTL")(resolveRTL.toJsFn)
    __obj.asInstanceOf[ThemedStyleSheet]
  }
}

