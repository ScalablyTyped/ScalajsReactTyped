package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedACLsAdmin extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): INamedACLAdmin
}
object INamedACLsAdmin {
  
  inline def apply(Count: Double, Item: Double => INamedACLAdmin): INamedACLsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[INamedACLsAdmin]
  }
  
  extension [Self <: INamedACLsAdmin](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => INamedACLAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
