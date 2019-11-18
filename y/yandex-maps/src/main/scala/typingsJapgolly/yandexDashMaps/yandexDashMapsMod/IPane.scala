package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.hidden
import typingsJapgolly.yandexDashMaps.yandexDashMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPane extends IEventEmitter {
  def destroy(): Unit
  def getElement(): HTMLElement
  def getMap(): Map
  def getOverflow(): visible | hidden
  def getZIndex(): Double
}

object IPane {
  @scala.inline
  def apply(
    destroy: Callback,
    events: IEventManager,
    getElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map],
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

