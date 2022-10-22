package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomApplications extends StObject {
  
  def Clone(): ICustomApplications
  
  val Count: Double
  
  def Item(Index: Double): ICustomApplication
}
object ICustomApplications {
  
  inline def apply(Clone: CallbackTo[ICustomApplications], Count: Double, Item: Double => ICustomApplication): ICustomApplications = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[ICustomApplications]
  }
  
  extension [Self <: ICustomApplications](x: Self) {
    
    inline def setClone(value: CallbackTo[ICustomApplications]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ICustomApplication): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
