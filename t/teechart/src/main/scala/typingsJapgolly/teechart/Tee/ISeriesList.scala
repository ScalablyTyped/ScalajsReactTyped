package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeriesList extends StObject {
  
  def anyUsesAxes(): Boolean
  
  var chart: IChart
  
  def clicked(position: IPoint): Boolean
  
  //each(f: function): void;
  def firstVisible(): ISeries
  
  var items: js.Array[ISeries]
}
object ISeriesList {
  
  inline def apply(
    anyUsesAxes: CallbackTo[Boolean],
    chart: IChart,
    clicked: IPoint => Boolean,
    firstVisible: CallbackTo[ISeries],
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(anyUsesAxes = anyUsesAxes.toJsFn, chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), firstVisible = firstVisible.toJsFn, items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesList]
  }
  
  extension [Self <: ISeriesList](x: Self) {
    
    inline def setAnyUsesAxes(value: CallbackTo[Boolean]): Self = StObject.set(x, "anyUsesAxes", value.toJsFn)
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setClicked(value: IPoint => Boolean): Self = StObject.set(x, "clicked", js.Any.fromFunction1(value))
    
    inline def setFirstVisible(value: CallbackTo[ISeries]): Self = StObject.set(x, "firstVisible", value.toJsFn)
    
    inline def setItems(value: js.Array[ISeries]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ISeries*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
