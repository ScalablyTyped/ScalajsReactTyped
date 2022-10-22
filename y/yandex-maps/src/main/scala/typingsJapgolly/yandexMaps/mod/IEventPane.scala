package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.yandexMaps.yandexMapsStrings.hidden
import typingsJapgolly.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventPane
  extends StObject
     with IPane
object IEventPane {
  
  inline def apply(
    destroy: Callback,
    events: IEventManager[js.Object],
    getElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map_],
    getOverflow: CallbackTo[visible | hidden],
    getZIndex: CallbackTo[Double]
  ): IEventPane = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, events = events.asInstanceOf[js.Any], getElement = getElement.toJsFn, getMap = getMap.toJsFn, getOverflow = getOverflow.toJsFn, getZIndex = getZIndex.toJsFn)
    __obj.asInstanceOf[IEventPane]
  }
}
