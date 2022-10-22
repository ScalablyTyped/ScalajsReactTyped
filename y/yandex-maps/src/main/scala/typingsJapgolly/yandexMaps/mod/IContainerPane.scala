package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.yandexMaps.yandexMapsStrings.hidden
import typingsJapgolly.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContainerPane
  extends StObject
     with IPane
     with IPositioningContext
object IContainerPane {
  
  inline def apply(
    destroy: Callback,
    events: IEventManager[js.Object],
    fromClientPixels: js.Array[Double] => js.Array[Double],
    getElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map_],
    getOverflow: CallbackTo[visible | hidden],
    getZIndex: CallbackTo[Double],
    getZoom: CallbackTo[Double],
    toClientPixels: js.Array[Double] => js.Array[Double]
  ): IContainerPane = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, events = events.asInstanceOf[js.Any], fromClientPixels = js.Any.fromFunction1(fromClientPixels), getElement = getElement.toJsFn, getMap = getMap.toJsFn, getOverflow = getOverflow.toJsFn, getZIndex = getZIndex.toJsFn, getZoom = getZoom.toJsFn, toClientPixels = js.Any.fromFunction1(toClientPixels))
    __obj.asInstanceOf[IContainerPane]
  }
}
