package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.yandexMaps.yandexMapsStrings.hidden
import typingsJapgolly.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPane
  extends StObject
     with IEventEmitter {
  
  def destroy(): Unit
  
  def getElement(): HTMLElement
  
  def getMap(): Map_
  
  def getOverflow(): visible | hidden
  
  def getZIndex(): Double
}
object IPane {
  
  inline def apply(
    destroy: Callback,
    events: IEventManager[js.Object],
    getElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map_],
    getOverflow: CallbackTo[visible | hidden],
    getZIndex: CallbackTo[Double]
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, events = events.asInstanceOf[js.Any], getElement = getElement.toJsFn, getMap = getMap.toJsFn, getOverflow = getOverflow.toJsFn, getZIndex = getZIndex.toJsFn)
    __obj.asInstanceOf[IPane]
  }
  
  extension [Self <: IPane](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[Map_]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetOverflow(value: CallbackTo[visible | hidden]): Self = StObject.set(x, "getOverflow", value.toJsFn)
    
    inline def setGetZIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getZIndex", value.toJsFn)
  }
}
