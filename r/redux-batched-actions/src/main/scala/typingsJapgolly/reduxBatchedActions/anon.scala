package typingsJapgolly.reduxBatchedActions

import typingsJapgolly.reduxBatchedActions.reduxBatchedActionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Batch extends StObject {
    
    var batch: `true`
  }
  object Batch {
    
    inline def apply(): Batch = {
      val __obj = js.Dynamic.literal(batch = true)
      __obj.asInstanceOf[Batch]
    }
    
    extension [Self <: Batch](x: Self) {
      
      inline def setBatch(value: `true`): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    }
  }
}
