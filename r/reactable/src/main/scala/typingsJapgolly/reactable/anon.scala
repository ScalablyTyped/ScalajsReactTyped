package typingsJapgolly.reactable

import typingsJapgolly.reactable.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: String
    
    var direction: SortDirection
  }
  object Column {
    
    inline def apply(column: String, direction: SortDirection): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: SortDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
}
