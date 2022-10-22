package typingsJapgolly.awsCrt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonResourceSafetyMod {
  
  @JSImport("aws-crt/dist/common/resource_safety", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `using`[T /* <: ResourceSafe */](resource: T, func: js.Function1[/* resource */ T, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resource.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ResourceSafe extends StObject {
    
    def close(): Unit
  }
  object ResourceSafe {
    
    inline def apply(close: Callback): ResourceSafe = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[ResourceSafe]
    }
    
    extension [Self <: ResourceSafe](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
}
