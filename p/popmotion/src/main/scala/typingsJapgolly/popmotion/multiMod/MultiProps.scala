package typingsJapgolly.popmotion.multiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiProps[A, T, V, I] extends js.Object {
  def getCount(actions: A): Double
  def getFirst(subs: T): ColdSubscription
  def getOutput(): V
  def mapApi(subs: T, methodName: String): js.Function1[/* repeated */ js.Any, V]
  def setProp(output: V, name: I, value: js.Any): js.Any
  def startActions(actions: A, starter: ActionStarter[I]): T
}

object MultiProps {
  @scala.inline
  def apply[A, T, V, I](
    getCount: A => CallbackTo[Double],
    getFirst: T => CallbackTo[ColdSubscription],
    getOutput: CallbackTo[V],
    mapApi: (T, String) => CallbackTo[js.Function1[/* repeated */ js.Any, V]],
    setProp: (V, I, js.Any) => CallbackTo[js.Any],
    startActions: (A, ActionStarter[I]) => CallbackTo[T]
  ): MultiProps[A, T, V, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCount")(js.Any.fromFunction1((t0: A) => getCount(t0).runNow()))
    __obj.updateDynamic("getFirst")(js.Any.fromFunction1((t0: T) => getFirst(t0).runNow()))
    __obj.updateDynamic("getOutput")(getOutput.toJsFn)
    __obj.updateDynamic("mapApi")(js.Any.fromFunction2((t0: T, t1: java.lang.String) => mapApi(t0, t1).runNow()))
    __obj.updateDynamic("setProp")(js.Any.fromFunction3((t0: V, t1: I, t2: js.Any) => setProp(t0, t1, t2).runNow()))
    __obj.updateDynamic("startActions")(js.Any.fromFunction2((t0: A, t1: typingsJapgolly.popmotion.multiMod.ActionStarter[I]) => startActions(t0, t1).runNow()))
    __obj.asInstanceOf[MultiProps[A, T, V, I]]
  }
}

