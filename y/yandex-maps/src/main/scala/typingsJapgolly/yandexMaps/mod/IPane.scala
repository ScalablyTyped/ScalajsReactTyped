package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.yandexMaps.yandexMapsStrings.hidden
import typingsJapgolly.yandexMaps.yandexMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPane extends IEventEmitter {
  def destroy(): Unit
  def getElement(): HTMLElement
  def getMap(): Map_
  def getOverflow(): visible | hidden
  def getZIndex(): Double
}

object IPane {
  @scala.inline
  def apply(
    destroy: Callback,
    events: IEventManager,
    getElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map_],
    getOverflow: CallbackTo[visible | hidden],
    getZIndex: CallbackTo[Double]
  ): IPane = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getMap")(getMap.toJsFn)
    __obj.updateDynamic("getOverflow")(getOverflow.toJsFn)
    __obj.updateDynamic("getZIndex")(getZIndex.toJsFn)
    __obj.asInstanceOf[IPane]
  }
}

