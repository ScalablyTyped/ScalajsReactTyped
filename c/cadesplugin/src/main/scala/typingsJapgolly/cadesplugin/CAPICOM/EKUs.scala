package typingsJapgolly.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EKUs extends StObject {
  
  val Count: Double
  
  def Item(index: Double): EKU
}
object EKUs {
  
  inline def apply(Count: Double, Item: Double => EKU): EKUs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[EKUs]
  }
  
  extension [Self <: EKUs](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => EKU): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
