package typingsJapgolly.perfectScrollbar

import typingsJapgolly.perfectScrollbar.perfectScrollbarStrings.end
import typingsJapgolly.perfectScrollbar.perfectScrollbarStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait X extends StObject {
    
    var x: start | end | Null
    
    var y: start | end | Null
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal(x = null, y = null)
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: start | end): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXNull: Self = StObject.set(x, "x", null)
      
      inline def setY(value: start | end): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYNull: Self = StObject.set(x, "y", null)
    }
  }
}
