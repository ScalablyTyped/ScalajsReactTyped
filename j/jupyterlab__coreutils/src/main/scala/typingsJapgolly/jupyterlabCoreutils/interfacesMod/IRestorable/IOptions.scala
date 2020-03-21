package typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsJapgolly.phosphorCommands.mod.CommandRegistry
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import typingsJapgolly.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: IObservableDisposable */]
  extends typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorer.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String]
  /**
    * The command registry which holds the restore command.
    */
  var registry: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: IObservableDisposable */](
    command: String,
    connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String],
    name: T => CallbackTo[String],
    registry: CommandRegistry,
    args: T => CallbackTo[ReadonlyJSONObject] = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(js.Any.fromFunction1((t0: T) => name(t0).runNow()))
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1((t0: T) => args(t0).runNow()))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

