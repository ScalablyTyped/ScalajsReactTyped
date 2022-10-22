package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataSets extends StObject {
  
  def Clone(): IDataSets
  
  val Count: Double
  
  def Item(Index: Double): IDataSet
}
object IDataSets {
  
  inline def apply(Clone: CallbackTo[IDataSets], Count: Double, Item: Double => IDataSet): IDataSets = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IDataSets]
  }
  
  extension [Self <: IDataSets](x: Self) {
    
    inline def setClone(value: CallbackTo[IDataSets]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IDataSet): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
