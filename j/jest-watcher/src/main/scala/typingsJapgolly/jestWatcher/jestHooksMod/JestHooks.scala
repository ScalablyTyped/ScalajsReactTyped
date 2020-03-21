package typingsJapgolly.jestWatcher.jestHooksMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestWatcher.ReadonlyJestHookEmitter
import typingsJapgolly.jestWatcher.ReadonlyJestHookSubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHooks extends js.Object {
  var _emitter: js.Any
  var _listeners: js.Any
  var _subscriber: js.Any
  def getEmitter(): ReadonlyJestHookEmitter
  def getSubscriber(): ReadonlyJestHookSubscribe
  def isUsed(hook: AvailableHooks): Double
}

object JestHooks {
  @scala.inline
  def apply(
    _emitter: js.Any,
    _listeners: js.Any,
    _subscriber: js.Any,
    getEmitter: CallbackTo[ReadonlyJestHookEmitter],
    getSubscriber: CallbackTo[ReadonlyJestHookSubscribe],
    isUsed: AvailableHooks => CallbackTo[Double]
  ): JestHooks = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any])
    __obj.updateDynamic("getEmitter")(getEmitter.toJsFn)
    __obj.updateDynamic("getSubscriber")(getSubscriber.toJsFn)
    __obj.updateDynamic("isUsed")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.jestHooksMod.AvailableHooks) => isUsed(t0).runNow()))
    __obj.asInstanceOf[JestHooks]
  }
}

