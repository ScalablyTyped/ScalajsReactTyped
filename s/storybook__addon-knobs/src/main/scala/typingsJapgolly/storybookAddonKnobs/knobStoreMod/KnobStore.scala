package typingsJapgolly.storybookAddonKnobs.knobStoreMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.storybookAddonKnobs.AnonDefaultValue
import typingsJapgolly.storybookAddonKnobs.typeanygroupIdstringundef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobStore extends js.Object {
  var callbacks: js.Array[Callback]
  var store: Record[String, KnobStoreKnob]
  var timer: js.UndefOr[Double] = js.undefined
  def get(key: String): typeanygroupIdstringundef | AnonDefaultValue
  def getAll(): Record[String, KnobStoreKnob]
  def has(key: String): Boolean
  def markAllUnused(): Unit
  def reset(): Unit
  def set(key: String, value: KnobStoreKnob): Unit
  def subscribe(cb: Callback): Unit
  def unsubscribe(cb: Callback): Unit
  def update(key: String, options: Partial[KnobStoreKnob]): Unit
}

object KnobStore {
  @scala.inline
  def apply(
    callbacks: js.Array[Callback],
    get: String => CallbackTo[typeanygroupIdstringundef | AnonDefaultValue],
    getAll: CallbackTo[Record[String, KnobStoreKnob]],
    has: String => CallbackTo[Boolean],
    markAllUnused: japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    set: (String, KnobStoreKnob) => japgolly.scalajs.react.Callback,
    store: Record[String, KnobStoreKnob],
    subscribe: Callback => japgolly.scalajs.react.Callback,
    unsubscribe: Callback => japgolly.scalajs.react.Callback,
    update: (String, Partial[KnobStoreKnob]) => japgolly.scalajs.react.Callback,
    timer: Int | Double = null
  ): KnobStore = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("markAllUnused")(markAllUnused.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob) => set(t0, t1).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.Callback) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.Callback) => unsubscribe(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.Partial[typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob]) => update(t0, t1).runNow()))
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobStore]
  }
}

