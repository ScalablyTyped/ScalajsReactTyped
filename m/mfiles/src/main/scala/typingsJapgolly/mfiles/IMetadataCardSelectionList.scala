package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardSelectionList extends StObject {
  
  def AutoSelect(identifier: String): Unit
  
  val Events: IEvents
  
  val Filter: String
  
  val FilteringValue: String
  
  val Items: Any
  
  val MoreResults: Boolean
  
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit
}
object IMetadataCardSelectionList {
  
  inline def apply(
    AutoSelect: String => Callback,
    Events: IEvents,
    Filter: String,
    FilteringValue: String,
    Items: Any,
    MoreResults: Boolean,
    SetFilter: (String, Double, Double) => Callback
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal(AutoSelect = js.Any.fromFunction1((t0: String) => AutoSelect(t0).runNow()), Events = Events.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilteringValue = FilteringValue.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], SetFilter = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (SetFilter(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
  
  extension [Self <: IMetadataCardSelectionList](x: Self) {
    
    inline def setAutoSelect(value: String => Callback): Self = StObject.set(x, "AutoSelect", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilteringValue(value: String): Self = StObject.set(x, "FilteringValue", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setSetFilter(value: (String, Double, Double) => Callback): Self = StObject.set(x, "SetFilter", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
