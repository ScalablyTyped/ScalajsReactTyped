package typingsJapgolly.webix.webix.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datafilter {
  
  type columnGroup = textFilter
  
  type dateFilter = textFilter
  
  type dateRangeFilter = textFilter
  
  type datepickerFilter = textFilter
  
  type masterCheckbox = textFilter
  
  type multiComboFilter = textFilter
  
  type multiSelectFilter = textFilter
  
  type numberFilter = textFilter
  
  type selectFilter = textFilter
  
  type serverFilter = textFilter
  
  type serverMultiSelectFilter = textFilter
  
  type serverSelectFilter = textFilter
  
  type summColumn = textFilter
  
  trait textFilter
    extends StObject
       with WebixFilter {
    
    def getInputNode(node: HTMLElement): HTMLElement
  }
  object textFilter {
    
    inline def apply(
      getInputNode: HTMLElement => HTMLElement,
      getValue: HTMLElement => Any,
      refresh: (baseview, HTMLElement, Any) => Callback,
      render: (baseview, StringDictionary[Any]) => String,
      setValue: (HTMLElement, Any) => Any
    ): textFilter = {
      val __obj = js.Dynamic.literal(getInputNode = js.Any.fromFunction1(getInputNode), getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3((t0: baseview, t1: HTMLElement, t2: Any) => (refresh(t0, t1, t2)).runNow()), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[textFilter]
    }
    
    extension [Self <: textFilter](x: Self) {
      
      inline def setGetInputNode(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getInputNode", js.Any.fromFunction1(value))
    }
  }
}
