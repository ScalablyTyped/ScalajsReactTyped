package typingsJapgolly.hapiPinpoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object location {
    
    trait Location extends StObject {
      
      /**
        The fully qualified filename.
        */
      val filename: String
      
      /**
        The file line number.
        */
      val line: Double
    }
    object Location {
      
      inline def apply(filename: String, line: Double): Location = {
        val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[Location]
      }
      
      extension [Self <: Location](x: Self) {
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
}
