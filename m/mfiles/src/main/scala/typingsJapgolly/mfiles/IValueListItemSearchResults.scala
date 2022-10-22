package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueListItemSearchResults extends StObject {
  
  def Add(Index: Double, ValueListItem: IValueListItem): Unit
  
  def Clone(): IValueListItemSearchResults
  
  val Count: Double
  
  def Item(Index: Double): IValueListItem
  
  var MoreResults: Boolean
  
  def Remove(Index: Double): Unit
}
object IValueListItemSearchResults {
  
  inline def apply(
    Add: (Double, IValueListItem) => Callback,
    Clone: CallbackTo[IValueListItemSearchResults],
    Count: Double,
    Item: Double => IValueListItem,
    MoreResults: Boolean,
    Remove: Double => Callback
  ): IValueListItemSearchResults = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IValueListItem) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IValueListItemSearchResults]
  }
  
  extension [Self <: IValueListItemSearchResults](x: Self) {
    
    inline def setAdd(value: (Double, IValueListItem) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IValueListItem) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IValueListItemSearchResults]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IValueListItem): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
