package typingsJapgolly.undertakerRegistry.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndertakerRegistry extends js.Object {
  /**
    * Returns the task with that name or undefined if no task is registered with that name.
    * Useful for custom task storage.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    */
  def get[TTaskFunction](taskName: String): TTaskFunction
  /**
    * No-op method that receives the undertaker instance.
    * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taker - Instance of undertaker.
    */
  def init(taker: js.Any): Unit
  /**
    * Adds a task to the registry.
    * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
    * Useful for adding custom behavior to every task as it is registered in the system.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    * @param fn - Task function.
    */
  def set[TTaskFunction](taskName: String, fn: TTaskFunction): TTaskFunction
  /**
    * Returns an object listing all tasks in the registry.
    * Necessary to override if the get method is overridden for custom task storage.
    * Custom registries can override this when when inheriting from this default registry.
    */
  def tasks(): StringDictionary[js.Function1[/* repeated */ js.Any, _]]
}

object UndertakerRegistry {
  @scala.inline
  def apply(
    get: String => CallbackTo[js.Any],
    init: js.Any => Callback,
    set: (String, js.Any) => CallbackTo[js.Any],
    tasks: CallbackTo[StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]]
  ): UndertakerRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("tasks")(tasks.toJsFn)
    __obj.asInstanceOf[UndertakerRegistry]
  }
}

