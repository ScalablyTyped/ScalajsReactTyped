package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A persistor is a redux store unto itself, allowing you to purge stored state, flush all
  * pending state serialization and immediately write to disk
  */
trait Persistor extends js.Object {
  def dispatch(action: PersistorAction): PersistorAction
  def flush(): js.Promise[_]
  def getState(): PersistorState
  def pause(): Unit
  def persist(): Unit
  def purge(): js.Promise[_]
  def subscribe(callback: PersistorSubscribeCallback): js.Function0[_]
}

object Persistor {
  @scala.inline
  def apply(
    dispatch: PersistorAction => CallbackTo[PersistorAction],
    flush: CallbackTo[js.Promise[js.Any]],
    getState: CallbackTo[PersistorState],
    pause: Callback,
    persist: Callback,
    purge: CallbackTo[js.Promise[js.Any]],
    subscribe: PersistorSubscribeCallback => CallbackTo[js.Function0[js.Any]]
  ): Persistor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: typingsJapgolly.reduxPersist.typesMod.PersistorAction) => dispatch(t0).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("persist")(persist.toJsFn)
    __obj.updateDynamic("purge")(purge.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.reduxPersist.typesMod.PersistorSubscribeCallback) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Persistor]
  }
}

