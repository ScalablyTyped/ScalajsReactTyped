package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClassGroups extends StObject {
  
  def Clone(): IClassGroups
  
  val Count: Double
  
  def Item(Index: Double): IClassGroup
}
object IClassGroups {
  
  inline def apply(Clone: CallbackTo[IClassGroups], Count: Double, Item: Double => IClassGroup): IClassGroups = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IClassGroups]
  }
  
  extension [Self <: IClassGroups](x: Self) {
    
    inline def setClone(value: CallbackTo[IClassGroups]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IClassGroup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
