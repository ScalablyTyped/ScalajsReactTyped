package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterPlacemarkProperties extends IDataManager {
  var geoObjects: js.Array[IGeoObject]
}

object IClusterPlacemarkProperties {
  @scala.inline
  def apply(
    events: IEventManager,
    geoObjects: js.Array[IGeoObject],
    get: (String, js.Object) => CallbackTo[js.Object]
  ): IClusterPlacemarkProperties = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geoObjects = geoObjects.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => get(t0, t1).runNow()))
    __obj.asInstanceOf[IClusterPlacemarkProperties]
  }
}

