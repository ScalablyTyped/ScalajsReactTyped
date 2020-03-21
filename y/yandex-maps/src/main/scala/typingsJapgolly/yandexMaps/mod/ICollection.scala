package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends IEventEmitter {
  def add(`object`: js.Object): this.type
  def getIterator(): IIterator
  def remove(`object`: js.Object): this.type
}

object ICollection {
  @scala.inline
  def apply(
    add: js.Object => CallbackTo[ICollection],
    events: IEventManager,
    getIterator: CallbackTo[IIterator],
    remove: js.Object => CallbackTo[ICollection]
  ): ICollection = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Object) => add(t0).runNow()))
    __obj.updateDynamic("getIterator")(getIterator.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Object) => remove(t0).runNow()))
    __obj.asInstanceOf[ICollection]
  }
}

