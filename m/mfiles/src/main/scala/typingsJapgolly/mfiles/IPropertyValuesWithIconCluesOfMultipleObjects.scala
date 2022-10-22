package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValuesWithIconCluesOfMultipleObjects extends StObject {
  
  def Clone(): IPropertyValuesWithIconCluesOfMultipleObjects
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValuesWithIconClues
}
object IPropertyValuesWithIconCluesOfMultipleObjects {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValuesWithIconCluesOfMultipleObjects],
    Count: Double,
    Item: Double => IPropertyValuesWithIconClues
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
  
  extension [Self <: IPropertyValuesWithIconCluesOfMultipleObjects](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValuesWithIconCluesOfMultipleObjects]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyValuesWithIconClues): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
