package typingsJapgolly.jsonpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Floats extends StObject {
    
    var floats: js.Array[Double]
    
    var integers: js.Array[Double]
    
    var strings: js.Array[String]
  }
  object Floats {
    
    inline def apply(floats: js.Array[Double], integers: js.Array[Double], strings: js.Array[String]): Floats = {
      val __obj = js.Dynamic.literal(floats = floats.asInstanceOf[js.Any], integers = integers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Floats]
    }
    
    extension [Self <: Floats](x: Self) {
      
      inline def setFloats(value: js.Array[Double]): Self = StObject.set(x, "floats", value.asInstanceOf[js.Any])
      
      inline def setFloatsVarargs(value: Double*): Self = StObject.set(x, "floats", js.Array(value*))
      
      inline def setIntegers(value: js.Array[Double]): Self = StObject.set(x, "integers", value.asInstanceOf[js.Any])
      
      inline def setIntegersVarargs(value: Double*): Self = StObject.set(x, "integers", js.Array(value*))
      
      inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var `type`: String
  }
  object Index {
    
    inline def apply(index: Double, `type`: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
