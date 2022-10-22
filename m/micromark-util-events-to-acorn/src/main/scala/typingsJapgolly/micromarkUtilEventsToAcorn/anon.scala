package typingsJapgolly.micromarkUtilEventsToAcorn

import typingsJapgolly.micromarkUtilEventsToAcorn.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var estree: js.UndefOr[Program] = js.undefined
    
    var swallow: Boolean
  }
  object Error {
    
    inline def apply(swallow: Boolean): Error = {
      val __obj = js.Dynamic.literal(swallow = swallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setEstree(value: Program): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
      
      inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
      
      inline def setSwallow(value: Boolean): Self = StObject.set(x, "swallow", value.asInstanceOf[js.Any])
    }
  }
}
