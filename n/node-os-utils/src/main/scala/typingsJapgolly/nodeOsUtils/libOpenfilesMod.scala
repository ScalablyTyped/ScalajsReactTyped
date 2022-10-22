package typingsJapgolly.nodeOsUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpenfilesMod {
  
  @JSImport("node-os-utils/lib/openfiles", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenFiles {
    
    /* CompleteClass */
    override def openFd(): js.Promise[Double] = js.native
  }
  
  trait OpenFiles extends StObject {
    
    def openFd(): js.Promise[Double]
  }
  object OpenFiles {
    
    inline def apply(openFd: CallbackTo[js.Promise[Double]]): OpenFiles = {
      val __obj = js.Dynamic.literal(openFd = openFd.toJsFn)
      __obj.asInstanceOf[OpenFiles]
    }
    
    extension [Self <: OpenFiles](x: Self) {
      
      inline def setOpenFd(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "openFd", value.toJsFn)
    }
  }
}
