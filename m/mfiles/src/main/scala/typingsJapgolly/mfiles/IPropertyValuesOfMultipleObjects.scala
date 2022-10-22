package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValuesOfMultipleObjects extends StObject {
  
  def Clone(): IPropertyValuesOfMultipleObjects
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValues
}
object IPropertyValuesOfMultipleObjects {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValuesOfMultipleObjects],
    Count: Double,
    Item: Double => IPropertyValues
  ): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
  
  extension [Self <: IPropertyValuesOfMultipleObjects](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValuesOfMultipleObjects]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyValues): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
