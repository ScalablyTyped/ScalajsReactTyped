package typingsJapgolly.jsClipper

import typingsJapgolly.jsClipper.ClipperLib.Polygons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Value extends StObject {
    
    var value: Polygons
  }
  object Value {
    
    inline def apply(value: Polygons): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: Polygons): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
