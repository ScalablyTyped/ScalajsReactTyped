package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewChangeEvent
  extends StObject
     with ScrollViewEvent {
  
  var currentPage: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var element: js.UndefOr[JQuery] = js.undefined
  
  var nextPage: js.UndefOr[Double] = js.undefined
}
object ScrollViewChangeEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: ScrollView): ScrollViewChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangeEvent]
  }
  
  extension [Self <: ScrollViewChangeEvent](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setNextPage(value: Double): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
  }
}
