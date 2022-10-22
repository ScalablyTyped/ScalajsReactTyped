package typingsJapgolly.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOutput extends StObject {
  
  var Count: Double
  
  var Items: js.Array[Any]
}
object QueryOutput {
  
  inline def apply(Count: Double, Items: js.Array[Any]): QueryOutput = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOutput]
  }
  
  extension [Self <: QueryOutput](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
