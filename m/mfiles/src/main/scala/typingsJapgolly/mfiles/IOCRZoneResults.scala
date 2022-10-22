package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRZoneResults extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IOCRZoneResult
}
object IOCRZoneResults {
  
  inline def apply(Count: Double, Item: Double => IOCRZoneResult): IOCRZoneResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IOCRZoneResults]
  }
  
  extension [Self <: IOCRZoneResults](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IOCRZoneResult): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
