package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ trait IMapObjectCollection
  extends ICollection
     with IParentOnMap {
  var options: IOptionManager
}

object IMapObjectCollection {
  @scala.inline
  def apply(
    add: js.Object => CallbackTo[IMapObjectCollection],
    events: IEventManager,
    getIterator: CallbackTo[IIterator],
    getMap: CallbackTo[Map_],
    options: IOptionManager,
    remove: js.Object => CallbackTo[IMapObjectCollection]
  ): IMapObjectCollection = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Object) => add(t0).runNow()))
    __obj.updateDynamic("getIterator")(getIterator.toJsFn)
    __obj.updateDynamic("getMap")(getMap.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Object) => remove(t0).runNow()))
    __obj.asInstanceOf[IMapObjectCollection]
  }
}

