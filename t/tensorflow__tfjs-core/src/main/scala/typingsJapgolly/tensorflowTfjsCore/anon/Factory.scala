package typingsJapgolly.tensorflowTfjsCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def factory(): KernelBackend | js.Promise[KernelBackend]
  
  var priority: Double
}
object Factory {
  
  inline def apply(factory: CallbackTo[KernelBackend | js.Promise[KernelBackend]], priority: Double): Factory = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn, priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  
  extension [Self <: Factory](x: Self) {
    
    inline def setFactory(value: CallbackTo[KernelBackend | js.Promise[KernelBackend]]): Self = StObject.set(x, "factory", value.toJsFn)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
