package typingsJapgolly.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextExecution extends StObject {
  
  var nextExecution: js.Function
}
object NextExecution {
  
  inline def apply(nextExecution: js.Function): NextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextExecution]
  }
  
  extension [Self <: NextExecution](x: Self) {
    
    inline def setNextExecution(value: js.Function): Self = StObject.set(x, "nextExecution", value.asInstanceOf[js.Any])
  }
}
