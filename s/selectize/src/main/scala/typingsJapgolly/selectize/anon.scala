package typingsJapgolly.selectize

import typingsJapgolly.selectize.selectizeStrings.asc
import typingsJapgolly.selectize.selectizeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction extends StObject {
    
    var direction: js.UndefOr[asc | desc] = js.undefined
    
    var field: String
  }
  object Direction {
    
    inline def apply(field: String): Direction = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
}
