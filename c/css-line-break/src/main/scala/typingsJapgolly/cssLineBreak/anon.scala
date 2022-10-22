package typingsJapgolly.cssLineBreak

import typingsJapgolly.cssLineBreak.cssLineBreakBooleans.`false`
import typingsJapgolly.cssLineBreak.cssLineBreakBooleans.`true`
import typingsJapgolly.cssLineBreak.distTypesLineBreakMod.Break
import typingsJapgolly.cssLineBreak.distTypesLineBreakMod.LineBreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done
    extends StObject
       with LineBreak {
    
    var done: `true`
    
    var value: Null
  }
  object Done {
    
    inline def apply(value: Null): Done = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value
    extends StObject
       with LineBreak {
    
    var done: `false`
    
    var value: Break
  }
  object Value {
    
    inline def apply(value: Break): Value = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Break): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
