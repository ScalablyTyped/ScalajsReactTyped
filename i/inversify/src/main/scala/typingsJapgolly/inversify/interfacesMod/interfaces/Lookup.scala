package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[T] extends Clonable[Lookup[T]] {
  def add(serviceIdentifier: ServiceIdentifier[_], value: T): Unit
  def get(serviceIdentifier: ServiceIdentifier[_]): js.Array[T]
  def getMap(): Map[ServiceIdentifier[_], js.Array[T]]
  def hasKey(serviceIdentifier: ServiceIdentifier[_]): Boolean
  def remove(serviceIdentifier: ServiceIdentifier[_]): Unit
  def removeByCondition(condition: js.Function1[/* item */ T, Boolean]): Unit
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit]): Unit
}

object Lookup {
  @scala.inline
  def apply[T](
    add: (ServiceIdentifier[js.Any], T) => Callback,
    get: ServiceIdentifier[js.Any] => CallbackTo[js.Array[T]],
    getMap: CallbackTo[Map[ServiceIdentifier[js.Any], js.Array[T]]],
    hasKey: ServiceIdentifier[js.Any] => CallbackTo[Boolean],
    remove: ServiceIdentifier[js.Any] => Callback,
    removeByCondition: js.Function1[/* item */ T, Boolean] => Callback,
    traverse: js.Function2[/* key */ ServiceIdentifier[js.Any], /* value */ js.Array[T], Unit] => Callback
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], t1: T) => add(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]) => get(t0).runNow()))
    __obj.updateDynamic("getMap")(getMap.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]) => hasKey(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]) => remove(t0).runNow()))
    __obj.updateDynamic("removeByCondition")(js.Any.fromFunction1((t0: js.Function1[/* item */ T, scala.Boolean]) => removeByCondition(t0).runNow()))
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function2[
  /* key */ typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
  /* value */ js.Array[T], 
  scala.Unit]) => traverse(t0).runNow()))
    __obj.asInstanceOf[Lookup[T]]
  }
}

