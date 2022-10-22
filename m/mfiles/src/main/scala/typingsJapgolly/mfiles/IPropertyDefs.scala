package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDefs extends StObject {
  
  def Clone(): IPropertyDefs
  
  val Count: Double
  
  def Item(Index: Double): IPropertyDef
}
object IPropertyDefs {
  
  inline def apply(Clone: CallbackTo[IPropertyDefs], Count: Double, Item: Double => IPropertyDef): IPropertyDefs = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyDefs]
  }
  
  extension [Self <: IPropertyDefs](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyDefs]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IPropertyDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
