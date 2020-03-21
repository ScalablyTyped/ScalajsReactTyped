package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseGeometry extends IEventEmitter {
  def getBounds(): js.Array[js.Array[Double]] | Null
  def getType(): String
}

object IBaseGeometry {
  @scala.inline
  def apply(
    events: IEventManager,
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getType: CallbackTo[String]
  ): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[IBaseGeometry]
  }
}

