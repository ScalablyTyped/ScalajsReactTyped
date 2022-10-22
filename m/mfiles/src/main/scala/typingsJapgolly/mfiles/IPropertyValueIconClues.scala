package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueIconClues extends StObject {
  
  def Clone(): IPropertyValueIconClues
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValueIconClue
}
object IPropertyValueIconClues {
  
  inline def apply(Clone: CallbackTo[IPropertyValueIconClues], Count: Double, Item: Double => IPropertyValueIconClue): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
  
  extension [Self <: IPropertyValueIconClues](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValueIconClues]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyValueIconClue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
