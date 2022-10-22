package typingsJapgolly.nodeOsUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcMod {
  
  @JSImport("node-os-utils/lib/proc", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Proc {
    
    /* CompleteClass */
    override def totalProcesses(): js.Promise[Double | String] = js.native
    
    /* CompleteClass */
    override def zombieProcesses(): js.Promise[Double | String] = js.native
  }
  
  trait Proc extends StObject {
    
    def totalProcesses(): js.Promise[Double | String]
    
    def zombieProcesses(): js.Promise[Double | String]
  }
  object Proc {
    
    inline def apply(
      totalProcesses: CallbackTo[js.Promise[Double | String]],
      zombieProcesses: CallbackTo[js.Promise[Double | String]]
    ): Proc = {
      val __obj = js.Dynamic.literal(totalProcesses = totalProcesses.toJsFn, zombieProcesses = zombieProcesses.toJsFn)
      __obj.asInstanceOf[Proc]
    }
    
    extension [Self <: Proc](x: Self) {
      
      inline def setTotalProcesses(value: CallbackTo[js.Promise[Double | String]]): Self = StObject.set(x, "totalProcesses", value.toJsFn)
      
      inline def setZombieProcesses(value: CallbackTo[js.Promise[Double | String]]): Self = StObject.set(x, "zombieProcesses", value.toJsFn)
    }
  }
}
