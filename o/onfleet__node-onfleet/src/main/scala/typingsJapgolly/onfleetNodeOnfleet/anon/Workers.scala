package typingsJapgolly.onfleetNodeOnfleet.anon

import typingsJapgolly.onfleetNodeOnfleet.resourcesWorkersMod.OnfleetWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workers extends StObject {
  
  var workers: js.Array[OnfleetWorker]
}
object Workers {
  
  inline def apply(workers: js.Array[OnfleetWorker]): Workers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workers]
  }
  
  extension [Self <: Workers](x: Self) {
    
    inline def setWorkers(value: js.Array[OnfleetWorker]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersVarargs(value: OnfleetWorker*): Self = StObject.set(x, "workers", js.Array(value*))
  }
}
