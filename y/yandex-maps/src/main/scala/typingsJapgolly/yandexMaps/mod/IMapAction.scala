package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.yandexMaps.mod.map.action.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: Manager): Unit
  def end(): Unit
}

object IMapAction {
  @scala.inline
  def apply(begin: Manager => Callback, end: Callback, events: IEventManager): IMapAction = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: typingsJapgolly.yandexMaps.mod.map.action.Manager) => begin(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.asInstanceOf[IMapAction]
  }
}

