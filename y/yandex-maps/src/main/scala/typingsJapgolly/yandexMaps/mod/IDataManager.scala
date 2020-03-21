package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataManager extends IEventEmitter {
  def get(path: String, defaultValue: js.Object): js.Object
}

object IDataManager {
  @scala.inline
  def apply(events: IEventManager, get: (String, js.Object) => CallbackTo[js.Object]): IDataManager = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => get(t0, t1).runNow()))
    __obj.asInstanceOf[IDataManager]
  }
}

