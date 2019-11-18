package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParentOnMap extends js.Object {
  def getMap(): Map
}

object IParentOnMap {
  @scala.inline
  def apply(getMap: CallbackTo[Map]): IParentOnMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMap")(getMap.toJsFn)
    __obj.asInstanceOf[IParentOnMap]
  }
}

