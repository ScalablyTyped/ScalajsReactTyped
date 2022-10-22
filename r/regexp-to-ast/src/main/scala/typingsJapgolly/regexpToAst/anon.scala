package typingsJapgolly.regexpToAst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Begin extends StObject {
    
    var begin: Double
    
    var end: Double
  }
  object Begin {
    
    inline def apply(begin: Double, end: Double): Begin = {
      val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[Begin]
    }
    
    extension [Self <: Begin](x: Self) {
      
      inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
}
