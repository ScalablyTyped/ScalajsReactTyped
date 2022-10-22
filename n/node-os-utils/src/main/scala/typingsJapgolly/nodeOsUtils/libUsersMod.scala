package typingsJapgolly.nodeOsUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUsersMod {
  
  @JSImport("node-os-utils/lib/users", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Users {
    
    /* CompleteClass */
    override def openedCount(): js.Promise[Double | String] = js.native
  }
  
  trait Users extends StObject {
    
    def openedCount(): js.Promise[Double | String]
  }
  object Users {
    
    inline def apply(openedCount: CallbackTo[js.Promise[Double | String]]): Users = {
      val __obj = js.Dynamic.literal(openedCount = openedCount.toJsFn)
      __obj.asInstanceOf[Users]
    }
    
    extension [Self <: Users](x: Self) {
      
      inline def setOpenedCount(value: CallbackTo[js.Promise[Double | String]]): Self = StObject.set(x, "openedCount", value.toJsFn)
    }
  }
}
