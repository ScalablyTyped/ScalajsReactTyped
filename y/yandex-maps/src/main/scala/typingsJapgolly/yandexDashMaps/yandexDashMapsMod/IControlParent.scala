package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlParent extends IParentOnMap {
  def getChildElement(child: IControl): js.Promise[HTMLElement]
}

object IControlParent {
  @scala.inline
  def apply(getChildElement: IControl => CallbackTo[js.Promise[HTMLElement]], getMap: CallbackTo[Map]): IControlParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getChildElement")(js.Any.fromFunction1((t0: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IControl) => getChildElement(t0).runNow()))
    __obj.updateDynamic("getMap")(getMap.toJsFn)
    __obj.asInstanceOf[IControlParent]
  }
}

